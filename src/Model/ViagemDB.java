package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ViagemDB extends DB {

    public void inserir(Veiculo veiculo, java.util.Date dataCorrida, double distancia, double co2Emitido, Pais pais, Empresa empresa){
        try (PreparedStatement stmt = con.prepareStatement("INSERT INTO public.viagem (placa, data_corrida, distancia, co2_emitido, pais, empresa) VALUES (?, ?, ?, ?, ?, ?)")) {

            stmt.setString(1, veiculo.getPlaca());
            stmt.setDate(2, new java.sql.Date(dataCorrida.getTime()));
            stmt.setDouble(3, distancia);
            stmt.setDouble(4, co2Emitido);
            stmt.setString(5, pais.getCodigo());
            stmt.setString(6, empresa.getCodigo());

            stmt.executeUpdate();

     } catch (Exception e) {
         System.err.println("Erro ao inserir Viagem: " + e.getMessage());
     }
    }

    public int consultaCodigo(Veiculo veiculo, java.util.Date dataCorrida, double distancia, double co2Emitido, Pais pais, Empresa empresa){
        int codigo = 0;
        try (PreparedStatement stmt = con.prepareStatement("SELECT codigo FROM public.veiculo WHERE veiculo = ? AND data_corrida = ? AND distancia = ? AND co2_emitido = ? AND pais = ? AND empresa = ?")) {

            stmt.setInt(1, veiculo.getCodigo());
	        stmt.setDate(2, new java.sql.Date(dataCorrida.getTime()));
            stmt.setDouble(3, distancia);
            stmt.setDouble(4, co2Emitido);
            stmt.setString(5, pais.getCodigo());
            stmt.setString(6, empresa.getCodigo());

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    codigo = rs.getInt("codigo");
                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao buscar Viagem: " + e.getMessage());
        }

        return codigo;

    }

    public Viagem selecionar(int codigo){

        Viagem viagem = null;

        try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM public.viagem WHERE codigo = ?")) {

            Pais pais = null;
            Empresa empresa = null;
            Veiculo veiculo = null;

	        stmt.setInt(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    codigo = rs.getInt("codigo");
                    String placa = rs.getString("placa");
                    java.util.Date dataCorrida = rs.getDate("data_corrida");
                    double distancia = rs.getDouble("distancia");
                    double co2_emitido = rs.getDouble("co2_emitido");
                    String idPais = rs.getString("pais");
                    String idEmpresa = rs.getString("empresa");

                    empresa = new Empresa(idEmpresa);
                    veiculo = new Veiculo(placa);
                    pais = new Pais(idPais);

                    viagem = new Viagem(empresa, veiculo, dataCorrida, distancia, co2_emitido, pais);

                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao buscar Viagem " + codigo + ": " + e.getMessage());
        }

        return viagem;

    }

    public List<Viagem> selecionar(java.util.Date dataInicial, java.util.Date dataFinal){

        Viagem viagem = null;

        List<Viagem> viagens = new ArrayList<>();

        try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM public.viagem WHERE data_corrida >= ? AND data_corrida <= ?")) {

	        stmt.setDate(1, new java.sql.Date(dataInicial.getTime()));
	        stmt.setDate(2, new java.sql.Date(dataFinal.getTime()));

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int codigo = rs.getInt("codigo");
                    String placa = rs.getString("placa");
                    java.util.Date dataCorrida = rs.getDate("data_corrida");
                    double distancia = rs.getDouble("distancia");
                    double co2_emitido = rs.getDouble("co2_emitido");
                    String idPais = rs.getString("pais");
                    String idEmpresa = rs.getString("empresa");

                    Empresa empresa = new Empresa(idEmpresa);
                    Veiculo veiculo = new Veiculo(placa);
                    Pais pais = new Pais(idPais);

                    viagem = new Viagem(codigo, empresa, veiculo, dataCorrida, distancia, co2_emitido, pais);
                    viagens.add(viagem);

                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao buscar Viagens na data " + dataInicial + " até " + dataFinal + ": " + e.getMessage());
        }

        return viagens;

    }

}

package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViagemDB extends DB {

    public void inserir(Veiculo veiculo, java.util.Date dataCorrida, double distancia, double co2Emitido, Pais pais, Empresa empresa){
        try (PreparedStatement stmt = con.prepareStatement("INSERT INTO public.viagem (veiculo, data_corrida, distancia, co2_emitido, pais, empresa) VALUES (?, ?, ?, ?, ?, ?)")) {

            stmt.setInt(1, veiculo.getCodigo());
            stmt.setDate(2, new java.sql.Date(dataCorrida.getTime()));
            stmt.setDouble(3, distancia);
            stmt.setDouble(4, co2Emitido);
            stmt.setString(5, pais.getCodigo());
            stmt.setString(6, empresa.getCodigo());

            stmt.executeUpdate();
            System.out.println("Inserido com sucesso!");

     } catch (Exception e) {
         System.err.println("Erro ao inserir empresa: " + e.getMessage());
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

}

package Model;

import java.sql.*;

public class VeiculoDB extends DB {
    
    public void inserir(Modelo modelo, String ano, String placa, Combustivel combustivel, double mediaKmL, Empresa empresa){
        try (PreparedStatement stmt = con.prepareStatement("INSERT INTO public.veiculo (modelo, ano, placa, combustivel, mediaKmL, empresa) VALUES (?, ?, ?, ?, ?, ?)")) {

            stmt.setInt(1, modelo.getCodigo());
            stmt.setString(2, ano);
            stmt.setString(3, placa);
            stmt.setInt(4, combustivel.getCodigo());
            stmt.setDouble(5, mediaKmL);
            stmt.setString(6, empresa.getCodigo());

            stmt.executeUpdate();

     } catch (Exception e) {
         System.err.println("Erro ao inserir Veiculo " + placa + ": " + e.getMessage());
     }
    }

    public int consultaCodigo(String placa){
        int codigo = 0;
        try (PreparedStatement stmt = con.prepareStatement("SELECT codigo FROM public.veiculo WHERE placa = ?")) {

            stmt.setString(1, placa);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    codigo = rs.getInt("codigo");
                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao buscar Veiculo " + codigo + ": " + e.getMessage());
        }

        return codigo;

    }

    public Veiculo selecionar(String placa){
        Veiculo veiculo = null;

        String idEmpresa = null;
        int idCombustivel = 0;

        int codigo = 0;
        int idModelo = 0;
        String ano = null;
        double mediaKmL = 0.00;

        Empresa empresa = null;
        Marca marca = null;
        Modelo modelo = null;
        Combustivel combustivel = null;

        try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM public.veiculo WHERE placa = ? ")) {

            stmt.setString(1, placa);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    codigo = rs.getInt("codigo");
                    idModelo = rs.getInt("modelo");
                    ano = rs.getString("ano");
                    placa = rs.getString("placa");
                    idCombustivel = rs.getInt("combustivel");
                    mediaKmL = rs.getDouble("mediakml");
                    idEmpresa = rs.getString("empresa");
                }
            }

            modelo = new Modelo(idModelo);
            marca = new Marca(modelo.getMarca().getCodigo());
            empresa = new Empresa(idEmpresa);
            combustivel = new Combustivel(idCombustivel);

            veiculo = new Veiculo(codigo, placa, modelo, marca, ano, combustivel, mediaKmL, empresa);

        } catch (Exception e) {
            System.err.println("Erro ao buscar Veiculo " + codigo + ": " + e.getMessage());
        }

        return veiculo;

    }

}

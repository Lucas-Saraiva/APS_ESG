package Model;

import java.sql.*;

public class VeiculoDB extends DB {
    
    public void inserir(int modelo, String ano, String placa, Combustivel combustivel, double mediaKmL, Empresa empresa){
        try (PreparedStatement stmt = con.prepareStatement("INSERT INTO public.veiculo (modelo, ano, placa, combustivel, mediaKmL, empresa) VALUES (?, ?, ?, ?, ?, ?)")) {

            stmt.setInt(1, modelo);
            stmt.setString(2, ano);
            stmt.setString(3, placa);
            stmt.setInt(4, combustivel.getCodigo());
            stmt.setDouble(5, mediaKmL);
            stmt.setString(6, empresa.getCodigo());

            stmt.executeUpdate();
            System.out.println("Inserido com sucesso!");

     } catch (Exception e) {
         System.err.println("Erro ao inserir Veiculo: " + e.getMessage());
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
            System.err.println("Erro ao buscar Veiculo: " + e.getMessage());
        }

        return codigo;
    }

}

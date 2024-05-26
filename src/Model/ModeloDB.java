package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ModeloDB extends DB {
    
    public String consultaCodigo(int codigo){

        String nome = null;

        try (PreparedStatement stmt = con.prepareStatement("SELECT nome FROM public.modelo WHERE codigo = ?")) {

            stmt.setInt(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nome = rs.getString("nome");
                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao buscar Modelo " + codigo + ": " + e.getMessage());
        }

        return nome;

    }

    public int consultaCodigoMarca(int codigo){

        int marca = 0;

        try (PreparedStatement stmt = con.prepareStatement("SELECT marca FROM public.modelo WHERE codigo = ?")) {

            stmt.setInt(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    marca = rs.getInt("marca");
                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao buscar Modelo " + codigo + ": " + e.getMessage());
        }

        return marca;

    }

}

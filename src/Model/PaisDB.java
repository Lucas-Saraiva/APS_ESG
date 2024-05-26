package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PaisDB extends DB {
    
    public String consultaCodigo(String codigo){

        String nome = null;

        try (PreparedStatement stmt = con.prepareStatement("SELECT nome FROM public.pais WHERE codigo = ?")) {

            stmt.setString(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nome = rs.getString("nome");
                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao buscar País " + codigo + ": " + e.getMessage());
        }

        return nome;

    }

}

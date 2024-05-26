package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarcaDB extends DB {
    
    public String consultaCodigo(int codigo){

        String nome = null;

        try (PreparedStatement stmt = con.prepareStatement("SELECT nome FROM public.marca WHERE codigo = ?")) {

            stmt.setInt(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nome = rs.getString("nome");
                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao buscar Marca: " + e.getMessage());
        }

        return nome;
    }

    public Marca selecionar(int codigo){

        Marca marca = null;
        String nome = null;

        try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM public.marca WHERE codigo = ?")) {

            stmt.setInt(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    codigo = rs.getInt("codigo");
                    nome = rs.getString("nome");
                }
            }

            marca = new Marca(codigo);

        } catch (Exception e) {
            System.err.println("Erro ao buscar Marca: " + e.getMessage());
        }

        return marca;

    }

}

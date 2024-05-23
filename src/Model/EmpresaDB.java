package Model;

import java.sql.*;

public class EmpresaDB extends DB {

	public void inserir(String codigo, String nome, String cnpj, java.util.Date date, java.util.Date date2, String meta, String indicador) {
	   try (PreparedStatement stmt = con.prepareStatement("INSERT INTO public.empresa (codigo, nome, cnpj, data_inicio, data_final, meta, indicador) VALUES (?, ?, ?, ?, ?, ?, ?)")) {

		   	stmt.setString(1, codigo);
	        stmt.setString(2, nome);
	        stmt.setString(3, cnpj);
	        stmt.setDate(4, new java.sql.Date(date.getTime()));
	        stmt.setDate(5, new java.sql.Date(date2.getTime()));
	        stmt.setString(6, meta);
	        stmt.setString(7, indicador);

	        stmt.executeUpdate();
	        System.out.println("Inserido com sucesso!");

	    } catch (Exception e) {
	        System.err.println("Erro ao inserir empresa: " + e.getMessage());
	    }

	}

}

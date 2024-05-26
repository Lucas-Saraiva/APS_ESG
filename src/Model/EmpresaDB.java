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

	public Empresa selecionar(String codigo){
        Empresa empresa = null;

		String cnpj = null;
		String nome = null;
		Date dataInicio = null;
		Date dataFinal = null;
		String meta = null;
		String indicador = null;

        try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM public.empresa WHERE codigo = ? ")) {

            stmt.setString(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    codigo = rs.getString("codigo");
                    nome = rs.getString("nome");
                    cnpj = rs.getString("cnpj");
                    dataInicio = rs.getDate("data_inicio");
                    dataFinal = rs.getDate("data_final");
                    meta = rs.getString("meta");
                    indicador = rs.getString("indicador");
                }
            }

            empresa = new Empresa(codigo, cnpj, nome, dataInicio, dataFinal, meta, indicador);

        } catch (Exception e) {
            System.err.println("Erro ao buscar Viagem: " + e.getMessage());
        }
        return empresa;
    }

}

package Model;

import java.sql.*;

public abstract class DB {

	protected String url = "jdbc:postgresql://localhost:5432/APS";
	protected String usuario = "postgres";
	protected String senha = "b4ncoPG$";
	protected Connection con;

    public void conexao() {
        try {
            Class.forName("org.postgresql.Driver");
            this.con = DriverManager.getConnection(this.getUrl(), this.getUsuario(), this.getSenha());
            System.out.println("Sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void inserir(){

    };

    public void consultaCodigo() {

    }

    public String getUrl() {
    	return this.url;
    }

    public String getUsuario() {
    	return this.usuario;
    }

    public String getSenha() {
    	return this.senha;
    }

}

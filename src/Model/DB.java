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
            con = DriverManager.getConnection(this.getUrl(), this.getUsuario(), this.getSenha());
            System.out.println("Conexão realizada!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fecha(){
        if (con != null) {
            try {
                if (!con.isClosed()) {
                    con.close();
                    System.out.println("Conexão fechada com sucesso.");
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }

    public void inserir(){

    }

    public void consultaCodigo() {

    }

    public void selecionar(){

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

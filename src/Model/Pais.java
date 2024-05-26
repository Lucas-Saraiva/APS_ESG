package Model;	

public class Pais {

	private String codigo;
	private String nome;

	public Pais(String codigo) {
		this.codigo = codigo;

		PaisDB paisDB = new PaisDB();
		paisDB.conexao();
		this.setNome(paisDB.consultaCodigo(codigo));
		paisDB.fecha();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public static void main(String[] args){

		Pais pais = new Pais("BR");
		System.out.println(pais.getNome());

	}

}

package Model;	

public class Combustivel {

	private int codigo;
	private String nome;

	public Combustivel(int codigo) {
		this.codigo = codigo;

		CombustivelDB combustivelDB = new CombustivelDB();
		combustivelDB.conexao();
		this.setNome(combustivelDB.consultaCodigo(this.codigo));
		combustivelDB.fecha();

	}

	public String getNome() {
		return this.nome;
	}

    public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public static void main(String[] args){

		Combustivel combustivel = new Combustivel(3);

		System.out.println(combustivel.getNome());

	}

}

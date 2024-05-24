 package Model;

public class Veiculo {

	private int codigo;
	private String placa;
	private int modelo;
	private int marca;
	private String ano;
	private Combustivel combustivel;
	private double mediaKML;

	public Veiculo(String placa, int modelo, int marca, String ano, Combustivel combustivel, double mediaKML) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.combustivel = combustivel;
		this.mediaKML = mediaKML;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getModelo() {
		return this.modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getMarca() {
		return this.marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public String getAno() {
		return this.ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Combustivel getCombustivel() {
		return this.combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	
	public double getMediaKML() {
		return this.mediaKML;
	}

	public void setMediaKML(double mediaKmL) {
		this.mediaKML = mediaKmL;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}

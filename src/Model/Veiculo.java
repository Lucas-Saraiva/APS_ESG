 package Model;

public class Veiculo {

	private String placa;
	private String modelo;
	private String marca;
	private String ano;
	private String combustivel;
	private double mediaKML;

	public Veiculo(String placa, String modelo, String marca, String ano, String combustivel, double mediaKML) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.combustivel = combustivel;
		this.mediaKML = mediaKML;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAno() {
		return this.ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCombustivel() {
		return this.combustivel;
	}

	public void setCombustivel(String combustivel) {
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

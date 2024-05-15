 package Model;

public class Veiculo {

	private String modelo;
	private String marca;
	private int ano;
	private String combustivel;
	private double mediaKML;

	public Veiculo(String modelo, String marca, int ano, String combustivel, double mediaKML) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.combustivel = combustivel;
		this.mediaKML = mediaKML;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public int getAno() {
		return this.ano;
	}

	public String getCombustivel() {
		return this.combustivel;
	}

	public double getMediaKML() {
		return this.mediaKML;
	}

}

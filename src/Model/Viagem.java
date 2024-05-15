package Model;

import java.util.Date;

public class Viagem {

	private Veiculo Veiculo;
	private Date dataCorrida;
	private double distancia;
	private double duracao;
	private double co2Emitido;
	private Pais pais;

	public Viagem(Veiculo Veiculo, double distancia, double duracao, double co2Emitido, Pais pais) {
		this.Veiculo = Veiculo;
		this.distancia = distancia;
		this.duracao = duracao;
		this.pais = pais;
	}

	public Veiculo getMotorista() {
		return this.Veiculo;
	}

	public Date getDataCorrida() {
		return this.dataCorrida;
	}

	public double getDistancia() {
		return this.distancia;
	}

	public double getDuracao() {
		return this.duracao;
	}

	public double getCo2Emitido() {
		return this.co2Emitido;
	}

	public Pais getPais() {
		return this.pais;
	}

	public double calculaCO2Emitido() {

		double co2Emitido;

		co2Emitido = this.Veiculo.getMediaKML() * this.distancia;

		return co2Emitido;

	}

}

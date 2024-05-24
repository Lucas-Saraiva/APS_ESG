package Model;

import java.util.Date;

public class Viagem {

	private int codigo;
	private Empresa empresa;
	private Veiculo veiculo;
	private Date dataCorrida;
	private double distancia;
	private double co2Emitido;
	private Pais pais;

	public Viagem(Empresa empresa, Veiculo Veiculo, Date dataCorrida, double distancia, Pais pais) {
		this.setEmpresa(empresa);
		this.setVeiculo(veiculo);
		this.setDataCorrida(dataCorrida);
		this.setDistancia(distancia);
		this.setCo2Emitido(co2Emitido);
		this.setPais(pais);
	}


	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Veiculo getVeiculo() {
		return this.veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Date getDataCorrida() {
		return this.dataCorrida;
	}

	public void setDataCorrida(Date dataCorrida) {
		this.dataCorrida = dataCorrida;
	}

	public double getDistancia() {
		return this.distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getCo2Emitido() {
		return this.co2Emitido;
	}

	public void setCo2Emitido(double co2Emitido) {
		this.co2Emitido = co2Emitido;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public void calculaCo2Emitido() {
		System.out.println(((this.getDistancia() / this.getVeiculo().getMediaKML()) * 2.3 ) / 1000 );
	}

}

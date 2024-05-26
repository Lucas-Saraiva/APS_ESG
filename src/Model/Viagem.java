package Model;

import java.text.ParseException;
// import java.util.ArrayList;
// import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Viagem {

	private int codigo;
	private Empresa empresa;
	private Veiculo veiculo;
	private Date dataCorrida;
	private double distancia;
	private double co2Emitido;
	private Pais pais;

	public Viagem(int codigo){

		Viagem viagem = null;

		this.setCodigo(codigo);

		ViagemDB viagemDB = new ViagemDB();
		viagem = viagemDB.selecionar(codigo);

		this.setCodigo(viagem.getCodigo());
		this.setEmpresa(viagem.getEmpresa());
		this.setVeiculo(viagem.getVeiculo());
		this.setDataCorrida(viagem.getDataCorrida());
		this.setDistancia(viagem.getDistancia());
		this.setCo2Emitido(viagem.getCo2Emitido());
		this.setPais(viagem.getPais());

	}

	public Viagem(int codigo, Empresa empresa, Veiculo veiculo, Date dataCorrida, double distancia, double co2Emitido, Pais pais) {
		this.setCodigo(codigo);
		this.setEmpresa(empresa);
		this.setVeiculo(veiculo);
		this.setDataCorrida(dataCorrida);
		this.setDistancia(distancia);
		this.setCo2Emitido(co2Emitido);
		this.setPais(pais);
	}

	public Viagem(Empresa empresa, Veiculo veiculo, Date dataCorrida, double distancia, double co2Emitido, Pais pais) {
		this.setEmpresa(empresa);
		this.setVeiculo(veiculo);
		this.setDataCorrida(dataCorrida);
		this.setDistancia(distancia);
		this.setCo2Emitido(co2Emitido);
		this.setPais(pais);
	}

	public Viagem(Empresa empresa, Veiculo veiculo, Date dataCorrida, double distancia, Pais pais) {
		this.setEmpresa(empresa);
		this.setVeiculo(veiculo);
		this.setDataCorrida(dataCorrida);
		this.setDistancia(distancia);
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
		return this.calculaCo2Emitido();
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

	public double calculaCo2Emitido() {
		return ((this.getDistancia() / this.getVeiculo().getMediaKML()) * 2.3 ) / 1000;
	}

    public static void main (String[] args) throws ParseException{

		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Date dataInicial = sdf.parse("20/05/2024");
		Date dataFinal = new Date();

		ViagemDB viagemDB = new ViagemDB();
		viagemDB.conexao();

		Empresa empresa = new Empresa("UBER");
		Veiculo veiculo = new Veiculo("CG3Y2I");
		Pais pais = new Pais("BR");

		Viagem viagem = new Viagem(empresa, veiculo, dataFinal, 270.00, pais);

		viagemDB.inserir(viagem.getVeiculo(), viagem.getDataCorrida(), viagem.getDistancia(), viagem.getCo2Emitido(), viagem.getPais(), viagem.getEmpresa());

		// viagemDB.selecionar(dataInicial, dataFinal);
		// viagemDB.selecionar();

		List<Viagem> viagens = viagemDB.selecionar(dataFinal, dataFinal);

		for ( Viagem viageml : viagens ){
			System.out.println(viageml.getCodigo());
		}

		// System.out.println(viagem.getDistancia());

		viagemDB.fecha();

	}

}

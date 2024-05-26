 package Model;

public class Veiculo {

	private int codigo;
	private String placa;
	private Modelo modelo;
	private Marca marca;
	private String ano;
	private Combustivel combustivel;
	private double mediaKML;
	private Empresa empresa;

	public Veiculo(String placa, Modelo modelo, Marca marca, String ano, Combustivel combustivel, double mediaKML, Empresa empresa) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.combustivel = combustivel;
		this.mediaKML = mediaKML;
		this.empresa = empresa;
	}

	public Veiculo(int codigo, String placa, Modelo modelo, Marca marca, String ano, Combustivel combustivel, double mediaKML, Empresa empresa) {
		this.codigo = codigo;
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.combustivel = combustivel;
		this.mediaKML = mediaKML;
		this.empresa = empresa;
	}

	public Veiculo(String placa){

		Veiculo veiculo = null;

		VeiculoDB veiculoDB = new VeiculoDB();
		veiculoDB.conexao();
		veiculo = veiculoDB.selecionar(placa);
		veiculoDB.fecha();
		this.setCodigo(veiculo.getCodigo());
		this.setPlaca(veiculo.getPlaca());
		this.setModelo(veiculo.getModelo());
		this.setMarca(veiculo.getMarca());
		this.setAno(veiculo.getAno());
		this.setCombustivel(veiculo.getCombustivel());
		this.setMediaKML(veiculo.getMediaKML());
		this.setEmpresa(veiculo.getEmpresa());

	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Modelo getModelo() {
		return this.modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
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
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public static void main(String[] args){

		Veiculo veiculo = new Veiculo("CG3Y2I");

		System.out.println(veiculo.getCodigo());

	}

}

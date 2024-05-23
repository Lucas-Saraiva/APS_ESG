package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empresa {
	
	private String codigo;
	private String cnpj;
	private String nome;
	private Date dataInicio;
	private Date dataFinal;
	private List<Pais> paises;
	private List<Veiculo> veiculos;
	private List<Viagem> viagens;
	private String meta;
	private String indicador;

	public Empresa(String codigo, String cnpj, String nome, Date dataInicio, Date dataFinal, String meta, String indicador ) {
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.meta = meta;
		this.indicador = indicador;
		this.paises = new ArrayList<>();
		this.veiculos = new ArrayList<>();
		this.viagens = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getDataInicio() {
		return this.dataInicio;
	}

	public Date getDataFinal() {
		return this.dataFinal;
	}

	public void adicionaPais(Pais pais) {
		this.paises.add(pais);
	}

	public void listarPais() {
        System.out.println("Países de atuação da empresa " + nome + ":");
        for (Pais pais : this.paises) {
            System.out.println(pais.getNome());
        }
	}

	public void adicionaVeiculo(Veiculo veiculo) {
		this.veiculos.add(veiculo);
	}

	public void listarVeiculos() {
        System.out.println("Carros Cadastrados na empresa: ");
        for (Veiculo veiculo : this.veiculos) {
            System.out.println(veiculo.getPlaca());
        }
	}

	public void adicionaViagem(Viagem viagem) {
		this.viagens.add(viagem);
	}

	public void listarViagens() {
        System.out.println("Viagens Realizadas na Empresa: ");
        for (Viagem viagem : this.viagens) {
            System.out.println(viagem.getDataCorrida());
        }
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public String getIndicador() {
		return indicador;
	}

	public void setIndicador(String indicadores) {
		this.indicador = indicadores;
	}

}

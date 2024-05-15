package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empresa {
	
	private String nome;
	private Date dataInicio;
	private Date dataFinal;
	private double porcentagem;
	private List<Veiculo> veiculos;
	private List<Viagem> viagens;
	private List<Pais> paises;
	private List<Indicador> indicadores;

	public Empresa(String nome, double porcentagem) {
		this.nome = nome;
		this.porcentagem = porcentagem;
		this.veiculos = new ArrayList<>();
		this.viagens = new ArrayList<>();
		this.paises = new ArrayList<>();
		this.indicadores = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public Date getDataInicio() {
		return this.dataInicio;
	}

	public Date getDataFinal() {
		return this.dataFinal;
	}

	public double getPorcentagem() {
		return this.porcentagem;
	}

	public void listaViagens() {
		System.out.println("Modelo;Distância;Duração");
		for (Viagem viagem: this.viagens) {
			System.out.print(viagem.getMotorista().getModelo());
			System.out.print(viagem.getDistancia());
			System.out.println(viagem.getDuracao());
		}
	}

	public void listaVeiculos() {
		System.out.println("Modelo;Marca");
		for (Veiculo veiculo: this.veiculos) {
			System.out.print(veiculo.getModelo());
			System.out.println(veiculo.getMarca());
		}
	}

	public void adicionaViagem(Viagem viagem) {
		this.viagens.add(viagem);
	}

	public void adicionaVeiculo(Veiculo veiculo) {
		this.veiculos.add(veiculo);
	}

	public void adicionaPais(Pais pais) {
		this.paises.add(pais);
	}

	public void adicionaIndicador(Indicador indicador) {
		this.indicadores.add(indicador);
	}

}

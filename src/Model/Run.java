package Model;

import java.util.Date;

public class Run {

	public static void main(String[] args) {

		Date dataAtual = new Date();

		Empresa uber = new Empresa("UBER", "39528420492942", "Uber", dataAtual, dataAtual, "Redução de Gás Carbonico", "Ambiental");

		System.out.println(uber.getNome());

		Pais brasil = new Pais("BR", "Brasil");
		Pais usa = new Pais("US", "Estados Unidos das Américas");
		Pais canada = new Pais("CA", "Canadá");

		uber.adicionaPais(brasil);
		uber.adicionaPais(usa);
		uber.adicionaPais(canada);

		uber.listarPais();

		Veiculo veiculo = new Veiculo("CG3Y2I", "Onix", "Chevrolet", "2018", "1", 12.00);

		uber.adicionaVeiculo(veiculo);

		uber.listarVeiculos();

		Viagem viagem = new Viagem(uber, veiculo, dataAtual, 100.00, brasil);

		uber.adicionaViagem(viagem);
		uber.listarViagens();

		EmpresaDB db = new EmpresaDB();
		
		db.conexao();
		
		db.inserir(uber.getCodigo(), uber.getNome(), uber.getCnpj(), uber.getDataInicio(), uber.getDataFinal(), uber.getMeta(), uber.getIndicador());

	}

}

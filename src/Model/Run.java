package Model;

public class Run {

	public static void main(String[] args) {

		Empresa empresa = new Empresa("Uber", 100);

		Pais pais = new Pais("Estado Unidos");

		Veiculo veiculo1 = new Veiculo("Onix", "Chevrolet", 2018, "Gasolina", 14);
		Veiculo veiculo2 = new Veiculo("HB20", "Hyundai", 2020, "Gasolina", 12);
		Veiculo veiculo3 = new Veiculo("Corsa", "Chevrolet", 2011, "Gasolina", 8);

		empresa.adicionaVeiculo(veiculo1);
		empresa.adicionaVeiculo(veiculo2);
		empresa.adicionaVeiculo(veiculo3);

		Viagem viagem = new Viagem(veiculo1, 10.0, 13.0, 18.0, pais);
		Viagem viagem2 = new Viagem(veiculo2, 30.0, 16.0, 13.0, pais);
		Viagem viagem3 = new Viagem(veiculo3, 96.0, 11.0, 14.0, pais);

		empresa.adicionaViagem(viagem);
		empresa.adicionaViagem(viagem2);
		empresa.adicionaViagem(viagem3);
		
		System.out.println(viagem.calculaCO2Emitido());

//		empresa.listaVeiculos();
//		empresa.listaViagens();

	}

}

package controller;

import Model.VeiculoDB;

public class ControllerCadastroVeiculo {
    
    public void salvarVeiculo(int modelo, String ano, String placa, int combustivel, double mediaKmL, String empresa){

        VeiculoDB veiculoDB = new VeiculoDB();
        veiculoDB.conexao();
        veiculoDB.inserir(modelo, ano, placa, combustivel, mediaKmL, empresa);
        veiculoDB.fecha();

    }

}

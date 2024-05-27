package controller;

import Model.ViagemDB;

public class ControllerCadastroViagem {

    public void salvarViagem(String placa, java.util.Date dataCorrida, double distancia, double co2Emitido, String pais, String empresa){

        ViagemDB viagemDB = new ViagemDB();
        viagemDB.conexao();
        viagemDB.inserir(placa, dataCorrida, distancia, co2Emitido, pais, empresa);
        viagemDB.fecha();

    }
    
}

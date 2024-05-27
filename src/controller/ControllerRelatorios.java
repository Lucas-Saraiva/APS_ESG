package controller;

import java.util.List;
import Model.Viagem;
import Model.ViagemDB;

public class ControllerRelatorios {
    
    public List<Viagem> dadosRelatorios(){

        java.util.Date data = new java.util.Date();

        ViagemDB viagemDB = new ViagemDB();
        viagemDB.conexao();

        List<Viagem> viagens = viagemDB.selecionar(data, data);

        return viagens;

    }

}

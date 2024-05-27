package controller;

import java.util.List;
import Model.Viagem;
import Model.ViagemDB;

public class ControllerRelatorios {
    
    public List<Viagem> dadosRelatorios(java.util.Date dataInicial, java.util.Date dataFinal){

        ViagemDB viagemDB = new ViagemDB();
        viagemDB.conexao();

        List<Viagem> viagens = viagemDB.selecionar(dataInicial, dataFinal);

        return viagens;

    }

}

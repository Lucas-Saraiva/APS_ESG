package view;

import java.util.List;

import javax.swing.JFrame;

import Model.Viagem;
import controller.ControllerRelatorios;

public class TelaRelatorios extends JFrame {

    private ControllerRelatorios controller;

    public TelaRelatorios(){
        this.controller = new ControllerRelatorios();
    }

    public void apresentaRelatorios(){

        List<Viagem> viagens = this.controller.dadosRelatorios();


    }

}

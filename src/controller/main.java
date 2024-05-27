package controller;

import javax.swing.JFrame;

import view.TelaInicial;

public class main {

     public static void main(String[] args){

        TelaInicial tela = new TelaInicial();

        JFrame frame = new JFrame("Tela Ínicial");
        frame.setContentPane(tela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}

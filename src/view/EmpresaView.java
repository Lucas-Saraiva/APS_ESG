package view;

import javax.swing.*;
import Model.Empresa;

public class EmpresaView extends JFrame {
	
	private JTextField nomeEmpresa;

    public EmpresaView() {
        setTitle("Empresas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel empresaLabel = new JLabel("Empresa:");
        nomeEmpresa = new JTextField();
        panel.add(empresaLabel);
        panel.add(nomeEmpresa);

        add(panel);
        setVisible(true);
    }
	
	public static void main(String[] args) {
		EmpresaView view = new EmpresaView();
	}

}

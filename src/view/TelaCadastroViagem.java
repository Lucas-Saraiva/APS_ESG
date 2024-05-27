package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaCadastroViagem extends javax.swing.JPanel {

    public TelaCadastroViagem() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        textoDtCorridaViagem = new javax.swing.JLabel();
        textoDistanciaPercViagem = new javax.swing.JLabel();
        campoDistanciaPercViagem = new javax.swing.JTextField();
        campoDtCorridaViagem = new javax.swing.JTextField();
        textoEmpresaViagem = new javax.swing.JLabel();
        textoPaisViagem = new javax.swing.JLabel();
        campoEmpresaViagem = new javax.swing.JTextField();
        campoPaisViagem = new javax.swing.JTextField();
        btnLimparViagem = new javax.swing.JButton();
        btnSalvarViagem = new javax.swing.JButton();
        textoPaisViagem1 = new javax.swing.JLabel();
        campoPlacaVeiculo = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(400, 400));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        Titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Titulo.setText("Cadastro de Viagem");

        textoDtCorridaViagem.setText("Data da Corrida:");

        textoDistanciaPercViagem.setText("Distância Percorrida:");

        campoDistanciaPercViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDistanciaPercViagemActionPerformed(evt);
            }
        });

        campoDtCorridaViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDtCorridaViagemActionPerformed(evt);
            }
        });

        textoEmpresaViagem.setText("Empresa:");

        textoPaisViagem.setText("País:");

        campoEmpresaViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmpresaViagemActionPerformed(evt);
            }
        });

        campoPaisViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPaisViagemActionPerformed(evt);
            }
        });

        btnLimparViagem.setText("Limpar");
        btnLimparViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparViagemActionPerformed(evt);
            }
        });

        btnSalvarViagem.setText("Salvar");
        btnSalvarViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarViagemActionPerformed(evt);
            }
        });

        textoPaisViagem1.setText("Placa:");

        campoPlacaVeiculo.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoPaisViagem1)
                            .addComponent(textoEmpresaViagem))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEmpresaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoDistanciaPercViagem)
                            .addComponent(textoPaisViagem)
                            .addComponent(textoDtCorridaViagem)
                            .addComponent(btnSalvarViagem, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDistanciaPercViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPaisViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimparViagem)
                            .addComponent(campoDtCorridaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEmpresaViagem)
                    .addComponent(campoEmpresaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPaisViagem1)
                    .addComponent(campoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPaisViagem)
                    .addComponent(campoPaisViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDtCorridaViagem)
                    .addComponent(campoDtCorridaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDistanciaPercViagem)
                    .addComponent(campoDistanciaPercViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarViagem)
                    .addComponent(btnLimparViagem))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoDistanciaPercViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDistanciaPercViagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDistanciaPercViagemActionPerformed

    private void campoEmpresaViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmpresaViagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmpresaViagemActionPerformed

    private void campoPaisViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPaisViagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPaisViagemActionPerformed

    private void campoDtCorridaViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDtCorridaViagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDtCorridaViagemActionPerformed

    private void btnLimparViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparViagemActionPerformed
        campoDistanciaPercViagem.setText("");
        campoDtCorridaViagem.setText("");
        campoEmpresaViagem.setText("");
        campoPaisViagem.setText("");
    }//GEN-LAST:event_btnLimparViagemActionPerformed

    private void btnSalvarViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarViagemActionPerformed
        String distanciaPercViagem = campoDistanciaPercViagem.getText();
        String empresaViagem = campoEmpresaViagem.getText();
        String paisViagem = campoPaisViagem.getText();
        Date dtCorridaViagem = null;
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dtCorridaViagem = formatador.parse(campoDtCorridaViagem.getText());
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroEmpresa.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }//GEN-LAST:event_btnSalvarViagemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnLimparViagem;
    private javax.swing.JButton btnSalvarViagem;
    private javax.swing.JTextField campoDistanciaPercViagem;
    private javax.swing.JTextField campoDtCorridaViagem;
    private javax.swing.JTextField campoEmpresaViagem;
    private javax.swing.JTextField campoPaisViagem;
    private javax.swing.JTextField campoPlacaVeiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoDistanciaPercViagem;
    private javax.swing.JLabel textoDtCorridaViagem;
    private javax.swing.JLabel textoEmpresaViagem;
    private javax.swing.JLabel textoPaisViagem;
    private javax.swing.JLabel textoPaisViagem1;
    // End of variables declaration//GEN-END:variables
}

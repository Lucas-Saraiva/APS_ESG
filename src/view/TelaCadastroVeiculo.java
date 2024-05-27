package view;

import controller.ControllerCadastroVeiculo;

public class TelaCadastroVeiculo extends javax.swing.JPanel {

    private ControllerCadastroVeiculo controller;

    public TelaCadastroVeiculo() {
        initComponents();
        this.controller = new ControllerCadastroVeiculo();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        textoModeloVeiculo = new javax.swing.JLabel();
        textoAnoVeiculo = new javax.swing.JLabel();
        textoPlacaVeiculo = new javax.swing.JLabel();
        textoCombustivelVeiculo = new javax.swing.JLabel();
        textoMediaKmLVeiculo = new javax.swing.JLabel();
        textoCodEmpresaVeiculo = new javax.swing.JLabel();
        campoAnoVeiculo = new javax.swing.JTextField();
        campoPlacaVeiculo = new javax.swing.JTextField();
        campoCombustivelVeiculo = new javax.swing.JTextField();
        campoCodEmpresaVeiculo = new javax.swing.JTextField();
        campoMediaKmLVeiculo = new javax.swing.JTextField();
        campoModeloVeiculo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setText("Limpar");

        jButton2.setText("Salvar");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        Titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Titulo.setText(" Cadastro de Veículos da Empresa");

        textoModeloVeiculo.setText("Modelo:");

        textoAnoVeiculo.setText("Ano:");

        textoPlacaVeiculo.setText("Placa:");

        textoCombustivelVeiculo.setText("Combustível:");

        textoMediaKmLVeiculo.setText("Média Km por Litro:");

        textoCodEmpresaVeiculo.setText("Código da Empresa:");

        campoAnoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAnoVeiculoActionPerformed(evt);
            }
        });

        campoPlacaVeiculo.setToolTipText("");

        campoCombustivelVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCombustivelVeiculoActionPerformed(evt);
            }
        });

        campoCodEmpresaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodEmpresaVeiculoActionPerformed(evt);
            }
        });

        campoMediaKmLVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMediaKmLVeiculoActionPerformed(evt);
            }
        });

        campoModeloVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModeloVeiculoActionPerformed(evt);
            }
        });

        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salvar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCombustivelVeiculo)
                            .addComponent(textoPlacaVeiculo)
                            .addComponent(textoAnoVeiculo)
                            .addComponent(textoModeloVeiculo)
                            .addComponent(textoCodEmpresaVeiculo)
                            .addComponent(textoMediaKmLVeiculo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCombustivelVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoAnoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoMediaKmLVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCodEmpresaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(85, 85, 85)
                        .addComponent(jButton3)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoModeloVeiculo)
                    .addComponent(campoModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAnoVeiculo)
                    .addComponent(campoAnoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPlacaVeiculo)
                    .addComponent(campoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCombustivelVeiculo)
                    .addComponent(campoCombustivelVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoMediaKmLVeiculo)
                    .addComponent(campoMediaKmLVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodEmpresaVeiculo)
                    .addComponent(campoCodEmpresaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoAnoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAnoVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAnoVeiculoActionPerformed

    private void campoCombustivelVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCombustivelVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCombustivelVeiculoActionPerformed

    private void campoCodEmpresaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodEmpresaVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodEmpresaVeiculoActionPerformed

    private void campoMediaKmLVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMediaKmLVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMediaKmLVeiculoActionPerformed

    private void campoModeloVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModeloVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoModeloVeiculoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        campoAnoVeiculo.setText("");
        campoCodEmpresaVeiculo.setText("");
        campoCombustivelVeiculo.setText("");
        campoMediaKmLVeiculo.setText("");
        campoModeloVeiculo.setText("");
        campoPlacaVeiculo.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String anoVeiculo = campoAnoVeiculo.getText();
        String placaVeiculo = campoPlacaVeiculo.getText();
        int combustivelVeiculo = Integer.parseInt(campoCombustivelVeiculo.getText());
        String codEmpresaVeiculo = campoCodEmpresaVeiculo.getText();
        double mediaKmLVeiculo = Double.parseDouble(campoMediaKmLVeiculo.getText());
        int modeloVeiculo = Integer.parseInt(campoModeloVeiculo.getText());

        this.controller.salvarVeiculo(modeloVeiculo, anoVeiculo, placaVeiculo, combustivelVeiculo, mediaKmLVeiculo, codEmpresaVeiculo);

    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField campoAnoVeiculo;
    private javax.swing.JTextField campoCodEmpresaVeiculo;
    private javax.swing.JTextField campoCombustivelVeiculo;
    private javax.swing.JTextField campoMediaKmLVeiculo;
    private javax.swing.JTextField campoModeloVeiculo;
    private javax.swing.JTextField campoPlacaVeiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoAnoVeiculo;
    private javax.swing.JLabel textoCodEmpresaVeiculo;
    private javax.swing.JLabel textoCombustivelVeiculo;
    private javax.swing.JLabel textoMediaKmLVeiculo;
    private javax.swing.JLabel textoModeloVeiculo;
    private javax.swing.JLabel textoPlacaVeiculo;
    // End of variables declaration//GEN-END:variables
}

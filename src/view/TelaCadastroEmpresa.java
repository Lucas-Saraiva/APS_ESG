/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.CadastroController;

/**
 *
 * @author Carlos Eduardo
 */
public class TelaCadastroEmpresa extends javax.swing.JPanel {

    private CadastroController controller;

    /**
     * Creates new form EmpresaInterface
     */
    public TelaCadastroEmpresa() {
        initComponents();
    }

    public TelaCadastroEmpresa(CadastroController controller) {
        this.controller = controller;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        textoIndicador = new javax.swing.JLabel();
        campoIndicador = new javax.swing.JTextField();
        textoMeta = new javax.swing.JLabel();
        textoNomeEmpresa = new javax.swing.JLabel();
        campoMetaEmpresa = new javax.swing.JTextField();
        textoCNPJEmpresa = new javax.swing.JLabel();
        textoPaisEmpresa = new javax.swing.JLabel();
        textoDataInicio = new javax.swing.JLabel();
        campoPais = new javax.swing.JTextField();
        campoNomeEmpresa = new javax.swing.JTextField();
        campoDataInicio = new javax.swing.JTextField();
        campoCNPJ = new javax.swing.JTextField();
        textoCodigoEmpresa = new javax.swing.JLabel();
        textoDataFinal = new javax.swing.JLabel();
        campoCodigoEmpresa = new javax.swing.JTextField();
        textoTitulo = new javax.swing.JLabel();
        campoDataFinal = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textoIndicador.setText("Indicador da Empresa:");

        campoIndicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIndicadorActionPerformed(evt);
            }
        });

        textoMeta.setText("Meta da Empresa:");

        textoNomeEmpresa.setText("Nome da Empresa:");

        campoMetaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMetaEmpresaActionPerformed(evt);
            }
        });

        textoCNPJEmpresa.setText("CNPJ:");

        textoPaisEmpresa.setText("País da Empresa:");

        textoDataInicio.setText("Data de Início:");

        campoPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPaisActionPerformed(evt);
            }
        });

        campoNomeEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeEmpresaActionPerformed(evt);
            }
        });

        campoDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataInicioActionPerformed(evt);
            }
        });

        campoCNPJ.setName(""); // NOI18N
        campoCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCNPJActionPerformed(evt);
            }
        });

        textoCodigoEmpresa.setText("Código da Empresa:");

        textoDataFinal.setText("Data Final:");

        campoCodigoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoEmpresaActionPerformed(evt);
            }
        });

        textoTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoTitulo.setText(" Cadastro de Empresa para Acompanhamento de ESG");

        campoDataFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoIndicador)
                            .addComponent(textoMeta)
                            .addComponent(textoPaisEmpresa)
                            .addComponent(textoDataInicio)
                            .addComponent(textoCNPJEmpresa)
                            .addComponent(textoNomeEmpresa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoMetaEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoIndicador, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoPais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(textoCodigoEmpresa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCodigoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(textoDataFinal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(textoTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNomeEmpresa)
                    .addComponent(campoNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCodigoEmpresa)
                    .addComponent(campoCodigoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCNPJEmpresa)
                    .addComponent(campoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDataInicio)
                    .addComponent(textoDataFinal)
                    .addComponent(campoDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoIndicador)
                    .addComponent(campoIndicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoMeta)
                    .addComponent(campoMetaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPaisEmpresa)
                    .addComponent(campoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCNPJActionPerformed

    private void campoDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataInicioActionPerformed

    private void campoNomeEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeEmpresaActionPerformed

    private void campoCodigoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoEmpresaActionPerformed

    private void campoPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPaisActionPerformed

    private void campoMetaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMetaEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMetaEmpresaActionPerformed

    private void campoIndicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIndicadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIndicadorActionPerformed

    private void campoDataFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataFinalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCNPJ;
    private javax.swing.JTextField campoCodigoEmpresa;
    private javax.swing.JTextField campoDataFinal;
    private javax.swing.JTextField campoDataInicio;
    private javax.swing.JTextField campoIndicador;
    private javax.swing.JTextField campoMetaEmpresa;
    private javax.swing.JTextField campoNomeEmpresa;
    private javax.swing.JTextField campoPais;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textoCNPJEmpresa;
    private javax.swing.JLabel textoCodigoEmpresa;
    private javax.swing.JLabel textoDataFinal;
    private javax.swing.JLabel textoDataInicio;
    private javax.swing.JLabel textoIndicador;
    private javax.swing.JLabel textoMeta;
    private javax.swing.JLabel textoNomeEmpresa;
    private javax.swing.JLabel textoPaisEmpresa;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables
}

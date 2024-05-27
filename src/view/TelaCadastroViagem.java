package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.Viagem;

public class TelaCadastroViagem extends javax.swing.JPanel {

    public TelaCadastroViagem() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        textoModeloViagem = new javax.swing.JLabel();
        textoDtCorridaViagem = new javax.swing.JLabel();
        textoDistanciaPercViagem = new javax.swing.JLabel();
        campoDistanciaPercViagem = new javax.swing.JTextField();
        campoDtCorridaViagem = new javax.swing.JTextField();
        campoModeloViagem = new javax.swing.JTextField();
        textoEmpresaViagem = new javax.swing.JLabel();
        textoPaisViagem = new javax.swing.JLabel();
        campoEmpresaViagem = new javax.swing.JTextField();
        campoPaisViagem = new javax.swing.JTextField();
        btnLimparViagem = new javax.swing.JButton();
        btnSalvarViagem = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(400, 400));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        Titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Titulo.setText("Cadastro de Viagem");

        textoModeloViagem.setText("Modelo:");

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

        campoModeloViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModeloViagemActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(Titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoDtCorridaViagem)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnSalvarViagem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimparViagem))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textoDistanciaPercViagem)
                                        .addComponent(textoModeloViagem)
                                        .addComponent(textoEmpresaViagem)
                                        .addComponent(textoPaisViagem))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoDistanciaPercViagem)
                                        .addComponent(campoEmpresaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoPaisViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoModeloViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoDtCorridaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoModeloViagem)
                    .addComponent(campoModeloViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(textoEmpresaViagem)
                    .addComponent(campoEmpresaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPaisViagem)
                    .addComponent(campoPaisViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparViagem)
                    .addComponent(btnSalvarViagem))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void campoModeloViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModeloViagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoModeloViagemActionPerformed

    private void campoDtCorridaViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDtCorridaViagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDtCorridaViagemActionPerformed

    private void btnLimparViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparViagemActionPerformed
        campoDistanciaPercViagem.setText("");
        campoDtCorridaViagem.setText("");
        campoEmpresaViagem.setText("");
        campoModeloViagem.setText("");
        campoPaisViagem.setText("");
    }//GEN-LAST:event_btnLimparViagemActionPerformed

    private void btnSalvarViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarViagemActionPerformed
        String distanciaPercViagem = campoDistanciaPercViagem.getText();
        String empresaViagem = campoEmpresaViagem.getText();
        String paisViagem = campoPaisViagem.getText();
        String modeloViagem = campoModeloViagem.getText();
        Date dtCorridaViagem = null;
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dtCorridaViagem = formatador.parse(campoDtCorridaViagem.getText());
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroEmpresa.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }

        // Viagem viagem = new Viagem(empresaViagem, placaVeiculo, dtCorridaViagem, ABORT, null)

    }//GEN-LAST:event_btnSalvarViagemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnLimparViagem;
    private javax.swing.JButton btnSalvarViagem;
    private javax.swing.JTextField campoDistanciaPercViagem;
    private javax.swing.JTextField campoDtCorridaViagem;
    private javax.swing.JTextField campoEmpresaViagem;
    private javax.swing.JTextField campoModeloViagem;
    private javax.swing.JTextField campoPaisViagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoDistanciaPercViagem;
    private javax.swing.JLabel textoDtCorridaViagem;
    private javax.swing.JLabel textoEmpresaViagem;
    private javax.swing.JLabel textoModeloViagem;
    private javax.swing.JLabel textoPaisViagem;
    // End of variables declaration//GEN-END:variables
}

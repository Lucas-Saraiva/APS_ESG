/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Carlos Eduardo
 */
public class TelaInicial extends javax.swing.JPanel {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoTelaCadastro = new javax.swing.JLabel();
        btnMostrarRelatorios = new javax.swing.JButton();
        btnCadastrarEmpresa = new javax.swing.JButton();
        btnCadastrarViagem = new javax.swing.JButton();
        btnCadastrarVeiculos = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textoTelaCadastro.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        textoTelaCadastro.setText("Tela de Cadastro");

        btnMostrarRelatorios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnMostrarRelatorios.setText("Mostrar Relatórios");
        btnMostrarRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRelatoriosActionPerformed(evt);
            }
        });

        btnCadastrarEmpresa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrarEmpresa.setText("Cadastrar Empresa");
        btnCadastrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEmpresaActionPerformed(evt);
            }
        });

        btnCadastrarViagem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrarViagem.setText("Cadastrar Viagem");
        btnCadastrarViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarViagemActionPerformed(evt);
            }
        });

        btnCadastrarVeiculos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrarVeiculos.setText("Cadastrar Veículos");
        btnCadastrarVeiculos.setActionCommand("Cadastrar Veículos");
        btnCadastrarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVeiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrarRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarViagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoTelaCadastro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoTelaCadastro)
                .addGap(44, 44, 44)
                .addComponent(btnCadastrarEmpresa)
                .addGap(41, 41, 41)
                .addComponent(btnCadastrarVeiculos)
                .addGap(41, 41, 41)
                .addComponent(btnCadastrarViagem)
                .addGap(41, 41, 41)
                .addComponent(btnMostrarRelatorios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarRelatoriosActionPerformed

    private void btnCadastrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarEmpresaActionPerformed

    private void btnCadastrarViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarViagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarViagemActionPerformed

    private void btnCadastrarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVeiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarVeiculosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarEmpresa;
    private javax.swing.JButton btnCadastrarVeiculos;
    private javax.swing.JButton btnCadastrarViagem;
    private javax.swing.JButton btnMostrarRelatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoTelaCadastro;
    // End of variables declaration//GEN-END:variables
}

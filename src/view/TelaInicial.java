package view;

public class TelaInicial extends javax.swing.JPanel {

    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("Tela Inicial");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TelaInicial());
        frame.pack();
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
}
    public TelaInicial() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoTelaCadastro = new javax.swing.JLabel();
        btnMostrarRelatorios = new javax.swing.JButton();
        btnCadastrarEmpresa = new javax.swing.JButton();
        btnCadastrarViagem = new javax.swing.JButton();
        btnCadastrarVeiculos = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        btnCadastrarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVeiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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
                .addGap(26, 26, 26)
                .addComponent(textoTelaCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnCadastrarEmpresa)
                .addGap(27, 27, 27)
                .addComponent(btnCadastrarVeiculos)
                .addGap(28, 28, 28)
                .addComponent(btnCadastrarViagem)
                .addGap(27, 27, 27)
                .addComponent(btnMostrarRelatorios)
                .addGap(45, 45, 45))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRelatoriosActionPerformed
        javax.swing.JFrame frame = new javax.swing.JFrame("Cadastro de Relatórios");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new TelaRelatorio());
        frame.pack();
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    }//GEN-LAST:event_btnMostrarRelatoriosActionPerformed

    private void btnCadastrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEmpresaActionPerformed
        javax.swing.JFrame frame = new javax.swing.JFrame("Cadastro de Empresas");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new TelaCadastroEmpresa());
        frame.pack();
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    }//GEN-LAST:event_btnCadastrarEmpresaActionPerformed

    private void btnCadastrarViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarViagemActionPerformed
        javax.swing.JFrame frame = new javax.swing.JFrame("Cadastro de Viagens");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new TelaCadastroViagem());
        frame.pack();
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    }//GEN-LAST:event_btnCadastrarViagemActionPerformed

    private void btnCadastrarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVeiculosActionPerformed
        javax.swing.JFrame frame = new javax.swing.JFrame("Cadastro de Veículos");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new TelaCadastroVeiculo());
        frame.pack();
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
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

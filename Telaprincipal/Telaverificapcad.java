
package Telaprincipal;

import BACK.Conexao;
import javax.swing.JOptionPane;


public class Telaverificapcad extends javax.swing.JFrame {

   public Telaverificapcad() {
    initComponents();
    setLocationRelativeTo(null);
    setResizable(false);

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextSenha = new javax.swing.JTextField();
        TextCPF = new javax.swing.JTextField();
        btnsair = new javax.swing.JButton();
        btnentrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela login");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("CPF:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 50, 96, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("SENHA:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 130, 71, 17);

        TextSenha.setForeground(new java.awt.Color(0, 0, 102));
        TextSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        TextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(TextSenha);
        TextSenha.setBounds(200, 170, 160, 18);

        TextCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        TextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCPFActionPerformed(evt);
            }
        });
        getContentPane().add(TextCPF);
        TextCPF.setBounds(200, 90, 160, 18);

        btnsair.setForeground(new java.awt.Color(51, 0, 102));
        btnsair.setText("Voltar");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair);
        btnsair.setBounds(200, 210, 70, 30);

        btnentrar.setForeground(new java.awt.Color(0, 0, 102));
        btnentrar.setText("Entrar");
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnentrar);
        btnentrar.setBounds(290, 210, 70, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mtpequena.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-440, -220, 850, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
      
    }//GEN-LAST:event_TextSenhaActionPerformed

    private void TextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCPFActionPerformed

    }//GEN-LAST:event_TextCPFActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        dispose();
                    }//GEN-LAST:event_btnsairActionPerformed

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed
        
    String cpf = TextCPF.getText();
    String senha = TextSenha.getText();
    Conexao conexao = new Conexao();
    conexao.conectar();

    boolean loginSucesso = conexao.verificarCredenciais(cpf, senha);

    if (loginSucesso) {
        System.out.println("Login bem-sucedido!");
        Cadastrofuncionário tlcadf = new Cadastrofuncionário();
        tlcadf.setVisible(true);
        dispose();
    } else {
               JOptionPane.showMessageDialog(null, "Erro, usuário não encontrado", "Falha", JOptionPane.ERROR_MESSAGE);
               dispose();

        // Exibir mensagem de erro ou realizar outras ações caso o login falhe
    }
    
    conexao.close();
    }//GEN-LAST:event_btnentrarActionPerformed

   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Telaverificapcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telaverificapcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telaverificapcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telaverificapcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Telaverificapcad().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextCPF;
    private javax.swing.JTextField TextSenha;
    private javax.swing.JButton btnentrar;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

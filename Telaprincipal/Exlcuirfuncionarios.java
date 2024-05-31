/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telaprincipal;

import BACK.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Exlcuirfuncionarios extends javax.swing.JFrame {


    public Exlcuirfuncionarios() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        Confrimar = new javax.swing.JButton();
        Recebecpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Insira o CPF do funcionário a se excluir:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 130, 340, 50);

        Voltar.setText("Cancelar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(130, 250, 100, 30);

        Confrimar.setText("Confirmar");
        Confrimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimarActionPerformed(evt);
            }
        });
        getContentPane().add(Confrimar);
        Confrimar.setBounds(300, 250, 100, 30);

        Recebecpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebecpfActionPerformed(evt);
            }
        });
        getContentPane().add(Recebecpf);
        Recebecpf.setBounds(80, 190, 370, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mtpequena.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-230, -500, 780, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecebecpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebecpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecebecpfActionPerformed

    private void ConfrimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimarActionPerformed
       String Cpfrecebido = Recebecpf.getText();
        try {
            excliuirPessoa(Cpfrecebido);
        } catch (SQLException ex) {
            Logger.getLogger(Exlcuirfuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        
    }//GEN-LAST:event_ConfrimarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
     dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    
    
    
    public void excliuirPessoa(String cpf) throws SQLException{
        String query = "delete from funcionarios where cpf = ? limit 1;";
         Conexao conexao = new Conexao();
    try {
        conexao.conectarExplicitamente(); 
        if (conexao.isConnected()) { 
            try (Connection connection = conexao.getConnection()) {
                if (connection != null) {
                    try (PreparedStatement stmt = connection.prepareStatement(query)) {
                        stmt.setString(1, cpf);
                        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Funcionario exluido com sucesso! ", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar o nome do produto: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }

        
    }
    
    /**
     * @param args the command line arguments
     */    
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
            java.util.logging.Logger.getLogger(Exlcuirfuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exlcuirfuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exlcuirfuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exlcuirfuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exlcuirfuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confrimar;
    private javax.swing.JTextField Recebecpf;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

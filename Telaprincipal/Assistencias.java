package Telaprincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import BACK.Conexao;


public class Assistencias extends javax.swing.JFrame {

   

    
    
    public Assistencias() {
        initComponents();setLocationRelativeTo(null);
        setResizable(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ValorCobrado1 = new javax.swing.JLabel();
        Tipo_de_servico_entrada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Entrada_tipo_dispositivo = new javax.swing.JTextField();
        Detalhestitulo = new javax.swing.JLabel();
        Divisorhorizontal = new javax.swing.JLabel();
        Dispositivo_usado1 = new javax.swing.JLabel();
        Divisorhorizontal1 = new javax.swing.JLabel();
        Valor_cobrado = new javax.swing.JTextField();
        Divisorhorizontal2 = new javax.swing.JLabel();
        ValorCobrado2 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        Confirmar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        ValorCobrado1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ValorCobrado1.setForeground(new java.awt.Color(0, 0, 102));
        ValorCobrado1.setText("Valor cobrado");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 650));
        setPreferredSize(getMinimumSize());
        getContentPane().setLayout(null);

        Tipo_de_servico_entrada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Tipo_de_servico_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_de_servico_entradaActionPerformed(evt);
            }
        });
        getContentPane().add(Tipo_de_servico_entrada);
        Tipo_de_servico_entrada.setBounds(20, 170, 210, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Serviço prestado na assistência:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 130, 230, 30);

        Entrada_tipo_dispositivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(Entrada_tipo_dispositivo);
        Entrada_tipo_dispositivo.setBounds(20, 260, 220, 30);

        Detalhestitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Detalhestitulo.setForeground(new java.awt.Color(0, 0, 102));
        Detalhestitulo.setText("Detalhes:");
        getContentPane().add(Detalhestitulo);
        Detalhestitulo.setBounds(410, 130, 110, 30);

        Divisorhorizontal.setText("____________________________________________");
        getContentPane().add(Divisorhorizontal);
        Divisorhorizontal.setBounds(20, 400, 220, 16);

        Dispositivo_usado1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Dispositivo_usado1.setForeground(new java.awt.Color(0, 0, 102));
        Dispositivo_usado1.setText("Dispositivo:");
        getContentPane().add(Dispositivo_usado1);
        Dispositivo_usado1.setBounds(30, 230, 90, 30);

        Divisorhorizontal1.setText("____________________________________________");
        getContentPane().add(Divisorhorizontal1);
        Divisorhorizontal1.setBounds(20, 210, 220, 16);

        Valor_cobrado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Valor_cobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Valor_cobradoActionPerformed(evt);
            }
        });
        getContentPane().add(Valor_cobrado);
        Valor_cobrado.setBounds(20, 360, 220, 30);

        Divisorhorizontal2.setText("____________________________________________");
        getContentPane().add(Divisorhorizontal2);
        Divisorhorizontal2.setBounds(20, 300, 220, 16);

        ValorCobrado2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ValorCobrado2.setForeground(new java.awt.Color(0, 0, 102));
        ValorCobrado2.setText("Valor cobrado:");
        getContentPane().add(ValorCobrado2);
        ValorCobrado2.setBounds(30, 320, 110, 30);

        textArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(textArea1);
        textArea1.setBounds(340, 160, 240, 260);

        Confirmar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Confirmar.setText("Confirmar");
        Confirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(Confirmar);
        Confirmar.setBounds(310, 500, 140, 30);

        Voltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(120, 500, 140, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mtpequena.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-260, 420, 860, 450);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mtpequena.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-190, -590, 800, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tipo_de_servico_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_de_servico_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tipo_de_servico_entradaActionPerformed

    private void Valor_cobradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Valor_cobradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Valor_cobradoActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
      inserirDados();
      dispose();
    }//GEN-LAST:event_ConfirmarActionPerformed

    
    
      private void inserirDados() {
        // Recupera os valores dos campos
        String servico = Tipo_de_servico_entrada.getText();
        String dispositivo = Entrada_tipo_dispositivo.getText();
        String valor = Valor_cobrado.getText();
        String descricao = textArea1.getText();
        
        // Prepara a query SQL
        String query = "INSERT INTO assistencias (servico, dispositivo, valor, descricao) VALUES (?, ?, ?, ?)";
        
        // Estabelece a conexão com o banco de dados e executa a inserção
        try {
            Conexao conexao = new Conexao();
            conexao.conectarExplicitamente();
            if (conexao.isConnected()) {
                try (Connection connection = conexao.getConnection()) {
                    if (connection != null) {
                        try (PreparedStatement stmt = connection.prepareStatement(query)) {
                            stmt.setString(1, servico);
                            stmt.setString(2, dispositivo);
                            stmt.setString(3, valor);
                            stmt.setString(4, descricao);
                            stmt.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
 
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
            java.util.logging.Logger.getLogger(Assistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel Detalhestitulo;
    private javax.swing.JLabel Dispositivo_usado1;
    private javax.swing.JLabel Divisorhorizontal;
    private javax.swing.JLabel Divisorhorizontal1;
    private javax.swing.JLabel Divisorhorizontal2;
    private javax.swing.JTextField Entrada_tipo_dispositivo;
    private javax.swing.JTextField Tipo_de_servico_entrada;
    private javax.swing.JLabel ValorCobrado1;
    private javax.swing.JLabel ValorCobrado2;
    private javax.swing.JTextField Valor_cobrado;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}

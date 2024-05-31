/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telaprincipal;

import BACK.Produto;
import BACK.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import BACK.Recibo;
import java.io.File;
import java.sql.SQLException;
import javax.swing.JFileChooser;


/**
 *
 * @author johnp
 */
public class TelaDeVenda extends javax.swing.JFrame {

   DefaultListModel<String> modeloListaProdutos;
   DefaultListModel<String> modeloListaPrecos;
   ArrayList<Produto> listaProdutos;
    public TelaDeVenda() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        Scrolllist.setVisible(false);
        modeloListaProdutos = new DefaultListModel<>();
        modeloListaPrecos = new DefaultListModel<>(); 
        listaProdutos = new ArrayList<>();
        jList1.setModel(modeloListaProdutos);
       modeloListaPrecos = new DefaultListModel<>(); 
       jList2.setModel(modeloListaPrecos);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        Scrolllist = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Recebepreco = new javax.swing.JLabel();
        Recebenome1 = new javax.swing.JLabel();
        RecebeID = new javax.swing.JLabel();
        Recebeestoque = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        AdicionarALista = new javax.swing.JButton();
        recebetotalcompra = new javax.swing.JLabel();
        Total1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 690));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setText("Digite o nome do produto:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 240, 26);

        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(20, 50, 250, 30);

        Lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        Scrolllist.setViewportView(jScrollPane1);

        getContentPane().add(Scrolllist);
        Scrolllist.setBounds(20, 80, 250, 160);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 280, 60, 20);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 280, 20, 21);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Preço");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 370, 50, 21);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("estoque");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 370, 70, 16);

        Recebepreco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Recebepreco.setText(".");
        Recebepreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Recebepreco);
        Recebepreco.setBounds(10, 390, 130, 30);

        Recebenome1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Recebenome1.setText(".");
        Recebenome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Recebenome1);
        Recebenome1.setBounds(10, 310, 140, 30);

        RecebeID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RecebeID.setText(".");
        RecebeID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(RecebeID);
        RecebeID.setBounds(170, 310, 130, 30);

        Recebeestoque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Recebeestoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Recebeestoque);
        Recebeestoque.setBounds(170, 390, 130, 30);

        jList1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(jList1);

        jScrollPane2.setViewportView(jScrollPane3);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(460, 20, 240, 440);

        jList2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(jList2);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(700, 20, 100, 440);

        AdicionarALista.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AdicionarALista.setText("Adicionar");
        AdicionarALista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarAListaActionPerformed(evt);
            }
        });
        getContentPane().add(AdicionarALista);
        AdicionarALista.setBounds(100, 450, 110, 40);

        recebetotalcompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        recebetotalcompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(recebetotalcompra);
        recebetotalcompra.setBounds(680, 490, 120, 40);

        Total1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Total1.setText("Total: ");
        getContentPane().add(Total1);
        Total1.setBounds(620, 490, 70, 40);

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Finalizar compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 550, 180, 50);

        jButton2.setText("Limpar Produtos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 40, 130, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mtpequena.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-140, -280, 960, 930);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
 String nome = txtNome.getText();
        listarnomes(nome);
   
    }//GEN-LAST:event_txtNomeKeyReleased

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked

        if (evt.getClickCount() == 1) {
            JList<String> list = (JList<String>) evt.getSource();
            int index = list.getSelectedIndex();
            if (index >= 0) {
                String nomeProduto = (String) list.getModel().getElementAt(index);
                // Chama o método para preencher os campos com os detalhes do produto selecionado
                preencherCampos(nomeProduto);
            }
        }
    }//GEN-LAST:event_ListaMouseClicked

    private void AdicionarAListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarAListaActionPerformed
    String nomeProduto = Recebenome1.getText();
    String precoProduto = Recebepreco.getText();
    String estoqueProduto = Recebeestoque.getText();
    
    // Verifica se o estoque é maior que zero antes de adicionar à lista
    if (!nomeProduto.isEmpty() && !precoProduto.isEmpty() && Integer.parseInt(estoqueProduto) > 0) {
        Produto novoProduto = new Produto(nomeProduto, Double.parseDouble(precoProduto));
        listaProdutos.add(novoProduto);
        modeloListaProdutos.addElement(nomeProduto); // Adiciona apenas o nome à lista principal
        modeloListaPrecos.addElement("R$" + precoProduto); // Adiciona o preço à lista de preços
        atualizarTotalCompra();
    } else {
        JOptionPane.showMessageDialog(null, "Este produto está fora de estoque.", "Sem estoque", JOptionPane.WARNING_MESSAGE);
    }       
    }//GEN-LAST:event_AdicionarAListaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modeloListaProdutos.clear();
        modeloListaPrecos.clear();
        recebetotalcompra.setText("");
      listaProdutos.clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try {
        ArrayList<String> nomesProdutos = new ArrayList<>();
        ArrayList<Double> precoProdutos = new ArrayList<>(); // Alterado para ArrayList<Double>
        for (int i = 0; i < listaProdutos.size(); i++) {
            nomesProdutos.add(listaProdutos.get(i).getNome());
            precoProdutos.add(listaProdutos.get(i).getPreco()); // Adiciona o preço à lista de preços
        }
        double totalCompra = 0.0;
        for (Produto produto : listaProdutos) {
            totalCompra += produto.getPreco();
            atualizarVendas(produto.getNome());
        }
       
        
        // Aqui está o código para selecionar o diretório
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecionar Diretório");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File directory = fileChooser.getSelectedFile();
            String path = directory.getAbsolutePath(); 
            Recibo.gerarRecibo(nomesProdutos, precoProdutos, totalCompra, path);
            JOptionPane.showMessageDialog(null, "Recibo gerado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            atualizarEstoque();
            dispose();
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Erro ao gerar o recibo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        dispose();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
public void listarnomes(String letra) {
    DefaultListModel<String> modelo = new DefaultListModel<>();
    Lista.setModel(modelo);
    String readLista = "SELECT * FROM produtos WHERE nome LIKE ? ORDER BY nome";
    Conexao conexao = new Conexao();

    try {
        conexao.conectarExplicitamente(); // Conectar explicitamente antes de obter a conexão
        if (conexao.isConnected()) { // Verificar se a conexão está estabelecida
            try (Connection connection = conexao.getConnection()) {
                if (connection != null) {
                    try (PreparedStatement stmt = connection.prepareStatement(readLista)) {
                        stmt.setString(1, letra + "%");
                        try (ResultSet rs = stmt.executeQuery()) {
                            while (rs.next()) {
                                Scrolllist.setVisible(true);
                                Lista.setVisible(true);
                                modelo.addElement(rs.getString("nome"));
                                if (txtNome.getText().isEmpty()) {
                                    Scrolllist.setVisible(false);
                                    Lista.setVisible(false);
                                }
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao listar produtos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } finally {
        conexao.close(); // Certifique-se de fechar a conexão no bloco finally
    }
}


    private void preencherCampos(String nomeProduto) {
        String query = "SELECT idproduto, estoque, preço FROM produtos WHERE nome = ?";
        Conexao conexao = new Conexao();
        try {
            conexao.conectarExplicitamente(); 
            if (conexao.isConnected()) { 
                try (Connection connection = conexao.getConnection()) {
                    if (connection != null) {
                        try (PreparedStatement stmt = connection.prepareStatement(query)) {

                            stmt.setString(1, nomeProduto);
                            try (ResultSet rs = stmt.executeQuery()) {
                                if (rs.next()) {
                                    RecebeID.setText(rs.getString("idproduto"));
                                    Recebenome1.setText(nomeProduto);
                                    Recebeestoque.setText(rs.getString("estoque"));
                                    Recebepreco.setText(rs.getString("preço"));
                                }
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar detalhes do produto: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
  private void atualizarTotalCompra() {
    double total = 0.0;
    for (Produto produto : listaProdutos) {
        total += produto.getPreco();
    } recebetotalcompra.setText(String.format("R$ %.2f", total));
}

  private void atualizarEstoque() {
    String updateEstoque = "UPDATE produtos SET estoque = estoque - 1 WHERE nome = ?";
    Conexao conexao = new Conexao();
    try {
        conexao.conectarExplicitamente();
        if (conexao.isConnected()) {
            try (Connection connection = conexao.getConnection()) {
                if (connection != null) {
                    try (PreparedStatement stmt = connection.prepareStatement(updateEstoque)) {
                        for (Produto produto : listaProdutos) {
                            stmt.setString(1, produto.getNome());
                            stmt.executeUpdate();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar o estoque: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
private void atualizarVendas(String nomeProduto) {
    System.out.println("Atualizando vendas para o produto: " + nomeProduto);
    String updateVendas = "UPDATE produtos SET vendas = vendas + 1 WHERE nome = ?";
    System.out.println("SQL: " + updateVendas);
    Conexao conexao = new Conexao();
    try {
        conexao.conectarExplicitamente();
        if (conexao.isConnected()) {
            try (Connection connection = conexao.getConnection()) {
                if (connection != null) {
                    try (PreparedStatement stmt = connection.prepareStatement(updateVendas)) {
                        stmt.setString(1, nomeProduto);
                        stmt.executeUpdate();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar as vendas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarALista;
    private javax.swing.JList<String> Lista;
    private javax.swing.JLabel RecebeID;
    private javax.swing.JLabel Recebeestoque;
    private javax.swing.JLabel Recebenome1;
    private javax.swing.JLabel Recebepreco;
    private javax.swing.JScrollPane Scrolllist;
    private javax.swing.JLabel Total1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel recebetotalcompra;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

package Telaprincipal;

import BACK.Conexao;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;


public class TelaTrocas extends javax.swing.JFrame {

    private float preco_quebrado;
    private float preco_bom;
    
    
    public TelaTrocas() {
        initComponents();
         setLocationRelativeTo(null);
        setResizable(false);
        Scrolllist.setVisible(false);
        Scrolllist1.setVisible(false);
        jLabel6.setVisible(false);
        Diferprecolabel.setVisible(false);
        labeldevolucaovalor.setVisible(false);
        tracegado.setVisible(true);
        idproduto.setVisible(false);
        
    }

  
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recebenome1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        Divisoria2 = new javax.swing.JLabel();
        Scrolllist = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Listaquerecebeodefeituoso = new javax.swing.JList<>();
        txtNomedatoca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        Scrolllist1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Listaquerecebeonovoproduto = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        Confrimartroca = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        idproduto = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(202, 0), new java.awt.Dimension(202, 0), new java.awt.Dimension(202, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 41), new java.awt.Dimension(0, 41), new java.awt.Dimension(32767, 41));
        jLabel5 = new javax.swing.JLabel();
        labeltitulo = new javax.swing.JLabel();
        recebenomedefeituoso = new javax.swing.JLabel();
        Divisoria3 = new javax.swing.JLabel();
        recebeprecotrocadefeituoso = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labeltitulo1 = new javax.swing.JLabel();
        recebenomeProdutoquesaiu = new javax.swing.JLabel();
        recebeprecotrocaquesaiu = new javax.swing.JLabel();
        labeldevolucaovalor = new javax.swing.JLabel();
        Diferprecolabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tracegado = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        recebenome1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        recebenome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("jLabel4");

        jLabel3.setText("jLabel3");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel7.setText("|");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 625));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Produto com defeito:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 180, 26);

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
        txtNome.setBounds(30, 40, 190, 30);

        Divisoria2.setForeground(new java.awt.Color(0, 0, 102));
        Divisoria2.setText("-------------------------------------------------------------");
        getContentPane().add(Divisoria2);
        Divisoria2.setBounds(430, 270, 310, 16);

        Listaquerecebeodefeituoso.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Listaquerecebeodefeituoso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaquerecebeodefeituosoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Listaquerecebeodefeituoso);

        Scrolllist.setViewportView(jScrollPane1);

        getContentPane().add(Scrolllist);
        Scrolllist.setBounds(30, 60, 190, 100);

        txtNomedatoca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        txtNomedatoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomedatocaActionPerformed(evt);
            }
        });
        txtNomedatoca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomedatocaKeyReleased(evt);
            }
        });
        getContentPane().add(txtNomedatoca);
        txtNomedatoca.setBounds(420, 40, 200, 30);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Motivo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 300, 70, 30);
        getContentPane().add(textArea1);
        textArea1.setBounds(60, 330, 200, 120);

        Listaquerecebeonovoproduto.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Listaquerecebeonovoproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaquerecebeonovoprodutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Listaquerecebeonovoproduto);

        Scrolllist1.setViewportView(jScrollPane2);

        getContentPane().add(Scrolllist1);
        Scrolllist1.setBounds(420, 60, 200, 100);

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Produto da Troca:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(440, 20, 160, 30);

        Confrimartroca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Confrimartroca.setForeground(new java.awt.Color(0, 0, 102));
        Confrimartroca.setText("Confirmar troca");
        Confrimartroca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimartrocaActionPerformed(evt);
            }
        });
        getContentPane().add(Confrimartroca);
        Confrimartroca.setBounds(370, 520, 160, 40);

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Cancelar");
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 520, 160, 40);
        getContentPane().add(idproduto);
        idproduto.setBounds(230, 80, 37, 16);
        getContentPane().add(filler1);
        filler1.setBounds(180, 210, 202, 0);
        getContentPane().add(filler2);
        filler2.setBounds(250, 40, 0, 310);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Preço:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 250, 50, 17);

        labeltitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labeltitulo.setText("Peço:");
        getContentPane().add(labeltitulo);
        labeltitulo.setBounds(20, 240, 50, 17);

        recebenomedefeituoso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        recebenomedefeituoso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(recebenomedefeituoso);
        recebenomedefeituoso.setBounds(460, 200, 150, 30);

        Divisoria3.setForeground(new java.awt.Color(0, 0, 102));
        Divisoria3.setText("-----------------------------------------------------------------------------------------");
        getContentPane().add(Divisoria3);
        Divisoria3.setBounds(0, 270, 430, 16);

        recebeprecotrocadefeituoso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        recebeprecotrocadefeituoso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(recebeprecotrocadefeituoso);
        recebeprecotrocadefeituoso.setBounds(460, 240, 150, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Iten da troca:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 210, 100, 17);

        labeltitulo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labeltitulo1.setText("Iten recebido:");
        getContentPane().add(labeltitulo1);
        labeltitulo1.setBounds(10, 210, 100, 17);

        recebenomeProdutoquesaiu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        recebenomeProdutoquesaiu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(recebenomeProdutoquesaiu);
        recebenomeProdutoquesaiu.setBounds(120, 200, 150, 30);

        recebeprecotrocaquesaiu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        recebeprecotrocaquesaiu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(recebeprecotrocaquesaiu);
        recebeprecotrocaquesaiu.setBounds(120, 240, 150, 30);

        labeldevolucaovalor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labeldevolucaovalor.setText("Devolva ao cliente:");
        getContentPane().add(labeldevolucaovalor);
        labeldevolucaovalor.setBounds(340, 320, 170, 30);

        Diferprecolabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Diferprecolabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Diferprecolabel);
        Diferprecolabel.setBounds(510, 320, 140, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Diferença a pagar:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 320, 170, 30);

        tracegado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tracegado.setText("------------------------------");
        getContentPane().add(tracegado);
        tracegado.setBounds(410, 320, 150, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mtpequena.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-200, -570, 910, 1080);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mtpequena.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-10, 500, 720, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        String nome =txtNome.getText();
        listarnomes(nome);
    }//GEN-LAST:event_txtNomeKeyReleased

    private void ListaquerecebeodefeituosoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaquerecebeodefeituosoMouseClicked
        if (evt.getClickCount() == 1) {
        JList<String> list = (JList<String>)evt.getSource();
        int index = list.getSelectedIndex();
        if (index >= 0) {
            String nomeProduto = (String)list.getModel().getElementAt(index);
            preencherCamposTroca(nomeProduto);
            
            cauculadiferenca();
        }
    }
    }//GEN-LAST:event_ListaquerecebeodefeituosoMouseClicked

    private void txtNomedatocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomedatocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomedatocaActionPerformed

    private void txtNomedatocaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomedatocaKeyReleased
          String nometroca =txtNomedatoca.getText();
        listarnomesptroca(nometroca);
        
    }//GEN-LAST:event_txtNomedatocaKeyReleased

    private void ListaquerecebeonovoprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaquerecebeonovoprodutoMouseClicked
      
       JList<String> list = (JList<String>) evt.getSource();
    int index = list.getSelectedIndex();
    if (index >= 0) {
        String nomeProdutodefeituoso = list.getModel().getElementAt(index);
        txtNomedatoca.setText(nomeProdutodefeituoso);
        preencherCampos(nomeProdutodefeituoso);
         cauculadiferenca();
    }
    }//GEN-LAST:event_ListaquerecebeonovoprodutoMouseClicked

    private void ConfrimartrocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimartrocaActionPerformed
         inserirTroca();
         dispose();
    }//GEN-LAST:event_ConfrimartrocaActionPerformed

    
public void listarnomes(String letra){
  DefaultListModel<String> modelo = new DefaultListModel<>();
    Listaquerecebeodefeituoso.setModel(modelo);
   String readLista = "SELECT idproduto, nome FROM produtos WHERE nome LIKE ? ORDER BY nome";
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
                                Listaquerecebeodefeituoso.setVisible(true);
                                modelo.addElement(rs.getString("nome"));
                                if(txtNome.getText().isEmpty()){
                                     Scrolllist.setVisible(false);
                                Listaquerecebeodefeituoso.setVisible(false);
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
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao listar produtos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
           
    }
      
      
public void listarnomesptroca(String letra){
  DefaultListModel<String> modelo = new DefaultListModel<>();
    Listaquerecebeonovoproduto.setModel(modelo);
    String readLista = "SELECT idproduto, nome FROM produtos WHERE nome LIKE ? ORDER BY nome";
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
                                Scrolllist1.setVisible(true);
                                Listaquerecebeonovoproduto.setVisible(true);
                                modelo.addElement(rs.getString("nome"));
                                if(txtNome.getText().isEmpty()){
                                     Scrolllist1.setVisible(false);
                                Listaquerecebeonovoproduto.setVisible(false);
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
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao listar produtos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
           
    }
       
    
 private void preencherCampos(String nomeProduto) {
    String query = "SELECT idproduto, estoque, nome, preço FROM produtos WHERE nome = ?";
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
                                idproduto.setText(rs.getString("idproduto"));
                                recebenomedefeituoso.setText(rs.getString("nome"));
                                recebeprecotrocadefeituoso.setText(rs.getString("preço"));
                                this.preco_bom = Float.parseFloat(rs.getString("preço"));
                            } else {
                                JOptionPane.showMessageDialog(null, "Produto não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
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

private void preencherCamposTroca(String nomeProduto) {
    String query = "SELECT idproduto, estoque, nome, preço FROM produtos WHERE nome = ?";
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
                                recebenomeProdutoquesaiu.setText(rs.getString("nome"));
                                recebeprecotrocaquesaiu.setText(rs.getString("preço"));
                                String precosaidatxt = recebeprecotrocaquesaiu.getText();
                                        this.preco_quebrado = Float.parseFloat(precosaidatxt);
                                   
                            } else {
                                JOptionPane.showMessageDialog(null, "Produto não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
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


 private void cauculadiferenca(){
     
     
     float diferenca = 0.0f;
     diferenca = this.preco_bom - this.preco_quebrado;
     if(diferenca > 0){
        Diferprecolabel.setText("R$ "+diferenca);
        jLabel6.setVisible(true);
        Diferprecolabel.setVisible(true);
          labeldevolucaovalor.setVisible(false);
          tracegado.setVisible(false);
     }else if(diferenca == 0){
         jLabel6.setVisible(false);
         labeldevolucaovalor.setVisible(false);
           Diferprecolabel.setVisible(false);
           tracegado.setVisible(true);
         
     }else{
         diferenca = diferenca * (-1);
                 jLabel6.setVisible(false);
          Diferprecolabel.setVisible(true);
          labeldevolucaovalor.setVisible(true);
          Diferprecolabel.setText("R$ "+diferenca);
          tracegado.setVisible(false);
     }
   
 }




public void inserirTroca() {
    String queryTroca = "INSERT INTO trocas (chavedoproduto, itemdefeito, motivo) VALUES (?, ?, ?)";
    String queryEstoque = "UPDATE produtos SET estoque = estoque - 1 WHERE idproduto = ?"; // Subtraindo 1 do estoque

    Conexao conexao = new Conexao();

    try {
        conexao.conectarExplicitamente();
        if (conexao.isConnected()) {
            try (Connection connection = conexao.getConnection()) {
                if (connection != null) {
                    // Desativa o autocommit para que possamos garantir que ambas as operações sejam executadas com sucesso
                    connection.setAutoCommit(false);

                    try (PreparedStatement stmtTroca = connection.prepareStatement(queryTroca);
                         PreparedStatement stmtEstoque = connection.prepareStatement(queryEstoque)) {
                        // Define os parâmetros da inserção na tabela trocas
                        stmtTroca.setString(1, idproduto.getText()); // Chave do produto com defeito
                        stmtTroca.setString(2, txtNomedatoca.getText()); // Item da troca
                        stmtTroca.setString(3, textArea1.getText()); // Motivo da troca

                        stmtTroca.executeUpdate();

                        stmtEstoque.setString(1, idproduto.getText());

                        stmtEstoque.executeUpdate();

                        connection.commit();

                        JOptionPane.showMessageDialog(null, "Troca realizada com sucesso!");
                        idproduto.setText("");
                        txtNome.setText("");
                        txtNomedatoca.setText("");
                        textArea1.setText("");
                        
                        // Limpar os campos relacionados à troca
                        recebenomeProdutoquesaiu.setText("");
                        recebeprecotrocaquesaiu.setText("");
                        
                        // Atualizar os campos de produtos com defeito
                        String nomeDefeituoso = recebenomedefeituoso.getText();
                        if (!nomeDefeituoso.isEmpty()) {
                            preencherCampos(nomeDefeituoso);
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
        JOptionPane.showMessageDialog(null, "Erro ao inserir troca: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        // Em caso de erro, faz rollback das alterações para garantir a consistência dos dados
        try {
            if (conexao.isConnected()) {
                conexao.getConnection().rollback();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer rollback: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } finally {
        // Restaura o autocommit para o valor padrão
        try {
            if (conexao.isConnected()) {
                conexao.getConnection().setAutoCommit(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao restaurar o autocommit: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(TelaTrocas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTrocas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTrocas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTrocas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTrocas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confrimartroca;
    private javax.swing.JLabel Diferprecolabel;
    private javax.swing.JLabel Divisoria2;
    private javax.swing.JLabel Divisoria3;
    private javax.swing.JList<String> Listaquerecebeodefeituoso;
    private javax.swing.JList<String> Listaquerecebeonovoproduto;
    private javax.swing.JScrollPane Scrolllist;
    private javax.swing.JScrollPane Scrolllist1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel idproduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labeldevolucaovalor;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JLabel labeltitulo1;
    private javax.swing.JLabel recebenome1;
    private javax.swing.JLabel recebenomeProdutoquesaiu;
    private javax.swing.JLabel recebenomedefeituoso;
    private javax.swing.JLabel recebeprecotrocadefeituoso;
    private javax.swing.JLabel recebeprecotrocaquesaiu;
    private java.awt.TextArea textArea1;
    private javax.swing.JLabel tracegado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomedatoca;
    // End of variables declaration//GEN-END:variables
}

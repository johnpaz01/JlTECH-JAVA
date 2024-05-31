package Telaprincipal;

import  BACK.TimeDifference;
import BACK.Conexao;
import BACK.Relatorios;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
public class Telaprincipal extends javax.swing.JFrame {

    Conexao CONEXAO = new Conexao();
    DefaultListModel MODELO;
    protected String nome;
    
    public Telaprincipal(String name) {
        initComponents();
       setExtendedState(JFrame.MAXIMIZED_BOTH);
        funcionarioname.setEditable(false);
        Nomeempresa2.setEditable(false);
        entradahora.setEditable(false);
        funcionarioname.setHorizontalAlignment(SwingConstants.CENTER);
         Nomeempresa2.setHorizontalAlignment(SwingConstants.CENTER);
        entradahora.setHorizontalAlignment(SwingConstants.CENTER);
       LocalTime horaAtual = LocalTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
       String horaFormatada = horaAtual.format(formatter);
        entradahora.setText(horaFormatada);
        funcionarioname.setText(name);
        this.nome = name;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CADASTROPRODUTOS = new javax.swing.JButton();
        SEPARADORLABELA = new javax.swing.JLabel();
        vendasbutton = new javax.swing.JButton();
        SEPARADORLABELA1 = new javax.swing.JLabel();
        trocabutton = new javax.swing.JButton();
        SEPARADORLABELA2 = new javax.swing.JLabel();
        assitenciatecbutton = new javax.swing.JButton();
        cadfuncionariobutton = new javax.swing.JButton();
        SEPARADORLABELA3 = new javax.swing.JLabel();
        SEPARADORLABELA4 = new javax.swing.JLabel();
        editarprodutos = new javax.swing.JButton();
        sairbutton = new javax.swing.JButton();
        relatorioassitencias = new javax.swing.JButton();
        Divisorhorizopntal = new javax.swing.JLabel();
        Divisorhorizopntal1 = new javax.swing.JLabel();
        botãoAjuda = new javax.swing.JButton();
        Divisorhorizopntal2 = new javax.swing.JLabel();
        Excluirfuncionario = new javax.swing.JButton();
        relatoriovendas = new javax.swing.JButton();
        Divisorhorizopntal3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        funcionarioname = new javax.swing.JTextField();
        entradahora = new javax.swing.JTextField();
        Nomeempresa2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Divisorhorizopntal4 = new javax.swing.JLabel();
        Divisorhorizopntal5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("developer by: John Victor");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1360, 760, 100, 24);

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(130, 255, 55));
        jLabel2.setText("ALL GREEN");
        jLabel2.setToolTipText(getTitle());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1400, 740, 30, 30);

        CADASTROPRODUTOS.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CADASTROPRODUTOS.setForeground(new java.awt.Color(0, 0, 102));
        CADASTROPRODUTOS.setText("CADASTRO PRODUTOS");
        CADASTROPRODUTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTROPRODUTOSActionPerformed(evt);
            }
        });
        getContentPane().add(CADASTROPRODUTOS);
        CADASTROPRODUTOS.setBounds(70, 20, 190, 30);

        SEPARADORLABELA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SEPARADORLABELA.setText("|");
        getContentPane().add(SEPARADORLABELA);
        SEPARADORLABELA.setBounds(1270, 20, 10, 30);

        vendasbutton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        vendasbutton.setForeground(new java.awt.Color(0, 0, 102));
        vendasbutton.setText("VENDAS");
        vendasbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendasbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(vendasbutton);
        vendasbutton.setBounds(340, 20, 150, 30);

        SEPARADORLABELA1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SEPARADORLABELA1.setText("|");
        getContentPane().add(SEPARADORLABELA1);
        SEPARADORLABELA1.setBounds(270, 20, 10, 30);

        trocabutton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        trocabutton.setForeground(new java.awt.Color(0, 0, 102));
        trocabutton.setText("TROCAS");
        trocabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocabuttonActionPerformed(evt);
            }
        });
        getContentPane().add(trocabutton);
        trocabutton.setBounds(550, 20, 150, 30);

        SEPARADORLABELA2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SEPARADORLABELA2.setText("|");
        getContentPane().add(SEPARADORLABELA2);
        SEPARADORLABELA2.setBounds(500, 20, 10, 30);

        assitenciatecbutton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        assitenciatecbutton.setForeground(new java.awt.Color(0, 0, 102));
        assitenciatecbutton.setText("ASSITENCIAS TÉCNICAS");
        assitenciatecbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assitenciatecbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(assitenciatecbutton);
        assitenciatecbutton.setBounds(750, 20, 200, 30);

        cadfuncionariobutton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cadfuncionariobutton.setForeground(new java.awt.Color(0, 0, 102));
        cadfuncionariobutton.setText("CADASTRO DE FUNCIONÁRIOS");
        cadfuncionariobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadfuncionariobuttonActionPerformed(evt);
            }
        });
        getContentPane().add(cadfuncionariobutton);
        cadfuncionariobutton.setBounds(1020, 20, 240, 30);

        SEPARADORLABELA3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SEPARADORLABELA3.setText("|");
        getContentPane().add(SEPARADORLABELA3);
        SEPARADORLABELA3.setBounds(710, 20, 10, 30);

        SEPARADORLABELA4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SEPARADORLABELA4.setText("|");
        getContentPane().add(SEPARADORLABELA4);
        SEPARADORLABELA4.setBounds(960, 20, 10, 30);

        editarprodutos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        editarprodutos.setForeground(new java.awt.Color(0, 0, 102));
        editarprodutos.setText("Editar produtos");
        editarprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarprodutosActionPerformed(evt);
            }
        });
        getContentPane().add(editarprodutos);
        editarprodutos.setBounds(1260, 290, 190, 30);

        sairbutton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        sairbutton.setForeground(new java.awt.Color(0, 0, 102));
        sairbutton.setText("SAIR");
        sairbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(sairbutton);
        sairbutton.setBounds(1310, 20, 72, 30);

        relatorioassitencias.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        relatorioassitencias.setForeground(new java.awt.Color(0, 0, 102));
        relatorioassitencias.setText("Relátorio Assistências");
        relatorioassitencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioassitenciasActionPerformed(evt);
            }
        });
        getContentPane().add(relatorioassitencias);
        relatorioassitencias.setBounds(1270, 410, 180, 30);

        Divisorhorizopntal.setText("______________________________________");
        getContentPane().add(Divisorhorizopntal);
        Divisorhorizopntal.setBounds(1240, 500, 190, 16);

        Divisorhorizopntal1.setText("______________________________________");
        getContentPane().add(Divisorhorizopntal1);
        Divisorhorizopntal1.setBounds(1240, 320, 190, 16);

        botãoAjuda.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botãoAjuda.setForeground(new java.awt.Color(0, 0, 102));
        botãoAjuda.setText("Ajuda");
        botãoAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(botãoAjuda);
        botãoAjuda.setBounds(1280, 530, 170, 30);

        Divisorhorizopntal2.setText("______________________________________");
        getContentPane().add(Divisorhorizopntal2);
        Divisorhorizopntal2.setBounds(40, 404, 190, 16);

        Excluirfuncionario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Excluirfuncionario.setForeground(new java.awt.Color(0, 0, 102));
        Excluirfuncionario.setText("Excluir funcionário");
        Excluirfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirfuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(Excluirfuncionario);
        Excluirfuncionario.setBounds(1270, 470, 180, 30);

        relatoriovendas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        relatoriovendas.setForeground(new java.awt.Color(0, 0, 102));
        relatoriovendas.setText("Relátorio de Vendas");
        relatoriovendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriovendasActionPerformed(evt);
            }
        });
        getContentPane().add(relatoriovendas);
        relatoriovendas.setBounds(1270, 350, 180, 30);

        Divisorhorizopntal3.setText("______________________________________");
        getContentPane().add(Divisorhorizopntal3);
        Divisorhorizopntal3.setBounds(1240, 440, 190, 16);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Hora entrada:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 420, 130, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Empresa:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 270, 80, 17);

        funcionarioname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        funcionarioname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarionameActionPerformed(evt);
            }
        });
        getContentPane().add(funcionarioname);
        funcionarioname.setBounds(40, 380, 200, 30);

        entradahora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradahoraActionPerformed(evt);
            }
        });
        getContentPane().add(entradahora);
        entradahora.setBounds(40, 450, 200, 30);

        Nomeempresa2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Nomeempresa2.setText("JL - TECH");
        Nomeempresa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nomeempresa2ActionPerformed(evt);
            }
        });
        getContentPane().add(Nomeempresa2);
        Nomeempresa2.setBounds(40, 300, 190, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Funcionário ativo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 360, 130, 17);

        Divisorhorizopntal4.setText("______________________________________");
        getContentPane().add(Divisorhorizopntal4);
        Divisorhorizopntal4.setBounds(1240, 380, 190, 16);

        Divisorhorizopntal5.setText("______________________________________");
        getContentPane().add(Divisorhorizopntal5);
        Divisorhorizopntal5.setBounds(40, 340, 190, 16);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/iconeSair.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1280, 20, 30, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/iconecadastrofuncionario.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(980, 20, 40, 32);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/iconecompras.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 20, 40, 32);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/Iconetrocas.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(510, 20, 40, 32);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/iconeExcluirfuncionario.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1230, 470, 40, 32);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/Iconerelatorios.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1230, 410, 40, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/Iconecadastrar.png"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 20, 40, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/iconeSair.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1280, 20, 30, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/Iconeeditar.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1230, 290, 40, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/Iconerelatorios.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(1230, 350, 40, 40);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/iconeajuda.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(1240, 530, 50, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icones/icopneassistencia.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(720, 20, 30, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Designtelaprincipal.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(-210, -80, 1940, 870);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vendasbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendasbuttonActionPerformed
      TelaDeVenda tlvd = new TelaDeVenda();
      tlvd.setVisible(true);
    }//GEN-LAST:event_vendasbuttonActionPerformed

    public String getNome() {
        return nome;
    }

    private void trocabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocabuttonActionPerformed
       TelaTrocas tlt = new TelaTrocas();
       tlt.setVisible(true);
    }//GEN-LAST:event_trocabuttonActionPerformed

    private void sairbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairbuttonActionPerformed
        TimeDifference timeDifference = new TimeDifference();
            timeDifference.obtersaida();
            timeDifference.caucula();
        dispose();
    }//GEN-LAST:event_sairbuttonActionPerformed

    private void cadfuncionariobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadfuncionariobuttonActionPerformed
        
        Telaverificapcad tpcad = new Telaverificapcad();
        tpcad.setVisible(true);
        
        
    }//GEN-LAST:event_cadfuncionariobuttonActionPerformed

    private void editarprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarprodutosActionPerformed
        Alterpreco alt = new Alterpreco();
        alt.setVisible(true);
    }//GEN-LAST:event_editarprodutosActionPerformed

    private void relatorioassitenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioassitenciasActionPerformed
        Relatorios.gerarRelatorioAssistencias();
    }//GEN-LAST:event_relatorioassitenciasActionPerformed

    private void relatoriovendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriovendasActionPerformed
    Relatorios.gerarRelatorioProdutos();
       
    }//GEN-LAST:event_relatoriovendasActionPerformed

    private void ExcluirfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirfuncionarioActionPerformed
   Telaverificaexclusao tlcerifica = new Telaverificaexclusao();
   tlcerifica.setVisible(true);
    }//GEN-LAST:event_ExcluirfuncionarioActionPerformed

    private void entradahoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradahoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradahoraActionPerformed

    private void funcionarionameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarionameActionPerformed
    }//GEN-LAST:event_funcionarionameActionPerformed

    private void Nomeempresa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nomeempresa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nomeempresa2ActionPerformed

    private void CADASTROPRODUTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTROPRODUTOSActionPerformed
            Cadastroprodutos tlcadp = new Cadastroprodutos();
            tlcadp.setVisible(true);
    }//GEN-LAST:event_CADASTROPRODUTOSActionPerformed

    private void assitenciatecbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assitenciatecbuttonActionPerformed
       Assistencias tlas = new Assistencias();
       tlas.setVisible(true);
    }//GEN-LAST:event_assitenciatecbuttonActionPerformed

    private void botãoAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoAjudaActionPerformed
      Ajuda tlajd = new Ajuda();
      tlajd.setVisible(true);
    }//GEN-LAST:event_botãoAjudaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CADASTROPRODUTOS;
    private javax.swing.JLabel Divisorhorizopntal;
    private javax.swing.JLabel Divisorhorizopntal1;
    private javax.swing.JLabel Divisorhorizopntal2;
    private javax.swing.JLabel Divisorhorizopntal3;
    private javax.swing.JLabel Divisorhorizopntal4;
    private javax.swing.JLabel Divisorhorizopntal5;
    private javax.swing.JButton Excluirfuncionario;
    private javax.swing.JTextField Nomeempresa2;
    private javax.swing.JLabel SEPARADORLABELA;
    private javax.swing.JLabel SEPARADORLABELA1;
    private javax.swing.JLabel SEPARADORLABELA2;
    private javax.swing.JLabel SEPARADORLABELA3;
    private javax.swing.JLabel SEPARADORLABELA4;
    private javax.swing.JButton assitenciatecbutton;
    private javax.swing.JButton botãoAjuda;
    private javax.swing.JButton cadfuncionariobutton;
    private javax.swing.JButton editarprodutos;
    private javax.swing.JTextField entradahora;
    private javax.swing.JTextField funcionarioname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton relatorioassitencias;
    private javax.swing.JButton relatoriovendas;
    private javax.swing.JButton sairbutton;
    private javax.swing.JButton trocabutton;
    private javax.swing.JButton vendasbutton;
    // End of variables declaration//GEN-END:variables



}


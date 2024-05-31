package BACK;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Relatorios {
    
    public static void gerarRelatorioAssistencias() {
    Conexao conexao = new Conexao(); // Instanciando a classe de conexão
    if (!conexao.conectar()) { // Conectando ao banco de dados
        System.err.println("Erro ao conectar ao banco de dados.");
        return;
    }

    try {
        String query = "SELECT dispositivo, servico, descricao, valor FROM assistencias";

        PreparedStatement statement = conexao.getConnection().prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        // Aqui está o código para selecionar o diretório
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecionar Diretório");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile() + "/relatorio_assistencias.txt"))) {
                writer.write("=================================================================================================================================\n");
                writer.write("\t\t\t\tJL tech\n");
                writer.write("=================================================================================================================================\n");
                writer.write("Relatório de Assistências:\n\n");

                while (resultSet.next()) {
                    String dispositivo = resultSet.getString("dispositivo");
                    String servico = resultSet.getString("servico");
                    String descricao = resultSet.getString("descricao");
                    double valor = resultSet.getDouble("valor");

                    String linha = String.format("%s - %s - %s - %.2f;\n", dispositivo, servico, descricao, valor);
                    writer.write(linha);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Relatório de assistências salvo com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.", "Cancelado", JOptionPane.WARNING_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        conexao.close(); // Fechando a conexão após o uso
    }
}

    
    public static void gerarRelatorioProdutos() {
         LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy");
    String dataFormatada = dataAtual.format(formatter);

        Conexao conexao = new Conexao(); // Instanciando a classe de conexão
        if (!conexao.conectar()) { // Conectando ao banco de dados
            System.err.println("Erro ao conectar ao banco de dados.");
            return;
        }

        try {
            String query = "SELECT p.idproduto, p.nome, p.estoque, p.vendas, COUNT(t.idtrocas) AS trocas "
                    + "FROM produtos p "
                    + "LEFT JOIN trocas t ON p.idproduto = t.idtrocas "
                    + "GROUP BY p.idproduto, p.nome, p.estoque, p.vendas";

            PreparedStatement statement = conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Aqui está o código para selecionar o diretório
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecionar Diretório");
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile() + "/relatorio"+dataFormatada+".txt"))) {
                    writer.write("=================================================================================================================================\n");
                    writer.write("\t\t\t\tJL tech\n");
                    writer.write("=================================================================================================================================\n");
                    writer.write("relatorio de produtos:\n\n");
                    writer.write("ID      -           NOME      -           Estoque   -     Vendas   -   Trocas\n\n");

                    while (resultSet.next()) {
                        int id = resultSet.getInt("p.idproduto");
                        String nome = resultSet.getString("nome");
                        int estoque = resultSet.getInt("estoque");   
                        int vendas = resultSet.getInt("vendas");           
                        int trocas = resultSet.getInt("trocas");

                        String linha = String.format("[%d]     -     [ %s ]     -    [ %d ]    -    [ %d ]     -    [ %d ];\n", id, nome, estoque, vendas, trocas);
                        writer.write(linha);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Relatório salvo com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.", "Cancelado", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.close(); // Fechando a conexão após o uso
        }
    }  
    
}

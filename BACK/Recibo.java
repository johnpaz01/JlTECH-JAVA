package BACK;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class Recibo {
    
    private static Random rd = new Random();
    
    public static void gerarRecibo(ArrayList<String> nomesProdutos, ArrayList<Double> precosProdutos, double total, String diretorio) {
        int al = rd.nextInt(9999)+1;
        StringBuilder produtos = new StringBuilder();
        for (int i = 0; i < nomesProdutos.size(); i++) {
            produtos.append(nomesProdutos.get(i)).append(" - ").append(String.format("%.2f", precosProdutos.get(i))).append("R$").append("\n");
        }

        String conteudoRecibo = "==================================\n" +
                "           JL Tech\n" +
                "==================================\n" +
                "Produtos:\n\n" +
                produtos.toString() +
                "Total: R$ " + String.format("%.2f", total) + "\n" +
                "Funcionário responsável pela venda:\n\n" +
                "__________________________________\n" +
                "Data: " + java.time.LocalDate.now() + "\n"+
                "==================================\n"+
                "Número do comprovante: "+al;

        try (PrintWriter out = new PrintWriter(new FileWriter(diretorio + "\\ReciboCod_"+al+".txt"))) {
            out.println(conteudoRecibo);
        } catch (IOException e) {
            System.err.println("Erro ao gerar o recibo: " + e.getMessage());
        }
    }
}

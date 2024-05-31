package BACK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;

    public Conexao() {
        this.servidor = "localhost";
        this.banco = "jltech";
        this.usuario = "root";
        this.senha = "admin";
    }

    public boolean conectar() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.usuario, this.senha);
            return true;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Connection getConnection() {
        return conexao;
    }

    public boolean verificarCredenciais(String cpf, String senha) {
        String sql = "SELECT COUNT(*) AS count FROM funcionarios WHERE cpf = ? AND senha = ?";
        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.usuario, this.senha); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            stmt.setString(2, senha);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt("count");
                    return count > 0; // Se houver algum registro com o CPF e senha fornecidos, retorna true
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return false; // Se ocorrer algum erro ou não houver registros correspondentes, retorna false
    }

    public String obterNomeFuncionario(String cpf) {
        String nome = null;
        String sql = "SELECT nome FROM funcionarios WHERE cpf = ?";
        Conexao conexao = new Conexao(); // Criar uma instância de Conexao
        conexao.conectar(); // Chamar o método conectar() na instância
        try (Connection connection = conexao.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nome = rs.getString("nome");
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return nome;
    }

    public void close() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
    }

    
  public boolean conectarExplicitamente() {
    try {
        this.conexao = DriverManager.getConnection("jdbc:mysql://localhost/jltech", this.usuario, this.senha);
        return true;
    } catch (SQLException ex) {
        throw new RuntimeException("Erro ao conectar ao banco de dados", ex);
    }
}

public boolean isConnected() {
    try {
        return conexao != null && !conexao.isClosed();
    } catch (SQLException ex) {
        throw new RuntimeException("Erro ao verificar status da conexão", ex);
    }
}

    
      public void atualizarQuantidadeEmEstoque(int idProduto, int novaQuantidade) {
        String sql = "UPDATE produtos SET estoque = ? WHERE idproduto = ?";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, novaQuantidade);
            stmt.setInt(2, idProduto);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar quantidade em estoque do produto", ex);
        }
    }
}

    

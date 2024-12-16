package Testes.DAO;

import Testes.conexao.Conexao;
import Testes.entitys.Produtos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {
    public void CadastrarProduto(Produtos usuario) {
        String sql = "INSERT INTO PRODUTO (NOME, PRECO, PRECOUNI, QTD) VALUES(?, ?, ?, ?)";


        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setDouble(2, usuario.getPreco());
            ps.setDouble(3, usuario.getPrecouni());
            ps.setInt(4, usuario.getQtd());

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

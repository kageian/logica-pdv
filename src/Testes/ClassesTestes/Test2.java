package Testes.ClassesTestes;

import Testes.DAO.ProdutoDAO;
import Testes.entitys.Produtos;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Produtos u = new Produtos();
        Scanner inp = new Scanner(System.in);
        while(true){
            System.out.println("Nome do produto: ");
            String nomeproduto = inp.next();
            u.setNome(nomeproduto);

            System.out.println("preco do produto: ");
            double precoproduto = inp.nextDouble();
            u.setPreco(precoproduto);

            System.out.println("Qtd do produto: ");
            int qtdproduto = inp.nextInt();
            u.setQtd(qtdproduto);

            System.out.println("Preço unitário do produto: ");
            double preocuniproduto = inp.nextDouble();
            u.setPrecouni(preocuniproduto);
            new ProdutoDAO().CadastrarProduto(u);
            System.out.println("Sair?");
            int op = inp.nextInt();
            if (op == 1){
                break;
            }else {
                System.out.println();
            }
        }

    }
}

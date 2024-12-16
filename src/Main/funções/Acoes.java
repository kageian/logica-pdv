package Main.funções;

import Main.Dados.Analisador;
import Main.banco.BancoDeDados;
import Main.banco.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class Acoes {
    //produtos
    Produtos.Uva uva = new Produtos.Uva();
    Produtos.Banana banana = new Produtos.Banana();
    Produtos.Trakinas trakinas = new Produtos.Trakinas();

    //lista dos produtos
    private ArrayList<String> produtos = new ArrayList<String>();

    // Instanciando a classe analisador para que a lista não se perca.
    private Analisador analisar;

    private double CompraParaAnalisar;

    public double getCompraParaAnalisar() {
        return CompraParaAnalisar;
    }

    public void setCompraParaAnalisar(double ComprarParaAnalisar) {
        this.CompraParaAnalisar = ComprarParaAnalisar;
    }


    public Acoes(Analisador analisar) {
        this.analisar = analisar;
    }

    public void ComprarParaAnalisar() {
        setCompraParaAnalisar(0);
    }

    public void codigoProdutos() {
        Scanner input = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);


        double totalCompra = 0;
        double totalQuantidade = 0;




        //Valores pre-settados



        while (true) {
            System.out.println();
            System.out.println("Código: (Digite 1 para sair 2 para deleta um produto ou quantidade).");


            int codigo = inp.nextInt();
            System.out.println();
            //Banana
            if (codigo == 101) {
                System.out.println("Quantidade de  " +banana.getNome() + ":");
             banana.setQtd(inp.nextInt());


                //Informações sobre abanana
                System.out.println("====================");
                System.out.println("Nome: " +banana.getNome() + "\n" + "Preço: " +banana.getPreco() + "R$" + "\n" + "Quantidade: " +banana.getQtd() + "\n" + "Valor Unitário: " +banana.getValoruni() + "R$");
                System.out.println("====================");

                // Salvar o nome do produto + a quantidade dele

                produtos.add(banana.getNome());


                //Uma variavel que vai servir para ver o calculo entre as quantidads vezes o preço.
                totalQuantidade =banana.getPreco() *banana.getQtd();

                //Total da compra é da compra de um usuario apenas
                totalCompra += totalQuantidade;

                System.out.println("------------------------------");
                System.out.println("Total do produto " + totalQuantidade + "R$");
                System.out.println("------------------------------");

            } else if (codigo == 102) {
                System.out.println("Quantidade de " + uva.getNome() + ":");
                uva.setQtd(inp.nextInt());
                System.out.println("====================");
                System.out.println("Nome: " + uva.getNome() + "\n" + "Preço: " + uva.getPreco() + "R$" + "\n" + "Quantidade: " + uva.getQtd() + "\n" + "Valor Unitário: " + uva.getValoruni() + "R$");
                System.out.println("====================");

                produtos.add(uva.getNome());

                totalQuantidade = uva.getPreco() * uva.getQtd();
                totalCompra += totalQuantidade;

                System.out.println("------------------------------");
                System.out.println("Total do produto " + totalQuantidade + "R$");
                System.out.println("------------------------------");

            } else if (codigo == 1) {
                while (true) {
                    System.out.println("Dinheiro para pagar: ");
                    double pagar = inp.nextDouble();

                    if (pagar > totalCompra) {
                        double troco = pagar - totalCompra;
                        System.out.println("Troco de : " + troco);
                        break;
                    } else if (pagar < totalCompra) {
                        //pagar é o cliente que esta efetuando
                        // Total da compra é o total que deu

                        double troco = totalCompra - pagar;
                        System.out.println("Esta faltando : " + troco + "\n" + "Total para pagar: " + totalCompra);


                    } else {
                        break;
                    }
                }
                analisar.AdicionarNaLista(totalCompra);
                break;

                // Exclusão de produtos
            } else if (codigo == 2) {
                System.out.println("Código do produto ");
                System.out.println("101 - " +banana.getNome() + "\n" + "102 - " + uva.getNome());
                int code = inp.nextInt();

                if (code == 101) {
                    if (banana.getQtd() == 0) {
                        System.out.println("Produto tem 0 quantidades.");
                        continue;
                    } else {

                        System.out.println("Quantidade  de " +banana.getQtd() + ":");
                        System.out.println(" Deseja tirar quantas? ( 0 para voltar 100  para excluir  )");
                        int delete = inp.nextInt();
                        if (delete == 0) {
                            break;
                        } else if (delete >= 100) {
                            totalCompra -=banana.getPreco() *banana.getQtd();
                          banana.setQtd(0);
                            produtos.remove(banana.getNome());
                        } else if (delete <=banana.getQtd()) {
                            // Subtrai o valor anterior para que possamos atribuir a quantidade atual
                            totalCompra -=banana.getPreco() *banana.getQtd();

                            // Atualizando a quantidade atual
                          banana.setQtd(banana.getQtd() - delete);

                            // Atribuindo um novo vaLor para o total da compra
                            totalCompra +=banana.getQtd() *banana.getPreco();
                        } else {
                            System.out.println("Codigo invalido. Tente novamente.");
                            continue;
                        }
                    }
                }
                if (code == 102) {
                    if (uva.getQtd() == 0) {
                        System.out.println("Produto tem 0 quantidades");
                        continue;
                    } else {
                        System.out.println("Quantidade : " + uva.getQtd());
                        System.out.println("Deseja tirar quantas? ( 0 para voltar 77 para excluir: )");
                        int delete = inp.nextInt();

                        if (delete == 0) {
                            break;
                        } else if (delete == 77) {
                            produtos.remove(uva.getNome());
                            totalCompra -= uva.getPreco() * uva.getQtd();
                            uva.setQtd(0);
                        } else if (delete <= uva.getQtd()) {
                            totalCompra -= uva.getPreco() * uva.getQtd();
                            uva.setQtd(uva.getQtd() - delete);
                            totalCompra += uva.getPreco() * uva.getQtd();
                        } else {
                            System.out.println("Invalido, tente novamente.");
                            continue;
                        }
                    }
                } else {
                    System.out.println("Codigo invalido.Verifique o código e tente novamente");
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println("Total a pagar: " + totalCompra + "R$");
            System.out.println();

        }
    }


}

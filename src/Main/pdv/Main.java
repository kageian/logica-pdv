package Main.pdv;

import Main.Dados.Analisador;
import Main.funções.Acoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Analisador analise = new Analisador();
        Acoes acoes = new Acoes(analise);

        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.print("Escolha uma das opções abaixo.\n" +
                    "[ 1 ] Colocar Código\n" +
                    "[ 2 ] Analisar diaria\n" +
                    "[ 3 ] ...\n" +
                    "[ 0 ] Sair\n");
            
            int op = input.nextInt();
            if (op == 1) {
                acoes.codigoProdutos();
            } else if (op == 2) {
                analise.VerLista();

            } else if (op == 3) {
                System.out.println("Estou pensando em o que colocar aqui.");

            } else if (op == 0) {
                break;
            } else {
                System.out.println("Comando inexistente. Digite novamente o comando.");
                System.out.println();
            }
        }
    }
}

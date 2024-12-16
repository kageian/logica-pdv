package Testes.ClassesTestes;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    private static ArrayList<String> test = new ArrayList<String>();
    private ArrayList<Integer> quantidade  = new ArrayList<Integer>();
    Scanner inp = new Scanner(System.in);

    public void Colocar() {
        while (true) {
            System.out.println(" [ 1 ] para selecionar [ 0 ] para sair");
            int op = inp.nextInt();
            if ( op == 1 ){
                System.out.println(" Qual produto: ");
                String produto = inp.next();
                test.add(produto);
            } else if (op == 0) {
                break;
            }


        }
    }
    public void Deletar(){
        while(true){
            System.out.println("Deseja deletar qual");
            for (int i = 0; i <test.size(); i++) {
                System.out.println("[ "+ i + " ]"+ " - "+ test.get(i));
            }
            int op = inp.nextInt();
            if (op > test.size())
                System.out.println("Errado, tente novamente");

            else {
                test.remove(op);
                System.out.println("Sair? ( 0 para sair )");
                break;

            }
            int op1 = inp.nextInt();
            if (op == 0){
                break;
            }
        }

    }

}



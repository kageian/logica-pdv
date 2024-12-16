package Main.Dados;

import java.util.ArrayList;

public class Analisador {
    double total = 0;
    private ArrayList<Double> vende = new ArrayList<Double>();



    public void AdicionarNaLista(double Vendas) {
        vende.add(Vendas);
    }

    //Percorre toda a lista para somar tudo.
    public void VerLista() {
        for (int i = 0; i < vende.size(); i++) {
            total += vende.get(i);
        }
        System.out.println("====================");
        System.out.println("Total de vendas atual: " + total);
        System.out.println("====================");
        System.out.println();
        total = 0;
    }

}




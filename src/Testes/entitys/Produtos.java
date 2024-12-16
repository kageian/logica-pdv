package Testes.entitys;

public class Produtos {
    private int codigo;
    private String nome;
    private int qtd;
    private double preco;
    private double precouni;


    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecouni() {
        return precouni;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQtd() {
        return qtd;
    }



    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPrecouni(double precouni) {
        this.precouni = precouni;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}

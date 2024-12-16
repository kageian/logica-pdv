package Main.banco;

// Classe base para produtos
public abstract class BancoDeDados {
    private String nome;
    private double preco;
    private double valoruni;
    private int qtd;

    // Construtor
    public BancoDeDados(String nome, double preco, double valoruni, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.valoruni = valoruni;
        this.qtd = qtd;
    }

    // Métodos Getter
    public String getNome() {
        return nome;
    }

    public double getValoruni() {
        return valoruni;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    // Métodos Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setValoruni(double valoruni) {
        this.valoruni = valoruni;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}


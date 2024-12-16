package Main.banco;

// Classe Produtos com as classes internas estáticas
public class Produtos {

    // Classebanana
    public static class Banana extends BancoDeDados {
        public Banana() {
            super("Cacho de banana", 8.0, 2.0, 10);
        }
    }

    // Classe uva
    public static class Uva extends BancoDeDados {
        public Uva() {
            super("Cachos de uva", 8.0, 0.2, 20);
        }
    }

    // Classe Trakinas
    public static class Trakinas extends BancoDeDados {
        public Trakinas() {
            super("Biscoito Trakinas", 10.0, 10.0, 1);
        }
    }
}

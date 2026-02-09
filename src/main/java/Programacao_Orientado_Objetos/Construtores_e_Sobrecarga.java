package Programacao_Orientado_Objetos;

class Produto {

    private String nome;
    private double preco;

    // --- CONSTRUTORES (SOBRECARGA) ---
    // Construtor 1: Recebe apenas o nome
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0; // Preço padrão inicial
        System.out.println("Produto '" + nome + "' criado com preço zerado.");
    }

    // Construtor 2: Recebe nome E preço (Sobrecarga)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        System.out.println("Produto '" + nome + "' criado com preço de R$ " + preco);
    }

    // --- MÉTODOS ---
    public void exibirDetalhes() {
        System.out.println("Item: " + nome + " | Valor: R$ " + preco);
    }
}

public class Construtores_e_Sobrecarga {

    public static void main(String[] args) {

        // Usando o Construtor 1 (Só nome)
        // O Java "pula" para a versão que aceita apenas 1 String
        Produto p1 = new Produto("Caderno");

        // Usando o Construtor 2 (Nome e Preço)
        // O Java "pula" para a versão que aceita String e Double
        Produto p2 = new Produto("Caneta", 2.50);

        System.out.println("\n--- Resumo do Estoque ---");
        p1.exibirDetalhes();
        p2.exibirDetalhes();
    }
}

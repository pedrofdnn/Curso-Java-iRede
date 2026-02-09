package Programacao_Orientado_Objetos.Polimorfismo.Ex_Polimorfismo;

// Exemplo simples de um sistema em RH.

public class Funcionario {

    private String nome;
    protected double salario; // 'protected' permite que as filhas vejam o salário diretamente

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Polimorfismo: Cada cargo terá um bônus diferente
    public double calcularBonus() {
        return this.salario * 0.05; // Bônus padrão de 5%
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + nome + " | Salário: R$ " + salario);
    }
}

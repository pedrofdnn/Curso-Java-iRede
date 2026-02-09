package Programacao_Orientado_Objetos.Polimorfismo.Ex_Polimorfismo;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario); // Envia os dados para o construtor do Pai (Funcionario)
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.20; // Gerente ganha 20% de bônus
    }
}

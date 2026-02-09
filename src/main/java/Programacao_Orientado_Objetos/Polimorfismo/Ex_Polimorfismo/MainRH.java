package Programacao_Orientado_Objetos.Polimorfismo.Ex_Polimorfismo;

import java.util.Scanner;

public class MainRH {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do Gerente: ");
        String nomeG = leitor.nextLine();

        System.out.print("Digite o salário do Gerente: ");
        double salG = leitor.nextDouble();

        // Criando o objeto
        Gerente g1 = new Gerente(nomeG, salG);

        System.out.println("\n--- Folha de Pagamento ---");
        g1.exibirDados();
        System.out.println("Bônus Anual: R$ " + g1.calcularBonus());

        leitor.close();
    }
}

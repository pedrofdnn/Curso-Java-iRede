package Exercicios_por_modulos.Exercicios_Modulo_1;

//    3. Implemente um programa que exiba um menu com 3 opções:
//       1 - Somar dois números
//       2 - Subtrair dois números
//       3 - Sair
//       O programa deve usar switch para executar a operação escolhida.
//
import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] arg) {

        Scanner leitor = new Scanner(System.in);

//        Menu para exibir
        System.out.println("MENU DE OPÇÕES:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Sair");

//        variaveis
        int num1 = 10;
        int num2 = 10;

        boolean check = true;

        while (check) {

            System.out.print("Digite a opção desejada: ");
            int opcaoEscolhida = leitor.nextInt();
            System.out.println("Opção escolhida foi: " + opcaoEscolhida);

            switch (opcaoEscolhida) {

                case 1:
                    System.out.println("Voce escolheu Somar: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    check = false;
                    break;
                case 2:
                    System.out.println("Voce escolheu Ssubtrair: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    check = false;
                    break;
                case 3:
                    System.out.println("Voce escolheu sair.");
                    check = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

}

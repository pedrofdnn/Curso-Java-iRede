package Exercicios_Modulo_1;

//    8. Crie um programa que exiba um menu repetitivo com as opções:
//       1 - Dizer "Olá"
//       2 - Dizer "Tchau"
//       3 - Encerrar
//       O menu deve continuar aparecendo até que o usuário escolha a opção 3.
//
import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        System.out.println("\nResposta da questão 8");
//        
//        Menu para exibir
        System.out.println("MENU DE OPÇÕES:");
        System.out.println("1 - Olá!");
        System.out.println("2 - Tchau.");
        System.out.println("3 - Encerrar.");
//        opções 
        int ola = 1;
        int tchau = 2;
        int encerrar = 3;
//        seletor
        Scanner seletor = new Scanner(System.in);

        boolean check = true;

        while (check) {

            System.out.print("Escolha uma opção:");
            int select = seletor.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Voce escolheu a opção: " + ola);

                    break;
                case 2:
                    System.out.println("Voce escolheu a opção: " + tchau);

                    break;
                case 3:
                    System.out.println("Voce escolheu a opção: " + encerrar);
                    check = false;
                    break;
                default:
                    System.out.println("Opção invalida tente novamente.");

            }
        }

    }

}

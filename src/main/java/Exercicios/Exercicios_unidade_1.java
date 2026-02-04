//Atividade numero 1
package Exercicios;

public class Exercicios_unidade_1 {

    public static void main(String[] args) {

//    1. Escreva um programa Java que use os operadores lógicos para vericar se um
//      número está entre 10 e 20 (inclusive). Use int numero = 15;.
        System.out.println("Resposta da questão 1");
//        
        int numero = 15;
        if (numero >= 10 && numero <= 20) {
            System.out.println("O número " + numero + " está no intervalo.");
        }

//    2. Escreva um programa que mostre na tela os tipos de dados primitivos em Java
//      com seus valores atribuídos.
        System.out.println("\nResposta da questão 2");
//        
        byte total1 = 127;
        short total2 = 32000;
        int total3 = 2000000000;
        long total4 = 9000000000l;
        float total5 = 3.14f;
        double total6 = 3.141592653589;
        char tipo1 = 'P';
        boolean tipo2 = true;

        System.out.println("Os tipos primitivos são: Byte = " + total1 + "\nShort = " + total2 + "\nInteiro = " + total3
                + "\nLong = " + total4 + "\nFloat = " + total5 + "\nDouble = " + total6 + "\nChar = " + tipo1 + "\nBoolean = " + tipo2);

//    3. Implemente um programa que exiba um menu com 3 opções:
//       1 - Somar dois números
//       2 - Subtrair dois números
//       3 - Sair
//       O programa deve usar switch para executar a operação escolhida.
//
        System.out.println("\nResposta da questão 3");
//        Menu para exibir
        System.out.println("MENU DE OPÇÕES:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Sair");
//        variaveis
        int num1 = 10;
        int num2 = 10;
//        opções
        int opcaoSoma = 1;
        int opcaoSub = 2;
        int opcaoExit = 3;
//        Seletor
        int opcaoEscolhida = 4;

//     
        switch (opcaoEscolhida) {
            case 1:
                System.out.println("Voce escolheu Somar: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Voce escolheu Ssubtrair: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Voce escolheu saiu!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
//        
//
//    4. Crie um programa que leia um número inteiro do usuário e imprima a tabuada
//       desse número (de 1 a 10), usando um laço for.
        System.out.println("\nResposta da questão 4");

        int numeroBase = 2;
//        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroBase + " x " + i + " = " + (numeroBase * i));
        };

        //    
//    5. Faça um programa que leia uma string e substitua todas as ocorrências da letra "e"
//       por "*".
        System.out.println("\nResposta da questão 5");

    }

}

package Exercicios_por_modulos.Exercicios_Modulo_1;
//
//    4. Crie um programa que leia um número inteiro do usuário e imprima a tabuada
//       desse número (de 1 a 10), usando um laço for.

import java.util.Scanner;

//
public class Exercicio_04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite qual tabuada de multiplicação quer ver: ");
        int opcaoEscolhida = leitor.nextInt();
        System.out.println("Tabuada de: " + opcaoEscolhida);

        for (int i = 1; i <= 10; i++) {
            System.out.println(opcaoEscolhida + " x " + i
                    + " = " + (opcaoEscolhida * i));
        };
    }

}

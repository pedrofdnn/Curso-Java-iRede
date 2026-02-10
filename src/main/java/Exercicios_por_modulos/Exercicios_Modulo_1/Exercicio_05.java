package Exercicios_por_modulos.Exercicios_Modulo_1;
//
//    5. Faça um programa que leia uma string e substitua todas as ocorrências da letra "e"
//       por "*".

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra com a letra 'E': ");

        String textoDigitado = leitor.nextLine();

        if (textoDigitado.contains("e") || textoDigitado.contains("E")) {
            String resultado = textoDigitado.replace("e", "*").replace("E", "*");
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Não existe letra 'e' nessa palavra. ");
        }

    }

}

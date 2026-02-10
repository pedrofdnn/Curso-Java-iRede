package Exercicios_por_modulos.Exercicios_Modulo_1;

//    7. Crie um programa que leia um número inteiro não-negativo e calcule seu fatorial
//       utilizando o laço for.
//       Exemplo: Entrada = 5 Saída = 120
//
import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para fatorar: ");
        int number = leitor.nextInt();

        int fator = 1;

        for (int i = number; i >= 1; i--) {
//            fatorial recebe a si e multiplica por i.
            fator = fator * i;
            System.out.println("Multiplicando por " + i + ", resultado é: " + fator);
        };
        System.out.println("O fatorial de " + number + " e: " + fator);
    }

}

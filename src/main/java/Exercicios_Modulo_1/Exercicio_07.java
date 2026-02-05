package Exercicios_Modulo_1;

//    7. Crie um programa que leia um número inteiro não-negativo e calcule seu fatorial
//       utilizando o laço for.
//       Exemplo: Entrada = 5 Saída = 120
//
public class Exercicio_07 {

    public static void main(String[] args) {

        System.out.println("\nResposta da questão 7");

        int contador = 5;
//        acumulador
        int fator = 1;

        for (int i = contador; i >= 1; i--) {
//            fatorial recebe a si e multiplica por i.
            fator = fator * i;
            System.out.println("Multiplicando por " + i + ", resultado é: " + fator);
        };
        System.out.println("O fatorial de " + contador + " e: " + fator);
    }

}

package Exercicios_por_modulos.Exercicios_Modulo_1;

//    1. Escreva um programa Java que use os operadores lógicos para vericar se um
//      número está entre 10 e 20 (inclusive). Use int numero = 15;.
//
public class Exercicio_01 {

    public static void main(String[] args) {

        int numero = 15;

        if (numero >= 10 && numero <= 20) {
            System.out.println("O número " + numero + " está no intervalo.");
        } else {
            System.out.println("O número " + numero + " NÃO está no intervalo.");
        }

    }
}

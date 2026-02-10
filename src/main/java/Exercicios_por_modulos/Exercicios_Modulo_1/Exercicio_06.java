package Exercicios_por_modulos.Exercicios_Modulo_1;
//
//    6. Crie um array com os seguintes nomes: "Maria", "João", "Carlos", "Ana", "Beatriz". Em
//       seguida, peça um nome ao usuário e diga se ele está ou não no array.

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] pessoas = {"Maria", "João", "Carlos", "Ana", "Beatriz"};

        System.out.println("Adivinhe os nomes com as iniciais: 'A','B','C','J','M'");

        boolean chek = false;

        while (chek == false) {

            System.out.print("Digite um nome para buscar: ");
            String chamada = leitor.nextLine();

            for (String nome : pessoas) {

                if (nome.equalsIgnoreCase(chamada)) {
                    chek = true;
                    break;
                }
            }

            if (chek) {
                System.out.println("'" + chamada + "' Muito bem! Voce acertou miseráve!");
            } else {
                System.out.println("Vix! esse nome '" + chamada + "' não tem, tente novamente seu carralo. ");
            }
        }
    }
}

package Exercicios_por_modulos.Exercicios_Modulo_1;

//10. Escreva um programa que leia uma frase e conte quantas palavras ela possui
//(considere as palavras separadas por espaços).
//
import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {
        Scanner impuntPhrase = new Scanner(System.in);

        System.out.print("Digite uma frase:");
        String receive = impuntPhrase.nextLine();

        String phrase = receive;

        String[] countPhrase = phrase.split(" ");

        int contador = 0;
        String result = "";

        for (String letter : countPhrase) {

            if (!letter.isEmpty()) {
                contador++;

                String firtsLetter = letter.substring(0, 1).toUpperCase();
                String secondLetter = letter.substring(1);

                result += firtsLetter + secondLetter + " ";
            }
        }
        System.out.println("Aqui esta sua frase: " + result.trim() + ".");
        System.out.print("A frase possui: " + contador + ", Palavras. ");
    }
}

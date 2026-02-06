package Exercicios_Modulo_1;

//  9. Faça um programa que leia o nome completo de uma pessoa e mostre o primeiro
//     nome e o último nome separadamente.
//
import java.util.Scanner;

public class Exercicio_09 {

    public static void main(String[] args) {

        Scanner impuntName = new Scanner(System.in);

        System.out.print("Digite o seu nome completo:");
        String receive = impuntName.nextLine();
        
        String[] partsName = receive.split(" ");

        String result = "";

        for (String parts : partsName) {
            
            if (!parts.isEmpty()) {
                String firtsLetter = parts.substring(0, 1).toUpperCase();
                String secondLetter = parts.substring(1);

                result += firtsLetter + secondLetter + " ";
            }
        }

        System.out.print("Seu nome completo é: " + result.trim());
        System.out.print("Seu nome completo é: " + result.trim());
        System.out.print("Seu nome completo é: " + result.trim());
        
    }
}

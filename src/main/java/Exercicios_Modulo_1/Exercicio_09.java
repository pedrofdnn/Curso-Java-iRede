package Exercicios_Modulo_1;

//  9. Faça um programa que leia o nome completo de uma pessoa e mostre o primeiro
//     nome e o último nome separadamente.
//
import java.util.Scanner;

public class Exercicio_09 {

    public static void main(String[] args) {

        Scanner impuntName = new Scanner(System.in);

        System.out.print("Digite o Seu nome Completo:");
        String receive = impuntName.nextLine();

        String[] listNames = {receive};

        for (String name : listNames) {
            String firtsLetter = name.substring(0, 1).toUpperCase();
            String secondLetter = name.substring(1);

            System.out.println("Seu nome completo é: "
                    + firtsLetter + "" + secondLetter);

        }
    }
}

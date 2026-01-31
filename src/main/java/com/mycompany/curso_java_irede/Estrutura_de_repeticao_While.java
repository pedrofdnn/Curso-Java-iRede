package com.mycompany.curso_java_irede;

//  Utilizado quando não se sabe o número exato de repetições, mas enquanto a 
//  condição for verdadeira, o bloco será executado.
public class Estrutura_de_repeticao_While {

    public static void main(String[] args) {
        int contador1 = 0;
        int contador2 = 50;

//        EX1
        while (contador1 <= 5) {
            System.out.println("Contador: " + contador1);
            contador1++;
        }

//        EX2
        while (contador2 > 15) {
            System.out.println("Contador: " + contador2);
            contador2--;
        }
    }
}

package com.mycompany.curso_java_irede;

//    Semelhante ao while, mas garante que o bloco de código seja executado ao menos uma vez.
public class Estrutura_de_repeticao_DoWhile {

    public static void main(String[] args) {
        int numero = 0;

        do {
            System.out.println("Numero: " + numero);
            numero++;
        } while (numero < 3);
    }
}

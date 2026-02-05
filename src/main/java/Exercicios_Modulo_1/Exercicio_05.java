package Exercicios_Modulo_1;
//
//    5. Faça um programa que leia uma string e substitua todas as ocorrências da letra "e"
//       por "*".

public class Exercicio_05 {

    public static void main(String[] args) {

        String[] coisas = {"Escola", "Cerveja", "Sapato", "Igreja"};

        String palavras[] = coisas;

        System.out.println(palavras.length);

        for (int i = 0; i < coisas.length; i++) {
            System.out.println(coisas[i].replace("e", "*").replace("E", "*"));
        }

    }

}

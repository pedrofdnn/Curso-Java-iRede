package Exercicios_Modulo_1;
//
//    6. Crie um array com os seguintes nomes: "Maria", "João", "Carlos", "Ana", "Beatriz". Em
//       eguida, peça um nome ao usuário e diga se ele está ou não no array.

public class Exercicio_06 {

    public static void main(String[] args) {

        System.out.println("\nResposta da questão 6");

        String[] pessoas = {"Maria", "João", "Carlos", "Ana"};
//        seletor
        String chamada = "Pedro";
//        coparacao
        boolean presente = false;
//        checagem
        for (String nome : pessoas) {
            if (nome.equals(chamada)) {
                presente = true;
                break;
            }
        }

        if (presente) {
            System.out.println("O aluno " + chamada + " Esta presente!");
        } else {
            System.out.println("O aluno " + chamada + " não esta presente!");
        }
    }

}

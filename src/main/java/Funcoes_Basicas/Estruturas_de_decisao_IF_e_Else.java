package Funcoes_Basicas;

//Modo Comum para realizar uma decisao
public class Estruturas_de_decisao_IF_e_Else {

    public static void main(String[] args) {
//        EX1
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Voce e maior de idade!");
        } else {
            System.out.println("Voce nao e maior de idade");
        }

//        EX2
        int nota = 33;
        if (nota >= 95) {
            System.out.println("Conceito A");
        } else if (nota >= 80) {
            System.out.println("Conceito B");
        } else if (nota >= 60) {
            System.out.println("Conceito C");
        } else if (nota >= 50) {
            System.out.println("Conceito D");
        } else if (nota >= 40) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
    }

}

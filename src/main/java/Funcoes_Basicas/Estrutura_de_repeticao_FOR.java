package Funcoes_Basicas;

//  O uso de loop executa o mesmo bloco varias vezes ate a condicao ser verdadeira.
//  No caso do For ele é usado quando se sabe exatamente a quantidade de loops.
public class Estrutura_de_repeticao_FOR {

    public static void main(String[] args) {
//        EX1
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

//        EX2
        for (int i = 5; i > -1; i--) {
            System.out.println("Valor de i: " + i);
        }
    }
}

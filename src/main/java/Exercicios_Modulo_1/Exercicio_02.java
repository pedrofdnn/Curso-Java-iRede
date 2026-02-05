package Exercicios_Modulo_1;

//    2. Escreva um programa que mostre na tela os tipos de dados primitivos em Java
//       com seus valores atribuídos.
//
public class Exercicio_02 {

    public static void main(String[] args) {

//        
        byte total1 = 127;
        short total2 = 32000;
        int total3 = 2000000000;
        long total4 = 9000000000L;
        float total5 = 3.14f;
        double total6 = 3.141592653589;
        char tipo1 = 'P';
        boolean tipo2 = true;

        System.out.println(
                "Os tipos primitivos são: Byte = " + total1 + "\nShort = " + total2 + "\nInteiro = " + total3
                + "\nLong = " + total4 + "\nFloat = " + total5 + "\nDouble = " + total6 + "\nChar = " + tipo1 + "\nBoolean = " + tipo2);

    }
}

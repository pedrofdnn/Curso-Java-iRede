package Funcoes_Basicas;

import java.util.ArrayList;
import java.util.Arrays;

public class Uso_de_Strings {

    public static void main(String[] args) {

//        Exemplos de declaracoes
        String nome1 = "Maria ";
        String sobrenome = new String("Silva");
        System.out.println(nome1 + sobrenome);

//        Concatenar strings
        String nome2 = "Pedro";
        String saudacao = "Ola, " + nome2;
        System.out.println(saudacao);

//        Identificar a quantidade de letras na String
        String frase = " Java e tenso";
        System.out.println(frase.length());

//        Acessa os caracteres e da retorno da posição desejada
        String palavra = "Passaro";
        char letra = palavra.charAt(3);
        System.out.println(letra);

//        Funcao para deixar as palavras em Menusculas e Maiusculas.
        String fala = "Vem aqui!";
        System.out.println(fala.toUpperCase());
        System.out.println(fala.toLowerCase());

//        Funcao para buscar a posicao de um caractere em uma string
        String texto = "Aprendendo Java";
        System.out.println(texto.contains("Java"));  // buscar nome completo.
        System.out.println(texto.startsWith("Apr")); // busca no inicio. 
        System.out.println(texto.endsWith("va"));    // busca no final.

//        Extracao de partes de uma string.
        String palavra2 = "Paz e Amor";
        String parte1 = palavra2.substring(8); // exclui a quantidade de caratere selecionada e imprime o resto.
        String parte2 = palavra2.substring(2, 10); // primeira coluna exlui a quantidade e a segunda mostra o resto.
        System.out.println(parte1);
        System.out.println(parte2);

//         Remove os espaços de todos os lados.
        String remove = "  texto  ";
        System.out.println(remove);
        String apaga = remove.trim();
        System.out.println(apaga);

//        Divide String em partes em um array com base em um separador.
        String palavras = "Paz-Amor-jesus";
        String[] partes = palavras.split("-");
        System.out.println(partes[2]);
        System.out.println(partes[1]);
        System.out.println(partes[0]);

//        Comparador de Strings que comeca com letras maiusculas e menusculas.
        String a = "paz";
        String b = "Paz";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

//        Verificar o tamanho de uma array
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        System.out.println("Quantidade de nomes: " + nomes.size());

//        metodos de acessar Strings e manipular e uso de funções.
// 
//      EX1
//        Array com valores fixos.
        int[] numeros = {1, 2, 3, 4};
//        Acessando o primeiro elemento (indice 0).
        System.out.println(numeros[0]);
//        Para adcionar um novo elemento na array e necessario criar uma nova constante.
        int[] novoNumero = new int[numeros.length + 1];
//        Usando loop para copiar os numeros antigos.
        for (int i = 0; i < numeros.length; i++) {
            novoNumero[i] = numeros[i];
        }
//        Adcionando o novo elemento.
        novoNumero[novoNumero.length - 1] = 6;
//        Substituido o array antigo.
        numeros = novoNumero;
//        Imprimido o array atualizado.
        System.out.print("Saida : [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

//      EX2
//        Criacao de array.
        ArrayList<Integer> numeros2 = new ArrayList<>();
//        Adcionando elementos.
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(3);
//        Acessando elementos.
        System.out.println("Primeiro numero: " + numeros2.get(0));

//      EX3
//        transformar numeros em string
        int number = 1000;
        String texto2 = Integer.toString(number);
        System.out.println(texto2);

//      EX4
//        Modificando o valor da array com outro elemento.
        int[] numeros3 = {1, 2, 3, 4};
        numeros3[0] = 5;
        System.out.println(Arrays.toString(numeros3));

//      EX5
//        removendo um elemento da array
        ArrayList<String> letras = new ArrayList<>(Arrays.asList("a", "b", "c"));
        String letra2 = letras.remove(1);
        System.out.println(letra2);

//      EX6
//        Arrays multdimensionais (Matriz)
//        Declaracao de uma matriz (Matriz 2D)
        int[][] matriz = new int[2][3];

//        Inicializacao
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

//        Acesso
        System.out.println(matriz1[1][2]);

//        Percorrendo uma matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + "");
            }
            System.out.println();
        }

    }

}

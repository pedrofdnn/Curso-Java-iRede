package Funcoes_Basicas;

import java.util.Scanner; // 1. Importar a classe

public class Imput {

    public static void main(String[] args) {
        // 2. Criar o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        // 3. Ler entrada do usuário
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        // 4. Fechar o scanner
        scanner.close();

//     Principais Métodos de Leitura:
//      nextLine(): Lê uma linha inteira de texto (incluindo espaços) até a tecla Enter.
//      next(): Lê a próxima palavra (para na primeira quebra de espaço).
//      nextInt()/nextDouble(): Leem tipos numéricos específicos. 
    }

}

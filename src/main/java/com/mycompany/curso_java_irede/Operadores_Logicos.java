package com.mycompany.curso_java_irede;

public class Operadores_Logicos {

    public static void main(String[] args) {

        boolean temCarteira = true;
        boolean passouNoTeste = false;

//        operador AND (&&) - Ambos precisam ser verdadeiros.
        boolean podeDirigir = temCarteira && passouNoTeste;
        System.out.println("Pode dirigir? => " + podeDirigir);

//        operador OR (||) - So precisa de um para ser verdadeiro.
        boolean temPermissao = temCarteira || passouNoTeste;
        System.out.println("Tem permissao para dirigir? " + temPermissao);

//        Operador de negacao (!) - Inverte o valor booleano.
        System.out.println("Tem permissao para dirigir? " + !passouNoTeste);
    }

}

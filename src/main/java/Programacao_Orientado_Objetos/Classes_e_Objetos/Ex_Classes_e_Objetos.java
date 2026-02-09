package Programacao_Orientado_Objetos.Classes_e_Objetos;

class Celular {                         // A Classe (O Molde):

    // Atributos (Características)
    String marca;
    String modelo;

    // Método (Ação)
    void ligar() {
        System.out.println("O celular " + modelo + " está ligando...");
    }
}

public class Ex_Classes_e_Objetos {        // O Uso (Criando Objetos):

    public static void main(String[] args) {
        
        // Criando o primeiro objeto
        Celular meuCelular = new Celular();
        meuCelular.marca = "Apple";
        meuCelular.modelo = "iPhone 15";

        // Criando o segundo objeto
        Celular celularTrabalho = new Celular();
        celularTrabalho.marca = "Samsung";
        celularTrabalho.modelo = "S23";

        // Usando os objetos
        meuCelular.ligar();        // Saída: O celular iPhone 15 está ligando...
        celularTrabalho.ligar();   // Saída: O celular S23 está ligando...
    }
}

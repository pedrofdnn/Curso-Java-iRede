package Programacao_Orientado_Objetos.Hierarquia_de_Classes;

class Veiculo {

    String marca;

    void buzinar() {
        System.out.println("Buzinando...");
    }
}

class Carro extends Veiculo {

    int portas;

    void abrirPortamalas() {
        System.out.println("Porta-malas aberto.");
    }
}

class CarroEletrico extends Carro {

    int autonomiaBateria;

    void carregar() {
        System.out.println("Carregando bateria...");
    }
}

public class Ex_Hierarquia_de_Classes {

    public static void main(String[] args) {
        CarroEletrico meuTesla = new CarroEletrico();

        // Atributo do Nível 1 (Veiculo)
        meuTesla.marca = "Tesla";

        // Atributo do Nível 2 (Carro)
        meuTesla.portas = 4;

        // Atributo do Nível 3 (CarroEletrico)
        meuTesla.autonomiaBateria = 500;

        // Métodos de todos os níveis
        meuTesla.buzinar(); // Do Nível 1
        meuTesla.abrirPortamalas();   // Do Nível 2
        meuTesla.carregar();          // Do Nível 3
    }

}

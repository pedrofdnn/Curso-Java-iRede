package Programacao_Orientado_Objetos;

//Classe: é uma estrutura que define as características (atributos) e comportamentos (métodos) de
//um tipo de objeto. É como um molde ou projeto.
//E um objeto seria realmente algo fisico do mundo real, nesse caso usaremos um carro como exemplo.
//Definição de Objeto: é uma entidade concreta, criada a partir de um molde chamado classe.
class Carro {
    // Atributos (Estado)

    String marca;
    String modelo;
    int velocidade;

    // Construtor (Serve para inicializar o objeto)
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0; // Todo carro começa parado
    }

    // Métodos (Comportamento)
    void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println(modelo + " acelerou para " + velocidade + " km/h.");
    }

    void frear() {
        velocidade = 0;
        System.out.println(modelo + " parou.");
    }
}

public class Uso_de_POO_Basico {

    public static void main(String[] args) {
        // Criando (instanciando) dois objetos diferentes
        Carro meuCarro = new Carro("Toyota", "Corolla");
        Carro carroDoAmigo = new Carro("Ferrari", "F40");

        // Usando os objetos
        meuCarro.acelerar(50);
        carroDoAmigo.acelerar(120);

        meuCarro.frear();
    }
}

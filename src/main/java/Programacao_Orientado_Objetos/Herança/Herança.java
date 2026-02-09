package Programacao_Orientado_Objetos.Herança;

class Veiculo {

    String marca;

    public void buzinar() {
        System.out.println("Som de buzina genérico!");
    }
}

// Moto "é um" Veiculo
class Moto extends Veiculo {

    int cilindradas;

    public void darGrau() {
        System.out.println("A moto de " + cilindradas + "cc da marca " + marca + " está empinando!");
    }
}

public class Herança {

    public static void main(String[] args) {
        // Criando o objeto da classe FILHA
        Moto minhaMoto = new Moto();

        // 1. Acessando atributo que veio do PAI
        minhaMoto.marca = "Honda";

        // 2. Acessando atributo que é só da FILHA
        minhaMoto.cilindradas = 600;

        // 3. Usando método que veio do PAI
        minhaMoto.buzinar();

        // 4. Usando método que é só da FILHA
        minhaMoto.darGrau();
    }
}

//
//  Economia de Código: Você não precisou escrever String marca dentro da classe Moto.
//Se você tivesse 10 tipos de veículos (Carro, Caminhão, Trator), todos economizariam essas linhas.
//
//  Especialização: A classe Moto é mais "rica" que a classe Veiculo,
//pois ela tem tudo do pai e mais um pouco (as cilindradas e o método de dar grau).
//
//  Acesso: Mesmo que o código da classe Veiculo estivesse em outro arquivo 
//(desde que no mesmo pacote), a Moto conseguiria herdar tudo perfeitamente.
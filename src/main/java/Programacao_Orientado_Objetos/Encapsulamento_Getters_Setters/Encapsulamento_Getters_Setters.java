package Programacao_Orientado_Objetos.Encapsulamento_Getters_Setters;

import java.util.Scanner;

class Conta {

    // Atributo privado: Ninguém fora desta classe pode ver ou tocar
    private double saldo;

    // Getter: A única forma de consultar o saldo
    public double getSaldo() {
        return this.saldo;
    }

    // "Setter" com Regra: Só aceita depósitos maiores que zero
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }
}

public class Encapsulamento_Getters_Setters {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Conta minhaConta = new Conta();

        System.out.println("--- Sistema Bancário ---");
        System.out.print("Digite o valor para depósito: ");

        // Recebendo a informação do usuário
        double valorInformado = leitor.nextDouble();

        // Tentando enviar a informação para o objeto através do "filtro"
        minhaConta.depositar(valorInformado);

        // Consultando o resultado final através do Getter
        System.out.println("Saldo atual: R$ " + minhaConta.getSaldo());

    }

}

// Entendendo um pouco de fluxo

// A Variável Temporária: O valorInformado é apenas uma "caixa" temporária 
//que segura o que você digitou no teclado.
//
// O Envio: Quando você faz minhaConta.depositar(valorInformado),
//você está pegando o conteúdo dessa caixa e entregando para o objeto minhaConta.
//
// O Filtro (O Diferencial): O método depositar recebe esse valor e,
//antes de salvar permanentemente no atributo saldo, ele verifica as regras (como o if para ver se o valor é positivo).

//objeto.metodo(valor) -> É o ato de enviar um dado externo para dentro do objeto de forma controlada. 
//O método decide o que fazer com ele (armazenar, somar, rejeitar, etc).

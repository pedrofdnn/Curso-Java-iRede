# Construtores e Sobrecarga.

#### Construtores (O Nascimento do Objeto):

> O **Construtor** é um método especial que é executado automaticamente no momento em que você usa a palavra new.
>
 >> 1. **Sua função:** Ele serve para preparar o objeto, garantindo que ele já comece com as informações necessárias (como nome, marca ou saldo inicial).
 >> 2. **Regra de Nome:** Em Java, o construtor deve ter exatamente o mesmo nome da classe.
 >> 3. **Sem Retorno:** Diferente dos métodos comuns, ele não possui tipo de retorno (nem mesmo void).
 >> 4. **O Construtor Padrão:** Se você não criar nenhum construtor, o Java cria um "vazio" automaticamente por baixo dos panos.
> 

##

#### Sobrecarga ou Overloading (Múltiplas Formas):

> A **Sobrecarga** é um tipo de polimorfismo que permite ter mais de um método (ou construtor) com o mesmo nome dentro da mesma classe.
>
 > >1. **A Regra:** Para que o Java não se confunda, a "lista de ingredientes" (parâmetros) deve ser diferente. Você pode mudar a quantidade de parâmetros ou o tipo deles (ex: um recebe String, outro recebe int).
 >> 2. **Como o Java escolhe:** Na hora que você chama o método, o Java olha o que você enviou nos parênteses e escolhe a versão que "encaixa" perfeitamente.        
>

# Resumo:

| Conceito  | Resumo Curto | Analogia  | 
| ------------- |:-------------:| ------------- |
| **Construtor**     | Método que inicializa o objeto no new.    | O formulário de cadastro que você preenche ao abrir uma conta.     |
| **Sobrecarga**  | Mesmos nomes, mas com parâmetros diferentes.| Um controle remoto onde o botão "Power" liga a TV (se apertar rápido) ou abre o menu (se segurar).    |
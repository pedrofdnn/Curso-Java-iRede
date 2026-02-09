# Sobrescrita de Métodos.

A __Sobrescrita de Métodos__ (ou Method Overriding) é o mecanismo que permite que uma subclasse forneça uma implementação específica para um método que já foi definido em sua superclasse. Ela é a base para o funcionamento do Polimorfismo.

#### O Conceito:
> Sobrescrever significa "escrever por cima". Quando a classe filha herda um método do pai, mas o comportamento padrão não é adequado para ela, ela cria sua própria versão desse método.
 >> 1. **O Objetivo:** Permitir que uma subclasse especialize um comportamento genérico herdado.
 >> 2. **A Regra Principal:** O nome do método, o tipo de retorno e os parâmetros devem ser idênticos aos do método na classe pai.
> 
#
#### A Anotação @Override:

> Embora não seja obrigatória para o código funcionar, é uma boa prática essencial.
 >> 1. __Para que serve:__ Informa ao compilador sua intenção de sobrescrever um método.
 >> 2. __Segurança:__ Se você digitar o nome do método errado ou errar um parâmetro, o Java emitirá um erro de compilação, avisando que aquele método não existe no pai.
>
#

# Sobrescrita vs. Sobrecarga:
É muito comum confundir os dois, A diferença para não esquecer:

| Característica  | Sobrescrita (Overriding) | Sobrecarga (Overloading) |
| ------------- |:-------------:| ------------- |
| **Relacionamento**     | Entre classes diferentes (Pai e Filho).   | Na mesma classe.|
| **Assinatura**  | Deve ser __igual__ (mesmo nome e parâmetros). | Deve ser __diferente__ (mesmo nome, parâmetros diferentes).|
|**Objetivo** | Substituir/Especializar um comportamento. | Criar variações do mesmo comportamento. |

## Resumo da Hierarquia dos exemplos em códigos.
1. O Pai (Superclasse): Notificacao:
- __Papel:__ É o "molde geral".

- __Função:__ Define que todo objeto desse tipo deve ter a capacidade de enviar uma mensagem.

- __Resumo:__ Ele oferece o comportamento básico, mas não sabe os detalhes de como cada plataforma funciona.
2. Os Filhos (Subclasses): Email e WhatsApp:
- __Papel:__ São as "especializações".

- __Função:__ Eles herdam a marca "Notificação", mas sobrescrevem o método enviar para dar o seu toque pessoal.

- __Resumo:__ O Email é o filho mais formal (formata a mensagem com assunto e corpo).

- __O WhatsApp__ é o filho moderno (focado em rapidez e confirmação com checkmarks ✅).

3. O "Maestro": MainNotificacao:
- __Papel:__ É quem faz a orquestra tocar.

- __Função:__ Ele cria os objetos e usa o Polimorfismo para chamá-los.

- __O Truque:__ Quando você faz Notificacao n1 = new Email(), você está dizendo: "n1 se comporta como uma Notificação, mas no fundo ele é um Email".

#### Regra de Ouro: O Pai define O QUE deve ser feito (enviar), e os Filhos decidem COMO será feito (E-mail ou WhatsApp).
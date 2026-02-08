# Encapsulamento, Getters e Setters

#### Encapsulamento (O Conceito):

> **Encapsular** significa "esconder" os dados internos de uma classe. Em vez de deixar os atributos (como modelo ou ano) expostos para qualquer um mudar, você os protege.
>
 >> 1. **O Objetivo:** Segurança e Controle. Você decide quem pode ver ou alterar um dado e como isso deve ser feito.
 >> 2. **A Regra de Ouro:** Quase sempre, os atributos de uma classe devem ser marcados como private. Quando algo é private, nenhum outro arquivo consegue mexer nele diretamente.
> **Analogia:** Imagine a planta de uma casa feita por um arquiteto. Você não pode morar na planta, mas ela diz quantos quartos e banheiros a casa terá.

##

#### Setters (Os Porteiros):

> Como o atributo agora é privado, você precisa de um "buraco na parede" para colocar informação lá     
dentro. Esse é o Setter.
>
 > >1. **Para que serve:** Serve para definir ou alterar um valor.
 >> 2. **Vantagem:** Você pode criar regras. Por exemplo: um setAno pode impedir que alguém cadastre um carro do ano 3000.         
 >> 3. **Padrão de nome:** set + NomeDoAtributo (Ex: setModelo).
>

#### Getters (Os Atendentes):

> Se o atributo é privado, você também não consegue "ler" o que está lá dentro (como dar um System.out.println). O **Getter** resolve isso.
 >> 1. **Para que serve:** Serve para recuperar ou ler o valor de um atributo.
 >> 2. **Vantagem:** Você pode controlar como o dado sai. Exemplo: o getNome pode retornar o nome sempre em letras maiúsculas.
 >> 3. **Padrão de nome:** get + NomeDoAtributo (Ex: getModelo).
>
# Resumo:

| Termo  | Função| Analogia  | 
| ------------- |:-------------:| ------------- |
| Atributo private      | Esconder a informação.    | O cofre de um banco.     |
| Setter (set)     | Entrada de dados (com validação).| O funcionário que confere o dinheiro antes de guardar no cofre.     |
| Getter (get)     | Saída de dados.    | O caixa que te entrega o dinheiro após conferir sua identidade.    |
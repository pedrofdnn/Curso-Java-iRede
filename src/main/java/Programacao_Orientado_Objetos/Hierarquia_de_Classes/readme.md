# Hierarquia de Classes.

A **Hierarquia de Classes** é a estrutura que organiza como as classes se relacionam e compartilham características através da herança. É como uma árvore genealógica do código, onde as classes no topo são mais genéricas e as na base são mais específicas.

#### A Estrutura da Hierarquia:

> A hierarquia define quem é o "ancestral" e quem é o "descendente" no seu projeto.
>
 >> 1. **Superclasse (Pai/Topo):** É a base da hierarquia. Ela contém os atributos e métodos que são comuns a todos os membros do grupo (ex: Veiculo).
 >> 2. **Subclasse (Filha/Base):** É a especialização. Ela "estende" a superclasse, herdando o que já existe e adicionando funções que só ela possui (ex: Moto).
> 

##

#### Relacionamento "É UM":

> Para saber se a hierarquia está correta, usamos a regra do "É UM"..
>
 >> - Uma Moto __é um__ Veiculo.
 >> - Um Cachorro __é um__ Animal.    
 >> - Se essa frase fizer sentido, a hierarquia de herança está bem aplicada.   
>

#
#### Níveis de Hierarquia:
> Uma subclasse também pode ser a superclasse de outra classe, criando múltiplos níveis.
 >> - Nível 1: __Veiculo__ (Geral).
 >> - Nível 2: __Automovel__ (Herda de Veiculo).
 >> - Nível 3: __CarroEletrico__ (Herda de Automovel).
>
>Nesse caso, o CarroEletrico terá tanto as características de Automovel quanto as de Veiculo.

#

#### Benefícios da Hierarquia: 
- __Organização Logica:__ Facilita encontrar onde um comportamento está definido.
- __Manutenção Centralizada:__ Se você mudar algo na Superclasse, todas as Subclasses abaixo dela recebem a atualização automaticamente.
- __Polimorfismo:__ Permite tratar diferentes objetos de forma igual se eles pertencerem à mesma hierarquia (ex: tratar Moto e Carro apenas como Veiculo).

# Resumo:

| Termo  | O que representa na Hierarquia| 
| ------------- |:-------------:| 
| **Raiz**     | A classe mais alta e genérica de todas.   | 
| **Ancestral**  | Qualquer classe que esteja acima na linha de herança.| 
|**Descendente**|Qualquer classe que herde de uma classe superior.|
|**Especialização**|O ato de criar uma subclasse para adicionar detalhes.|
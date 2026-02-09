# Herança.

#### Herança (O Conceito):

> A **Herança** permite que uma classe (filha) herde todos os atributos e métodos de outra classe (pai). É uma relação de "é um".
>
 >> 1. **Objetivo:** Evitar a repetição de código e organizar o sistema em hierarquias.
 >> 2. **Superclasse (Pai):** É a classe base, que contém as características genéricas que todos compartilham.
 >> 3. **Subclasse (Filha):** É a classe especializada, que herda o que o pai tem e adiciona suas próprias características únicas.
> 

##

#### A Palavra-Chave (extends):

> No Java, para dizer que uma classe herda de outra, usamos o comando **extends**.
>
 > >1. **Como funciona:** Ao escrever public class CarroEletrico extends Carro, o Java entende automaticamente que o CarroEletrico já possui marca, modelo e o método acelerar definidos na classe pai.
 >> 2. **Limitação:** No Java, uma classe só pode herdar de uma única superclasse por vez (não existe herança múltipla de classes).       
>
#
#### O que é herdado?

- **Atributos** e Métodos: Todos os que forem public ou protected.
- **O que NÃO é herdado:** Construtores e atributos/métodos marcados como private. (Por isso usamos Getters e Setters para que a classe filha consiga acessar os dados privados do pai de forma segura).
#

# Resumo:

| Conceito  | Definição | Exemplo Prático  | 
| ------------- |:-------------:| ------------- |
| **Superclasse**     | A classe "mãe/pai" (Geral).    | Animal   |
| **Subclasse**  | A classe "filha" (Específica).| Cachorro    |
|**extends**|Comando que ativa a herança.|Cachorro extends Animal|
|Reuso|Aproveitar o código do pai.|O cachorro já "nasce" sabendo respirar (método do Animal).|

#### Pense na Herança como uma árvore genealógica. O que está no "topo" (Pai) é comum a todos lá embaixo. Quanto mais você desce na árvore (Filhas), mais detalhes e especializações aparecem.
# Polimorfismo.

O __Polimorfismo__ é um dos pilares mais poderosos da Programação Orientada a Objetos. A palavra vem do grego e significa "muitas formas". No Java, ele permite que um mesmo elemento (como um método ou um objeto) se comporte de maneiras diferentes dependendo do contexto.

#### O Conceito:
> O Polimorfismo acontece quando uma classe filha (subclasse) altera ou utiliza um comportamento que foi definido na classe pai (superclasse). Ele permite tratar objetos de diferentes subclasses como se fossem da mesma superclasse, mas cada um executando sua própria lógica.
>
 >> 1. **A Regra Principal:** Para existir polimorfismo, é necessário haver Herança.
 >> 2. **A Vantagem:** Você pode criar um código genérico que funciona com qualquer classe da mesma hierarquia, sem precisar saber exatamente qual é o objeto no momento.
> 
#
#### Tipos de Polimorfismo:

> Existem duas formas principais de aplicar esse conceito:
>
 >> 1. __Sobrescrita de Método (Override).__
 <q> É quando a classe filha "reescreve" um método do pai para dar a ele um comportamento mais específico.
 > - __Exemplo:__ A classe Animal tem o método fazerSom(). A classe Cachorro sobrescreve esse método para latir, enquanto o Gato sobrescreve para miar.  
 > 2. Polimorfismo de Referência:
 <q> É a capacidade de uma variável de um tipo genérico (Pai) apontar para um objeto de um tipo específico (Filho).
 > - __Exemplo:__ Veiculo v = new Carro();. Aqui, v é um veículo, mas se comporta como um carro.
 > 3. A Anotação __@Override:__
 <q> Sempre que você for praticar o polimorfismo de sobrescrita, verá essa anotação acima do método.
 > - __Ela serve para avisar ao compilador:__ "Ei, eu estou reescrevendo um método que já existe no meu pai". Se você errar o nome do método, o Java te avisará graças a essa etiqueta.
>

#

# Resumo:

| Termo  | Definição| Analogia|
| ------------- |:-------------:| ------------- |
| **Polimorfismo**     | Um mesmo comando, resultados diferentes.   | O comando "Tocar Música": um Piano toca notas, um __MP3 Player__ toca arquivos.|
| **Sobrescrita (@Override)**  | Redefinir o comportamento do pai na classe filha.| O pai ensina a "Falar", mas o filho decide falar em "Português".|
|**Flexibilidade**|Tratar diversos filhos como se fossem o pai.|Um estacionamento aceita qualquer "Veículo", não importa se é Moto ou Carro.|

### Por que isso é importante?

Sem o polimorfismo, você teria que criar métodos separados para cada tipo de objeto (ex: estacionarCarro(), estacionarMoto()). Com o polimorfismo, você cria apenas estacionar(Veiculo v) e o sistema aceita qualquer um que herde de Veículo.

#### Exemplo desse modelo de funcionamento dentro da pasta.

 - Funcionario o molde.
 - Gerente a herança.
 - MainRH o código.

### Resumo para sua organização:
 - __Classes de Molde (Pai e Filha):__ Geralmente ficam em arquivos separados para serem reutilizadas.

- __Classe com main:__ É o seu "controle remoto", onde você testa tudo.

Se colocar tudo no mesmo arquivo, vai virar uma "bagunça" de código.
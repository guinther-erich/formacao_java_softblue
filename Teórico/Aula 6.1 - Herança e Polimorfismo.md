# Aula 6.1 - Herança e Polimorfismo

Nesta aula, aprendi sobre:

## Herança

    - A herança é um mecanismo que permite que uma classe possa herdar o comportamento de outra classe, ao mesmo tempo em que novos comportamentos podem ser estabelecidos.
    - A vantagem da herança é agrupar coisas comuns para poder reaproveitar código.

<img src="../assets/img/img_047_heranca.png" alt="047_heranca" width="550"/>

    - Herança da Classe Object
        - Toda classe em Java herda de apenas uma superclasse.

<img src="../assets/img/img_048_heranca-object.png" alt="048_heranca-object" width="550"/>

## O modificador protected

    - Atributos e métodos declarados com o modificador protected podem ser acessados pelas suas subclasses.

<img src="../assets/img/img_049_modificador-protected.png" alt="049_modificador-protected" width="550"/>

## Sobrescrita de métodos

    - Técnica também conhecida como overriding.
    - Quando uma classe herda de outra, ela pode redefinir métodos da superclasse, isto é, sobrescrever métodos:
        - Os métodos sobrescritos substituem os métodos da superclasse;
        - A assinatura do método sobrescrito deve ser a mesma do método original.

<img src="../assets/img/img_050_sobrescrita-metodos.png" alt="050_sobrescrita-metodos" width="550"/>

<img src="../assets/img/img_051_sobrescrita-metodos.png" alt="051_sobrescrita-metodos" width="550"/>

    - Método toString()
        - As classes podem sobrescrever este método para mostrarem uma mensagem que as representem;
        - O método System.out.println(), por exemplo, utiliza este método.
    - Método equals(Object)
        - É a forma que o Java tem de comparar objetos pelo seu conteúdo ao invés de comparar as referências (como acontece ao usarmos "==").

## A palavra-chave super

    - O método que foi sobrescrito pode ser acessado pelo método que o sobrescreveu através da palavra-chave super:

<img src="../assets/img/img_052_usando-super.png" alt="052_usando-super" width="550"/>

## Polimorfismo

    - É a capacidade que um método tem de agir de diferentes formas, dependendo do objeto sobre o qual está sendo chamado.
    - Quando ocorre a chamada de um método, a JVM decide qual método invocar dependendo do objeto instanciado na memória.
        - Exemplo 1:

<img src="../assets/img/img_053_polimorfismo_ex1a.png" alt="053_polimorfismo_ex1a" width="550"/>

<img src="../assets/img/img_054_polimorfismo_ex1b.png" alt="054_polimorfismo_ex1b" width="550"/>

<img src="../assets/img/img_055_polimorfismo_ex1c.png" alt="055_polimorfismo_ex1c" width="550"/>

        - Exemplo 2:

<img src="../assets/img/img_056_polimorfismo_ex2.png" alt="056_polimorfismo_ex2" width="550"/>

## O operador instanceOf

    - Utilizado para verificar se um objeto pertence à determinada classe.

<img src="../assets/img/img_057_operador-instanceof.png" alt="057_operador-instanceof" width="550"/>

## Links úteis

- Link #1: <a href="https://docs.oracle.com/javase/tutorial/java/concepts/index.html" target="_blank">Java Tutorials: Object-Oriented Programming Concepts</a>
# Decorator Pattern

Permite o empacotamento dinâmico de objetos a fim de modificar suas atuais responsabilidades e comportamentos.
O Decorator Pattern atinge um único objetivo de adicionar responsabilidades dinamicamente para qualquer objeto.

## ❓ Quando é correto utilizar o Decorator Pattern?

1. Muitas condições para aplicar diferentes comportamentos/features para um objeto (geralmente feito por métodos, classes de utilidade)
2. Muitas classes sendo utilizadas para combinar variações de um objeto. Um exemplo seria: TextoNegrito, TextoItálico, TextNegritoItalico...
3. Um ou mais atributos que, durante um processo, são modificados em cadeia ou de forma acumulativa.
4. Um objeto com flags booleanas sendo utilizadas para aplicar alterações nesse mesmo objeto.

## ✅ Onde o princípio S.O.L.I.D vem nesse Design Pattern?

1. Single Responsability Principle existe nesse design pattern, pois toda vez que você precisa adicionar um novo comportamento/feature, você precisa criar um novo decorator.
2. Open Closed Principle porque você mantêm o objeto fechado para modificação e aberto para extensão.
# Observer Pattern

O Observer Pattern permite que você defina um sistema de assinatura, onde outros objetos podem ser notificados sobre
quaisquer eventos que ocorram no objeto que eles estão observando.

# ❓ Quando é correto utilizar o Observer Pattern?

1. Quando há múltiplos objetos que são dependentes de outro objeto e eles precisam tomar uma ação
quando o estado do objeto mudar.
2. Quando um objeto necessita de notificar outros sem saber quem eles são ou quantos eles são.

## ✅ Onde o princípio S.O.L.I.D vem nesse Design Pattern?

Open Closed Principle. Introduz novas classes assinantes sem ter que mudar o código
do notificador (e vice-versa)

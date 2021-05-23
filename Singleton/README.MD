# Singleton Pattern

Permite que uma classe possua apenas uma instância, enquanto provê apenas um único ponto de acesso para ela.

## ❓ Quando é correto utilizar o Singleton Pattern?

Quando queremos que uma classe tenha apenas uma instância e compartilhe os seus recursos com todas as outras classes que
necessitarem dela.

Uma classe que acesse a base de dados não precisa ser instanciada toda a vez que for utilizada, ao invés disso, podemos
aplicar o Singleton e todas as outras classes que precisarem dessa classe, acessarão por meio do Singleton.

## ❌ Quais são os problemas de usar o Singleton?

1. É difícil de testar um Singleton, pois a criação do objeto é feita de forma estática. Ou seja, não é possível
   premeditar o seu comportamento (mock)
2. O Singleton viola o Single Responsibility Principle, pois resolve dois problemas de uma só vez:
    1. Garante que a classe tenha apenas uma única instância.
    2. Fornece um ponto de acesso global para aquela instância.
3. Requer um tratamento especial para um ambiente multithreaded, pois as threads podem criar o mesmo objeto singleton
   várias vezes.
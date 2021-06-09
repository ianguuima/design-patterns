# Factory Pattern

Um padrão que fornece uma fábrica para criarmos os nossos objetos
em tempo de execução.

## ❓ Quando é correto utilizar o Factory Pattern?

1. Quando você quer criar objetos sem saber os detalhes
de como eles são criados ou quais dependências.
2. Quando você não souber de antemão os tipos e dependências exatas
dos objetos que o seu código vai utilizar.
3. Quando você possuí classes especializadas de uma classe, por exemplo:
   NewSalesTax, NewValueAddedTax...

## 🤝 Como o Factory Pattern te ajuda?

1. Ele segue o Single Responsability Principle, você move
o código de criação do produto para um único local, facilitando a
manutenção.
2. Open Closed Principle, pois você pode introduzir novos produtos
sem quebrar o código existente. E para cada novo produto, você
cria uma nova classe Factory para gerá-lo.
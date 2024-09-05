# :dart: Desafio DIO: Design Patterns com Java

- São soluções consolidadas para problemas recorrentes no desenvolvimento e manutenção de software orientado a objetos.

## :pushpin: Singleton 
- Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la. Garantir que uma classe tenha somente uma instância no programa e fornecer um ponto de acesso global para ela.
- Uma instância: usado para acesso de recursos compartilhados como acesso à base de dados, interfaces gráficas, sistemas de arquivos, servidores de impressão. Usado para substituir variáveis globais, como em caso de objetos de configuração do sistema como um todo.
- Ponto de acesso global: permitir acesso global ao Singleton em toda sua aplicação, assim como fazemos com variáveis globais.
- Podemos proteger a instância com encapsulamento, evitando que outro código sobrescreva seu valor.

## :pushpin: Strategy
- Simplificar a variação de algoritmos para a resolução de um mesmo problema.
- Definir uma família de algoritmos, encapsular cada um deles e fazê-los intercambiáveis. Permite que o algoritmo varie independentemente dos clientes que o utilizam.

## :pushpin: Façade
- Prover uma interface que reduza a complexidade nas integrações com subsistemas, definindo uma interface de nível mais alto tornando o sistema mais fácil de ser usado.

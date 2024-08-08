# Jogo de Xadrez em Java

## Descrição
Este é um projeto pessoal desenvolvido por **Pedro Reimberg de Oliveira** para aprimorar conhecimentos em **Java**, com foco em **Orientação a Objetos**, **encapsulamento**, **tratamento de exceções** e outros conceitos fundamentais. O projeto consiste em um jogo de xadrez totalmente implementado em Java, com uma interface de linha de comando.

## Funcionalidades
- Implementação completa das regras do xadrez, incluindo movimentos especiais como roque, promoção de peões e en passant.
- Estrutura de classes bem organizada, utilizando os princípios da Orientação a Objetos.
- Uso de encapsulamento para proteger e gerenciar o estado dos objetos.
- Tratamento de exceções para garantir a robustez e a estabilidade do jogo.
- Suporte a jogadas ilegais e feedback ao usuário em caso de tentativas inválidas.

## Estrutura do Projeto
- **application/Program**: Contém o código-fonte do projeto.
  - **boardgame**: Classes principais que representam o tabuleiro, peças, e regras do jogo.
  - **chess**: Classes que gerenciam a lógica do jogo e o fluxo de execução.
  - **chessPieces**: Classes específicas para cada tipo de peça.
  - **application/UI**: Interface do usuário, que pode ser uma linha de comando (CLI) ou, eventualmente, uma GUI (se houver expansão futura).
  
## Como Executar
1. Clone o repositório para sua máquina local:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd aplication
   ```
3. Compile o código:
   ```bash
   javac -d bin src/application/Program.java
   ```
4. Execute o jogo:
   ```bash
   java application/Program
   ```

## Tecnologias Utilizadas
- **Java SE**: Linguagem de programação utilizada para o desenvolvimento do jogo.
- **Git**: Controle de versão para o gerenciamento do código-fonte.

## Aprendizados
Durante o desenvolvimento deste projeto, aprimorei meus conhecimentos em:
- **Orientação a Objetos**: Criação de classes, herança, polimorfismo e abstração.
- **Encapsulamento**: Proteção dos dados das classes e uso adequado de getters e setters.
- **Tratamento de Exceções**: Implementação de controle de fluxo com try/catch e criação de exceções personalizadas.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

## Contato
Para mais informações ou dúvidas sobre o projeto, você pode entrar em contato comigo através dos seguintes meios:
- **Email**: pedro.reimberg.oliveira@gmail.com
- **LinkedIn**: [Pedro Reimberg de Oliveira](https://www.linkedin.com/in/pedro-reimberg-de-oliveira-500615163/)

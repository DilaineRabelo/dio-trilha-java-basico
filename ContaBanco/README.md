## Desafio Trilha Java Básico DIO

Sintaxe - Desafio
Vamos praticar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie uma aula `ContaTerminal.java` para realizar toda a programação do nosso programa.
   
###### Revisão sobre regras de declaração de variáveis

| Atribuição        | Tipo          | Exemplo       |
| -------------     | ------------- | ------------- |
| Número            | Inteiro       | 1021          |
| Agência           | Texto         | 067-8         |
| Nome do cliente   | Texto         | MÁRIO ANDRADE |
| Saldo             | Decimal       | 237,48        

###### Revisão sobre terminal, argumentos principais e classe Scanner
3. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá uma mensagem de quais informações serão solicitadas, por exemplo:
- Programa: "Por favor, digite o número da Agência !"
- Usuário: 1021 (depois ENTER para o próximo campo)
###### Revise sobre concatenação e classe String com método concat
4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que foram inseridas pelos usuários.

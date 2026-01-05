<h2 align="center"> 📚 Repositório de Projetos - ETEC (Desenvolvimento de Sistemas) </h2>

<div align="center">

![GitHub repo size](https://img.shields.io/github/repo-size/EdielOliveira/Sistemas?style=for-the-badge)

[![My Skills](https://skillicons.dev/icons?i=java,eclipse&theme=dark)](https://skillicons.dev)

</div>

<div align="center">

![image](http://www.unow.com.br/emDesenvolvimento.gif)

<img src="http://img.shields.io/static/v1?label=STATUS&message=%20FINALIZADO&color=BLUE&style=for-the-badge"/>

</div>

## 📌 Índice

- [Sobre o Repositório](#-sobre-o-repositório)
- [Como Executar](#-como-executar)
- [Projetos Incluídos](#-projetos-incluídos)
  - [Locadora SPCar](#-locadora-spcar-)
  - [Sistema de Desconto](#-sistema-de-desconto-)
  - [Controle de IPVA - Vale Card](#-controle-de-ipva---vale-card-)
  - [TudoWeb Feedback](#-tudoweb-feedback-)
  - [Cinema Analitics](#-cinema-analitics-)
  - [Soma de Matriz 3x3](#-soma-de-matriz-3x3-)
- [Desenvolvedor](#-desenvolvedor)

---

## 📖 Sobre o Repositório

Este repositório contém uma coleção de exercícios práticos desenvolvidos em **Java** durante o curso de Desenvolvimento de Sistemas na **ETEC**. Os projetos abrangem desde lógica básica com entrada de dados via console até o uso de interfaces gráficas simples (`JOptionPane`), estruturas condicionais, laços de repetição e manipulação de matrizes.

---

## 🚀 Como Executar

Para abrir e rodar os códigos em sua máquina:

1. Tenha o **JDK (Java Development Kit)** instalado.
2. Utilize uma IDE como **Eclipse** ou **VS Code**.
3. Navegue até a pasta `src` e localize a **Agenda** correspondente ao projeto desejado.
4. Execute o arquivo `.java` principal de cada pasta.

---

## 📂 Projetos Incluídos

### 1. Locadora SPCar
**Local:** `src/Agenda04_DS_I/LocadoraSPCar.java`

Este programa calcula o valor total de uma locação de veículo.
- **Entradas:** Modelo do carro, valor da diária, dias alugados e KM percorridos.
- **Lógica:** Soma o valor das diárias com uma taxa fixa de R$ 0,20 por KM rodado.

### 2. Sistema de Desconto
**Local:** `src/Agenda05_DS_I/SistemaDeDesconto.java`

Aplica descontos progressivos em uma compra utilizando a biblioteca `JOptionPane`.
- **Regras:** - Até R$ 200,00: 5% de desconto.
  - Entre R$ 200,00 e R$ 300,00: 10% de desconto.
  - Acima de R$ 300,00: 15% de desconto.

### 3. Controle de IPVA - Vale Card
**Local:** `src/Agenda06_DS_I/ValeCardControleIPVA.java`

Um sistema que orienta o usuário sobre o vencimento do IPVA com base no último dígito da placa do carro.
- **Destaque:** Utiliza a estrutura `switch-case` para definir os meses de pagamento (de Janeiro a Dezembro) e informa as modalidades de pagamento disponíveis.

### 4. TudoWeb Feedback
**Local:** `src/Agenda07_DS_I/FeedBackTudoWeb.java`

Realiza uma pesquisa de satisfação com 10 clientes.
- **Funcionalidade:** Coleta notas de 1 a 3 (Excelente, Bom, Ruim) em um loop `for` e exibe o total de avaliações "Excelente" e "Ruim" ao final.

### 5. Cinema Analitics
**Local:** `src/Agenda08_DS_I/CinemaAnalitics.java`

Sistema de análise estatística de feedbacks de um filme.
- **Dados Coletados:** Idade e nota (A a E).
- **Resultados:** Calcula a quantidade de notas "Ótimo", a média de idade de quem votou "Ruim" e a porcentagem de votos "Péssimo".
- **Destaque:** Tratamento de erros com `try-catch`.

### 6. Soma de Matriz 3x3
**Local:** `src/Agenda10_DS_I/SomaMatriz.java`

Trabalha com estruturas de dados multidimensionais (Matrizes).
- **Funcionalidade:** O usuário preenche uma matriz 3x3 e o programa calcula a soma de todos os elementos, exibindo a representação visual da matriz na tela.

---

<h2 align="center"> Locadora SPCar </h2>

<div align="center">

<img src="http://img.shields.io/static/v1?label=STATUS&message=%20FINALIZADO&color=YELLOW&style=for-the-badge"/>

[![My Skills](https://skillicons.dev/icons?i=java,eclipse&theme=dark)](https://skillicons.dev)

</div>

<div align="center">

</div>

<div align="left">
  
## Índice
  
- [Abrindo o Código](#-abrindo-o-código)
- [Visão Geral](#visão-geral)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Desenvolvedor](#-desenvolvedor)

</div>

<h1 align="left">
🚀 Abrindo o Código
</h1>

Para abrir o código do projeto, siga estas etapas:

**Windows, Mac e Linux:**
```
Abra "LocadoraSPCar.java" no seu IDE de preferência (Eclipse, IntelliJ IDEA, VS Code)
```

Para compilar e executar o código, use os seguintes comandos:
```
javac LocadoraSPCar.java
java LocadoraSPCar
```
```
E Pronto :D
```

<h1 align="left">
Visão Geral
</h1>

Este programa em Java calcula o valor total de um aluguel de carro na locadora SPCar. O sistema solicita ao usuário informações sobre o modelo do carro, valor da diária, quantidade de dias de locação e quilômetros percorridos, calculando automaticamente o preço final com base em uma taxa fixa de R$ 0,20 por quilômetro rodado.

**Funcionalidades:**
- Entrada de dados via console (Scanner)
- Cálculo automático do valor total (diárias + quilometragem)
- Taxa de R$ 0,20 por KM percorrido
- Exibição de resumo do aluguel

<h1 align="left">
Estrutura do Projeto
</h1>

<div align="left">
  
- `LocadoraSPCar.java`: Arquivo principal contendo toda a lógica do programa
- `Scanner scanner = new Scanner(System.in);`: Cria um objeto Scanner para leitura de dados do console
- `String modeloCarro = scanner.nextLine();`: Captura o modelo do carro
- `double valorDiaria = scanner.nextDouble();`: Captura o valor da diária
- `int quantidadeDias = scanner.nextInt();`: Captura a quantidade de dias
- `double quantidadeKm = scanner.nextDouble();`: Captura os quilômetros percorridos
- `scanner.close();`: Fecha o objeto Scanner para liberar recursos
- `calcularPrecoTotal()`: Método que calcula o preço total (diárias + km)
- `System.out.println()`: Exibe o resumo do aluguel no console

**Cálculo:**
```java
Preço Total = (Valor Diária × Dias) + (0,20 × KM Percorridos)
```

</div>

<h2 align="center"> Sistema de Desconto </h2>

<div align="center">

<img src="http://img.shields.io/static/v1?label=STATUS&message=%20FINALIZADO&color=YELLOW&style=for-the-badge"/>

[![My Skills](https://skillicons.dev/icons?i=java,eclipse&theme=dark)](https://skillicons.dev)

</div>

<div align="center">

</div>

<div align="left">
  
## Índice
  
- [Abrindo o Código](#-abrindo-o-código)
- [Visão Geral](#visão-geral)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Desenvolvedor](#-desenvolvedor)

</div>

<h1 align="left">
🚀 Abrindo o Código
</h1>

Para abrir o código do projeto, siga estas etapas:

**Windows, Mac e Linux:**
```
Abra "SistemaDeDesconto.java" no seu IDE de preferência (Eclipse, IntelliJ IDEA, VS Code)
```

Para compilar e executar o código, use os seguintes comandos:
```
javac SistemaDeDesconto.java
java SistemaDeDesconto
```
```
E Pronto :D
```

<h1 align="left">
Visão Geral
</h1>

Este programa em Java aplica descontos progressivos em compras utilizando interface gráfica com `JOptionPane`. O sistema calcula automaticamente o desconto com base no valor da compra informado pelo usuário, aplicando porcentagens diferentes conforme a faixa de valor.

**Funcionalidades:**
- Interface gráfica com JOptionPane
- Cálculo automático de descontos progressivos
- Três faixas de desconto (5%, 10% e 15%)
- Exibição do valor final com desconto aplicado

**Regras de Desconto:**
- Até R$ 200,00: 5% de desconto
- Entre R$ 200,00 e R$ 300,00: 10% de desconto
- Acima de R$ 300,00: 15% de desconto

<h1 align="left">
Estrutura do Projeto
</h1>

<div align="left">
  
- `SistemaDeDesconto.java`: Arquivo principal com a lógica de cálculo de descontos
- `import javax.swing.JOptionPane;`: Importa a biblioteca para interface gráfica
- `double ValorCompra;`: Variável que armazena o valor da compra
- `double Desconto;`: Variável que armazena o valor do desconto calculado
- `double ValorFinal;`: Variável que armazena o valor final após desconto
- `JOptionPane.showInputDialog()`: Exibe caixa de diálogo para entrada de dados
- `if-else`: Estrutura condicional para aplicar os descontos de acordo com a faixa de valor
- `JOptionPane.showMessageDialog()`: Exibe o resultado final com desconto aplicado

**Lógica de Cálculo:**
```java
if (ValorCompra <= 200) → Desconto = 5%
else if (ValorCompra >= 200 && ValorCompra < 300) → Desconto = 10%
else if (ValorCompra >= 300) → Desconto = 15%
```

</div>

<h2 align="center"> Controle de IPVA - Vale Card </h2>

<div align="center">

<img src="http://img.shields.io/static/v1?label=STATUS&message=%20FINALIZADO&color=YELLOW&style=for-the-badge"/>

[![My Skills](https://skillicons.dev/icons?i=java,eclipse&theme=dark)](https://skillicons.dev)

</div>

<div align="center">

</div>

<div align="left">
  
## Índice
  
- [Abrindo o Código](#-abrindo-o-código)
- [Visão Geral](#visão-geral)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Desenvolvedor](#-desenvolvedor)

</div>

<h1 align="left">
🚀 Abrindo o Código
</h1>

Para abrir o código do projeto, siga estas etapas:

**Windows, Mac e Linux:**
```
Abra "ValeCardControleIPVA.java" no seu IDE de preferência (Eclipse, IntelliJ IDEA, VS Code)
```

Para compilar e executar o código, use os seguintes comandos:
```
javac ValeCardControleIPVA.java
java ValeCardControleIPVA
```
```
E Pronto :D
```

<h1 align="left">
Visão Geral
</h1>

Este programa em Java orienta o usuário sobre o vencimento do IPVA com base no último dígito da placa do veículo. O sistema utiliza interface gráfica com `JOptionPane` e estrutura `switch-case` para determinar o mês de pagamento específico para cada final de placa, além de informar as modalidades de pagamento disponíveis.

**Funcionalidades:**
- Interface gráfica com JOptionPane
- Identificação do vencimento do IPVA pelo final da placa
- Informações sobre formas de pagamento disponíveis
- Utilização de estrutura switch-case para múltiplos casos

**Modalidades de Pagamento:**
- Pagamento Online
- Boleto Bancário
- Débito Automático
- Atendimento Presencial

<h1 align="left">
Estrutura do Projeto
</h1>

<div align="left">
  
- `ValeCardControleIPVA.java`: Arquivo principal com toda a lógica do sistema de IPVA
- `import javax.swing.JOptionPane;`: Importa a biblioteca para interface gráfica
- `int NumeroPlaca;`: Variável que armazena o último dígito da placa
- `String Propietario;`: Variável que armazena o nome do proprietário
- `String MensagemPagamento;`: Variável que contém as formas de pagamento
- `JOptionPane.showInputDialog()`: Exibe caixa de diálogo para entrada de dados
- `switch (NumeroPlaca)`: Estrutura que determina o vencimento baseado no final da placa
- `case 1 a 9, 0:`: Casos para cada final de placa com respectivos vencimentos
- `JOptionPane.showMessageDialog()`: Exibe o vencimento e formas de pagamento
- `break;`: Quebra de execução entre os casos do switch
- `default:`: Caso padrão para erros de entrada

**Calendário de Vencimentos:**
```
Final 1 → 30/04  |  Final 2 → 31/05  |  Final 3 → 30/06
Final 4 → 31/07  |  Final 5 → 31/08  |  Final 6 → 30/09
Final 7 → 31/10  |  Final 8 → 30/11  |  Final 0,9 → 31/12
```

</div>

<h2 align="center"> TudoWeb Feedback </h2>

<div align="center">

<img src="http://img.shields.io/static/v1?label=STATUS&message=%20FINALIZADO&color=YELLOW&style=for-the-badge"/>

[![My Skills](https://skillicons.dev/icons?i=java,eclipse&theme=dark)](https://skillicons.dev)

</div>

<div align="center">

</div>

<div align="left">
  
## Índice
  
- [Abrindo o Código](#-abrindo-o-código)
- [Visão Geral](#visão-geral)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Desenvolvedor](#-desenvolvedor)

</div>

<h1 align="left">
🚀 Abrindo o Código
</h1>

Para abrir o código do projeto, siga estas etapas:

**Windows, Mac e Linux:**
```
Abra "FeedBackTudoWeb.java" no seu IDE de preferência (Eclipse, IntelliJ IDEA, VS Code)
```

Para compilar e executar o código, use os seguintes comandos:
```
javac FeedBackTudoWeb.java
java FeedBackTudoWeb
```
```
E Pronto :D
```

<h1 align="left">
Visão Geral
</h1>

Este programa em Java realiza uma pesquisa de satisfação do site TudoWeb com 10 clientes. O sistema utiliza interface gráfica com `JOptionPane` e estruturas de repetição (`for`) e condicionais (`switch-case`) para coletar e contabilizar as avaliações dos usuários sobre o grau de satisfação do serviço.

**Funcionalidades:**
- Interface gráfica com JOptionPane
- Pesquisa de satisfação com 10 clientes
- Três níveis de avaliação (Excelente, Bom, Ruim)
- Contabilização automática das respostas
- Exibição de resultados ao final da pesquisa

**Opções de Avaliação:**
- 1 - Excelente
- 2 - Bom
- 3 - Ruim

<h1 align="left">
Estrutura do Projeto
</h1>

<div align="left">
  
- `FeedBackTudoWeb.java`: Arquivo principal com a lógica da pesquisa de satisfação
- `import javax.swing.JOptionPane;`: Importa a biblioteca para interface gráfica
- `int resposta;`: Variável que armazena a resposta do usuário
- `int Fe, Fb, Fr;`: Variáveis contadoras (Excelente, Bom, Ruim)
- `for (int i = 1; i <= 10; i++)`: Loop que executa 10 iterações para coleta de feedback
- `JOptionPane.showInputDialog()`: Exibe caixa de diálogo para avaliação
- `switch (resposta)`: Estrutura que processa cada tipo de resposta
- `case 1: Fe += 1;`: Incrementa contador de "Excelente"
- `case 2: Fb += 1;`: Incrementa contador de "Bom"
- `case 3: Fr += 1;`: Incrementa contador de "Ruim"
- `break;`: Quebra de execução entre os casos
- `JOptionPane.showMessageDialog()`: Exibe o resultado final da pesquisa

**Fluxo do Programa:**
```
Início → Loop 10x → Coleta Resposta → Switch Case → Incrementa Contador → Exibe Resultado
```

</div>

<h2 align="center"> Cinema Analitics </h2>

<div align="center">

<img src="http://img.shields.io/static/v1?label=STATUS&message=%20FINALIZADO&color=YELLOW&style=for-the-badge"/>

[![My Skills](https://skillicons.dev/icons?i=java,eclipse&theme=dark)](https://skillicons.dev)

</div>

<div align="center">

</div>

<div align="left">
  
## Índice
  
- [Abrindo o Código](#-abrindo-o-código)
- [Visão Geral](#visão-geral)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Desenvolvedor](#-desenvolvedor)

</div>

<h1 align="left">
🚀 Abrindo o Código
</h1>

Para abrir o código do projeto, siga estas etapas:

**Windows, Mac e Linux:**
```
Abra "CinemaAnalitics.java" no seu IDE de preferência (Eclipse, IntelliJ IDEA, VS Code)
```

Para compilar e executar o código, use os seguintes comandos:
```
javac CinemaAnalitics.java
java CinemaAnalitics
```
```
E Pronto :D
```

<h1 align="left">
Visão Geral
</h1>

Este programa em Java realiza uma análise estatística de feedbacks sobre um filme. O sistema coleta idade e avaliação de 10 espectadores, processando dados como quantidade de votos "Ótimo", média de idade dos que votaram "Ruim" e porcentagem de votos "Péssimo". Utiliza interface gráfica com `JOptionPane` e tratamento de exceções com `try-catch`.

**Funcionalidades:**
- Interface gráfica com JOptionPane
- Coleta de idade e avaliação de 10 espectadores
- Cinco níveis de avaliação (A a E)
- Cálculos estatísticos automáticos
- Tratamento de erros com try-catch
- Exibição de resultados analíticos

**Opções de Avaliação:**
- A - Ótimo
- B - Bom
- C - Regular
- D - Ruim
- E - Péssimo

<h1 align="left">
Estrutura do Projeto
</h1>

<div align="left">
  
- `CinemaAnalitics.java`: Arquivo principal com toda a lógica de análise de feedbacks
- `import javax.swing.JOptionPane;`: Importa a biblioteca para interface gráfica
- `int idade;`: Variável que armazena a idade do espectador
- `int FA, FB, FC, FD, FE;`: Contadores para cada tipo de avaliação
- `int somaIdadeRuim;`: Acumula as idades de quem votou "Ruim"
- `String FeedBack;`: Variável que armazena a avaliação (A-E)
- `try-catch`: Bloco de tratamento de exceções para entradas inválidas
- `for (int i = 1; i <= 10; i++)`: Loop para coletar 10 feedbacks
- `JOptionPane.showInputDialog()`: Exibe caixas de diálogo para coleta de dados
- `switch (FeedBack)`: Estrutura que processa cada tipo de avaliação
- `case "D": somaIdadeRuim += idade;`: Acumula idade dos votos "Ruim"
- `double PorcE = FE * 100 / 10;`: Calcula porcentagem de votos "Péssimo"
- `double mediaIdadeRuim = somaIdadeRuim / FD;`: Calcula média de idade dos votos "Ruim"
- `catch (NumberFormatException e)`: Captura erros de conversão de dados
- `JOptionPane.showMessageDialog()`: Exibe os resultados da análise

**Resultados Calculados:**
```
• Quantidade de votos "Ótimo"
• Média de idade de quem votou "Ruim"
• Porcentagem de votos "Péssimo"
```

</div>

<h2 align="center"> Soma de Matriz 3x3 </h2>

<div align="center">

<img src="http://img.shields.io/static/v1?label=STATUS&message=%20FINALIZADO&color=YELLOW&style=for-the-badge"/>

[![My Skills](https://skillicons.dev/icons?i=java,eclipse&theme=dark)](https://skillicons.dev)

</div>

<div align="center">

</div>

<div align="left">
  
## Índice
  
- [Abrindo o Código](#-abrindo-o-código)
- [Visão Geral](#visão-geral)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Desenvolvedor](#-desenvolvedor)

</div>

<h1 align="left">
🚀 Abrindo o Código
</h1>

Para abrir o código do projeto, siga estas etapas:

**Windows, Mac e Linux:**
```
Abra "SomaMatriz.java" no seu IDE de preferência (Eclipse, IntelliJ IDEA, VS Code)
```

Para compilar e executar o código, use os seguintes comandos:
```
javac SomaMatriz.java
java SomaMatriz
```
```
E Pronto :D
```

<h1 align="left">
Visão Geral
</h1>

Este programa em Java trabalha com estruturas de dados multidimensionais (matrizes). O sistema permite ao usuário preencher uma matriz 3x3 através de interface gráfica com `JOptionPane`, calcula a soma de todos os elementos e exibe a representação visual da matriz junto com o resultado final.

**Funcionalidades:**
- Interface gráfica com JOptionPane
- Preenchimento interativo de matriz 3x3
- Cálculo automático da soma de todos os elementos
- Exibição visual da matriz preenchida
- Uso de loops aninhados para percorrer a matriz
- Utilização de StringBuilder para formatação

<h1 align="left">
Estrutura do Projeto
</h1>

<div align="left">
  
- `SomaMatriz.java`: Arquivo principal com toda a lógica de manipulação de matrizes
- `import javax.swing.JOptionPane;`: Importa a biblioteca para interface gráfica
- `int[][] matriz = new int[3][3];`: Declara e inicializa uma matriz bidimensional 3x3
- `JOptionPane.showMessageDialog()`: Exibe mensagens ao usuário
- `for (int i = 0; i < 3; i++)`: Loop externo para percorrer as linhas
- `for (int j = 0; j < 3; j++)`: Loop interno para percorrer as colunas
- `JOptionPane.showInputDialog()`: Solicita entrada de valores para cada posição [i][j]
- `matriz[i][j] = Integer.parseInt(input);`: Converte e armazena o valor na posição correspondente
- `int soma = 0;`: Variável acumuladora para somar todos os elementos
- `soma += matriz[i][j];`: Adiciona cada elemento à soma total
- `StringBuilder matrizStr;`: Objeto para construir a representação visual da matriz
- `matrizStr.append()`: Adiciona elementos e formatação à string da matriz
- `matrizStr.toString()`: Converte o StringBuilder para String para exibição

**Estrutura da Matriz:**
```
[0][0]  [0][1]  [0][2]
[1][0]  [1][1]  [1][2]
[2][0]  [2][1]  [2][2]
```

**Processo:**
```
Entrada → Preenchimento → Cálculo da Soma → Formatação → Exibição
```

</div>

<h1 align="center">🤝 Desenvolvedor</h1>

<table align="center">
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/113260177?s=400&v=4" width="150px;" alt="Foto do Desenvolvedor"/><br>
        <sub>
          <b>Ediel Oliveira</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <img src="https://github.com/user-attachments/assets/12d933c6-c44f-4ed8-95ab-ec92d5b65256" width="150px;" alt="Foto do Desenvolvedor"/><br>
      <sub>
          <b>GEEAD</b>
        </sub>
    </td>
  
</table>

<p align="center">
Projeto desenvolvido como atividade acadêmica na ETEC, durante o curso técnico em Desenvolvimento de Sistemas.
</p>

# Mudanças nos Programas

### (se comparados aos produzidos pelo Prof. Nélio)

- Exemplo 1 - String
  - Exemplo de `StringBuilder`
  - Exemplo de `toString()`
- Exemplo 2 - List
  - Exemplo de instanciação de lista com valores
- Exemplo 3 - Date&Instant
  - Cálculo do fuso horário local (usando a diferença entre datas)
  - Introdução à API `java.time`
- Exemplo 4 - Exception
  - Um breve comentário a respeito de exceções, para ajudar a entender um pouco melhor esta temática
- Exemplo 5 - File
  - Tudo do capítulo original é usado em um fluxo contínuo
  - Exemplo de como escrever ao longo de um arquivo existente
- Exemplo 6.1 - Generics
  - Exemplo do método que serve para uma lista de uma classe ou de seus filhos
  - Exemplo do método que copia uma lista com elementos específicos para uma lista com elementos genéricos
- Exemplo 6.2 - Set
  - Comentário sobre os três tipos principais desta estrutura
  - Exemplo dos métodos principais
- Exemplo 6.3 - Map
  - Exemplo dos métodos principais (não há o comentário pois os três tipos são análogos aos do Set)
  - Uso do `LinkedHashMap` para que os elementos sejam exibidos em ordem de inserção (em vez de ordem alfabética)
- Exemplo 7.1 - Lambda
  - Comentário sobre os tipos de interfaces funcionais
- Exemplo 7.2 - Stream
  - Apenas mensagens `SysOut` um pouco mais explicadas
- Exercício 1 - Composição
  - Nenhuma alteração
- Exercício 2 - Herança&Polimorfismo
  - Comentário sobre classes e métodos de tipo `Final` e `Abstract`
  - Sugestão para classe utilitária
- Exercício 3 - Interface
  - Comentário sobre reuso e contrato
  - Breve comentário sobre `Comparator` e Default Methods
- Exercício 4 - JDBC
  - A função `main()` realiza as operações mas sem alterar de fato o banco de dados (para ter controle)
- Exercício 5 - JavaFX
  - Tudo do capítulo original foi usado em um único programa
  - Pequena melhoria no RegEx do Double (mais sucinto)

**Obs**: Os programas de JDBC e JavaFX devem ser acrescidos das User Libraries (MySQL Java Connector e os 8 JARs dentro da pasta lib no JavaFX SDK, respectivamente). O programa de JavaFX deve receber o VM argument (encontra-se na anotação de JavaFX).
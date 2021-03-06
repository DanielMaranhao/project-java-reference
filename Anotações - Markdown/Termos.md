# Termos

### Tecnologias

- **Spring** -> Framework Java com inúmeras funcionalidades
- **JDBC** -> Biblioteca que permite a comunicação entre o Java e um banco de dados
- **JPA** -> Interface Java para aplicação da tecnologia ORM
- **Hibernate** -> Implementação do JPA
- **Maven** -> Gerenciador de dependências e builds do Java
- **Git/Github** -> Sistema para versionamento de código e upload na nuvem
- **MySQL** -> SGBD da Oracle bastante utilizado na atualidade, bom para ter rapidez
- **PostgreSQL** -> SGBD totalmente público e gratuito, bom para situações complexas
- **H2** -> SGBD em memória, o banco é limpado após o desligamento do sistema, bom para testes
- **MongoDB** -> SGBD de NoSQL, bom para evitar troca de paradigmas (objeto-relacional) e grandes volumes de dados (cluster)
- **Tomcat** -> Servidor Web e container de servlets
- **Postman** -> Programa para teste de requisições HTTP
- **JSON** -> Formato de troca de dados baseado em atributo-valor
- **JWT** -> Autenticação Stateless baseada em JSON
- **Heroku** -> Plataforma de nuvem para hospedagem de aplicações
- **JavaFX** -> Interface gráfica para aplicações Desktop
- **JSF** -> Especificação Java de interfaces gráficas para aplicações web
- **PrimeFaces** -> Biblioteca de Componentes para o JSF

### Design Patterns

- **REST** -> Conjunto de melhores práticas associadas a Web Services e sua comunicação HTTP
- **MVC** -> Divisão do projeto em 3 camadas
	- **Model**: Núcleo do programa
	- **View**: Interface do usuário
	- **Controller**: Comunicação entre camadas
- **SOLID** -> princípios para tornar o software compreensível, flexível e de fácil manutenção
	- **Single-responsibility principle**: Cada módulo deve ter uma única responsabilidade
	- **Open–closed principle**: Interfaces devem ser utilizadas, pois mesmo se a classe mudar, o contrato não será quebrado
	- **Liskov substitution principle**: Objetos de uma superclasse devem ser substituíveis por objetos de suas subclasses sem quebrar o programa
	- **Interface segregation principle**: Várias interfaces específicas permitem que uma classe não precise implementar métodos que não use
	- **Dependency inversion principle**: Deve-se depender de abstrações e não de implementações
- **ACID** -> Propriedades da transação que garantem a validade dos dados
	- **Atomicity**: A transação é uma coisa só, ou tudo ocorre, ou nada ocorre
	- **Consistency**: A transação só pode levar o banco de dados de um estado válido a outro estado válido
	- **Isolation**: Transações que ocorrem simultaneamente são isoladas, como se ocorressem uma após a outra
	- **Durability**: Quando uma transação ocorre, não é mais possível que seus efeitos sejam desfeitos
- **DAO** -> Padrão que fornece uma interface para interação com um banco de dados
- **DTO** -> Padrão de objeto que carrega dados entre processos, podendo carregar apenas os dados necessários, bom para evitar excesso de tráfego
- **Observer** -> Listeners ficam escutando um evento e reagem de maneira específica quando ele ocorre

### Termos

- **Java** -> Linguagem de programação com paradigma híbrido, gerando Bytecode
- **Bytecode** -> Código que será interpretado por um JVM, para poder então ser executado no sistema
- **JDK** -> Pacote para desenvolvimento em Java, que inclui um JVM, o compilador javac, dentre vários outros
- **JRE** -> Camada de Software para executar aplicações Java, contendo um JVM, as bibliotecas a serem utilizadas, dentre outros
- **JVM** -> Máquina virtual para interpretar o Bytecode que foi gerado para o sistema em utilização
- **HotSpot** -> JVM da Oracle que procura pontos que são executados repetidamente (hot spots) para otimizá-los
- **JavaBean** -> Componente de software que encapsula vários objetos e segue convenções (Get&Set, Construtor vazio, Serializable)
- **POJO** -> Objeto Java que não possui nenhuma restrição especial
- **Banco de Dados** -> Coleção organizada de dados
- **SGBD** -> Programa que interage com o banco de dados
- **Cluster** -> Resolver um problema complexo através de um grande número de computadores em vez de um único computador extremamente poderoso
- **NoSQL** -> Tipo de banco de dados que não usa modelo relacional, executa bem em clusters e não tem um schema obrigatório
- **Agregado** -> Conjunto de objetos relacionados tratados como uma unidade, em um bloco contíguo de memória, bom para evitar fazer várias operações custosas em sequência como JOINs
- **CRUD** -> As quatro operações básicas de banco de dados: Create, Read, Update, Delete
- **ORM** -> Técnica que permite a comunicação direta entre uma linguagem orientada a objetos e um banco de dados relacional, encapsulando detalhes dessa comunicação como comandos SQL
- **RegEx** -> Sequência de caracteres que especifica um padrão de busca (Bom para realizar buscas, substituições e validação de input)
- **Web Container** -> Contém os servlets de um server
- **Server** -> Fornece conteúdo estático, e também conteúdo dinâmico caso possua um web container
- **Servlet** -> Utilizado para fornecer conteúdo dinâmico, como os resultados de uma consulta a um banco de dados
- **Applet** -> Programa pequeno que está dentro de um programa maior, executando uma atividade específica
- **Cookie** -> Como o servidor não deve guardar estados de sessão, eles podem ser armazenados no computador do usuário
- **Metodologias Ágeis** -> Conjunto de práticas para aprimorar a eficácia do desenvolvimento de software
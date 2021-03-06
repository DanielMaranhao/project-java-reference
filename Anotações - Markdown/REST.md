# REST

**Conceitos Básicos**

- **REST**: Conjuntos de melhores práticas associadas a Web Services e sua comunicação HTTP
- **Web Resource**: Objeto na web que pode ser manipulado através de um identificador (Ex: User)
- **Web Service**: Programa de um servidor esperando requisições em uma porta e servindo recursos, ou um serviço oferecido por um servidor a outro servidor
- **URI**: O identificador do recurso -> www<area>.meusite.com/users
- **URL**: URI acrescido do protocolo -> http<area>://www<area>.meusite.com/users
- **URN**: URI que retorna as URLs com aquele recurso (Pouco usado)
- **IRI**: URI com qualquer tipo de caractere (Pouco usado)

**Constraints**

- **Cliente/Servidor**: Separar as responsabilidades do sistema
- **Stateless**: Requisições a um servidor são independentes entre si (o servidor não mantém o estado da sessão)
- **Cache**: Respostas que mudam pouco são armazenadas localmente para evitar a solicitação completa novamente
- **Interface Uniforme**: Modelar as interfaces de maneira semelhante (URIs, métodos HTTP, media types, etc)
- **Sistema em Camadas**: A adição de elementos intermediários deve ser transparente (Ex: Proxy)
- **Código sob Demanda** (opcional): Novas funcionalidades são baixadas à medida que são necessárias

**Media Types**

- **XML**
- **JSON**
- **YAML**

**Métodos HTTP**

- **GET**: Obter um recurso
- **POST**: Adicionar um recurso
- **PUT**: Atualizar completamente um recurso
- **PATCH**: Atualizar parcialmente um recurso
- **DELETE**: Apagar um recurso

**Modelo de Maturidade Richardson** (O quão próximo se está do REST)

- Nível 0 - **POX** -> O mais distante do REST
- Nível 1 - **Recursos** -> Os recursos são utilizados corretamente
- Nível 2 - **Verbos HTTP** -> Os métodos HTTP e o código de resposta são utilizados corretamente
- Nível 3 - **HATEOAS** -> A resposta deve apresentar possíveis ações contextuais

**JWT**: Autenticação Stateless, através do formato -> Header,Payload,Signature (Em Base64)

- **Header**: Informações sobre o formato do envio
- **Payload**: Conteúdo do envio
- **Signature**: Código gerado a partir do Header, do Payload e do Secret
# Spring Framework

**Conceitos**

- **Profiles**: Executa-se ações específicas dependendo do perfil escolhido
- **Open in View**: Encapsulamento do EntityManager
- **Repository**: Encapsula as operações de CRUD do banco de dados e permite outras operações
- **CommandLineRunner**: O método desta interface é executado quando o programa é iniciado
- **ResponseEntity**: Representa a resposta HTTP, contendo: Headers, Body e Status
- **JSON**: Quando for recebido, mostrará apenas aquilo que tem o método Get na classe
- **Enum**: Sempre explicitar o código de cada valor para evitar conflito com o banco de dados

**Anotações**

- `@Autowired` -> Injetor de dependência automático
- `@Component` -> Indica que é um componente para possibilitar a injeção de dependência
	- Recomenda-se usar a anotação específica quando possível (`@Service`, `@Repository`, `@Controller`)
- `@JsonIgnore` -> Ignorar o Json de resposta deste elemento (Evita-se o loop infinito)
- `@Transient` -> Impede a interpretação do JPA
- `@Embeddable` -> Para uma classe ser embutida em outra (Ex: chave primária composta)
- `@MapsId` -> O id desta classe é igual ao do objeto abaixo
- `@PathVariable` -> Parâmetro deve ser vinculado a uma variável do URI
- `@RequestBody` -> Parâmetro deve ser vinculado ao corpo da requisição
- `@RequestParam` -> Parâmetro deve ser vinculado a um parâmetro da requisição
- `@RestController` -> Esta classe representa um Resource
- `@ControllerAdvice` -> Esta classe representa um ExceptionHandler
- `@Query` -> Útil para realizar uma busca com vários critérios no repositório
- `@DBRef` -> Este item deve ser carregado do banco de dados (MongoDB)

**Entity** - implements Serializable, Hashcode&Equals
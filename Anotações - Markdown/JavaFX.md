# JavaFX

Local SceneBuilder -> C:\Users\Usuario\AppData\Local\SceneBuilder\SceneBuilder.exe

No projeto -> Run as -> Run Configurations -> Java Application -> Main -> Arguments -> VM Arguments

- --module-path C:\java-libs\javafx-sdk\lib --add-modules=javafx.fxml,javafx.controls

Apagar o **Module Info Java** (se existir)

Após qualquer alteração no Scene Builder

- Eclipse -> Project -> Clean...

**Containers**

- **AnchorPane**: ancora os elementos com relação às bordas
- **GridPane**: possui forma de matriz
- **SplitPane**: a tela é dividida ao meio
- **VBox/HBox**: acomoda os elementos colados verticalmente ou horizontalmente
	- **Spacing**: distanciamento entre os elementos do box
- **BorderPane**: permite alocar os elementos colados em todos os 4 cantos da tela e no centro
- **ScrollPane**: mostra barras de rolagem se os elementos ocuparem mais espaço que a tela

**Elementos**

- **Label**: texto simples
- **TextField**: caixa de texto para inserir dados
- **Button**: botão
- **ComboBox**: caixa de seleção
- **MenuBar**: barra de menu (aparecem opções ao clicar em um item do menu)
- **ToolBar**: barra de ferramentas (sem opções ao clicar em um item)
- **TableView**: Tabela para exibição de dados
	- **Padding**: espaçamento ao redor de um elemento

**Propriedades úteis**

- `setFitToHeight`: propriedade do `ScrollPane` que vincula a altura do seu nodo filho à sua altura
- `ObservableList`: permite que listeners se associem a esta lista, refletindo mudanças em tempo real
- Associar uma coluna da tabela ao atributo de um objeto, referenciando o `getAttribute()` -> `tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));`
- Associar uma coluna da tabela ao próprio objeto daquela linha -> `tableColumnEDIT.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));`

**Controller** - `implements Initializable`  
**Entity** - `implements Serializable`
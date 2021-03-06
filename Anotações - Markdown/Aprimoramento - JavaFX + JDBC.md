# Aprimoramento (Projeto JavaFX + JDBC)

Se você concluiu o projeto JavaFX + JDBC, deve ter notado que a tabela de vendedores não apresenta os departamentos de cada vendedor.
Sendo assim, isso pode ser complementado adicionando-se a função parametrizada abaixo à classe Utils.

```java
// Method to show, in a table of type T, in a column of type S, an attribute of type U
public static <T, S, U> void formatTableColumnSubProperty(TableColumn<T, S> tableColumn, Function<S, U> showSubProperty) {
	tableColumn.setCellFactory(column -> {
		TableCell<T, S> cell = new TableCell<>(){				

			@Override
			protected void updateItem(S item, boolean empty) {
				super.updateItem(item, empty);
				if(empty) {
					setText(null);
				}
				else {
					setText(String.valueOf(showSubProperty.apply(item)));
				}
			}
		};
		return cell;
	});
}
```
	
Após isso, deve-se criar um atributo para a coluna do departamento na classe SellerListController.

```java
@FXML
private TableColumn<Seller, Department> tableColumnDepartmentName;
```

Em seguida, basta realizar as seguintes chamadas na classe SellerListController, no método initializeNodes.

```java
tableColumnDepartmentName.setCellValueFactory(new PropertyValueFactory<>("department"));
Utils.formatTableColumnSubProperty(tableColumnDepartmentName, department -> department.getName());
```

Da mesma forma, é possível também parametrizar o ComboBox, fazendo um processo similar, na classe Utils.

```java
public static <T, S> void formatComboBox(ComboBox<T> comboBox, Function<T, S> showProperty) {
	Callback<ListView<T>, ListCell<T>> factory = lv -> new ListCell<>() {

		@Override
		protected void updateItem(T item, boolean empty) {
			super.updateItem(item, empty);
			if(empty) {
				setText(null);
			}
			else {
				setText(String.valueOf(showProperty.apply(item)));
			}				
		}
	};
	comboBox.setCellFactory(factory);
	comboBox.setButtonCell(factory.call(null));
}
```

E em seguida, na classe SellerFormController, no método initializeNodes.

```java
Utils.formatComboBox(comboBoxDepartment, department -> department.getName());
```

**Obs**: Não esquecer de fazer as devidas alterações no SceneBuilder

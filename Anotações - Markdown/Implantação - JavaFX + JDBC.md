# Implantação (Projeto JavaFX + JDBC)

No projeto -> botão direito -> Export -> Java (Runnable JAR file) -> Library handling (terceira opção)

Colocar na pasta

- JAR + lib
- db.properties (com os dados do banco)
- MySQL Connector (já está na lib)
- [JavaFX SDK](https://gluonhq.com/products/javafx/) zipado
- [OpenJDK](https://jdk.java.net/archive/) zipado

No computador do cliente

- Descompactar o OpenJDK em C:\Program Files\Java
- Criar variável de ambiente JAVA_HOME com o caminho C:\Program Files\Java\jdk (Lembrar de por o número da versão)
- Na variável Path adicionar %JAVA_HOME%\bin
- Descompactar o JavaFX SDK em C:\java-libs (apagar o número da versão)
- Criar variável de ambiente PATH_TO_FX com o caminho C:\java-libs\javafx-sdk\lib
- Colocar o MySQL Connector dentro da pasta lib do JavaFX SDK
- Colocar o JAR e o db.properties na pasta C:\MyApp
- Executar o serviço do banco (se for local)
- No cmd escrever cd \MyApp e então o comando de execução
- java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp application-javafx-jdbc.jar application.Main

Criação de atalho

- Criar um txt na pasta do programa e nomear como myapp.bat
- Editar o arquivo para adicionar o comando de execução
- Na área de trabalho -> botão direito -> novo -> atalho
- Selecionar o arquivo bat e nomear como My App
- No atalho -> botão direito -> propriedades
- No destino colocar o comando de execução
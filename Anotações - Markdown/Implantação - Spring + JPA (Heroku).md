# Implantação (Projeto Spring + JPA + Heroku)

- No Heroku -> New -> Create new app
- No app -> Resources -> Add-ons -> Heroku Postgres
- No pgAdmin -> Databases -> Create -> Database
- Rodar o programa

<!-- -->

- No pgAdmin -> Selecionar o Database -> Backup
	- **Format**: Plain
	- **Encoding**: UTF-8
	- **Only schema**: YES
	- **Blobs**: NO
	- **Do not save**: YES to ALL
	- **Verbose messages**: NO

<!-- -->

- No script gerado -> Deletar instruções antes dos **CREATE** statements
- No app -> Settings -> Reveal Config Vars

<!-- -->

- Dados de Configuração
	- **Username**: tggmeyfkqfmort (antes do :)
	- **Password**: f15133f687ecf08a2e16a842a98f8ce9869cac398e1ab115b4065410c43lp91k (entre : e @)
	- **Server**: ec2-52-6-211-59.compute-1.amazonaws.com (entre @ e :)
	- **Port**: 5432 (entre : e /)
	- **Database**: d3rupn1ut94cip (depois do /)

<!-- -->

- No pgAdmin -> Servers -> Create -> Server
	- **Host name/address** -> Server
	- **Maintenance database** -> Database
	- **Username** -> Username
	- **Password** -> Password
	- **DB restriction** -> Database

<!-- -->

- No pgAdmin -> Selecionar o Database -> Query Tool -> Open File -> **script.sql** -> Execute
- No app -> Deploy -> Create a new Git repository -> Copiar a terceira linha -> Colar no Bash

<!-- -->

- No app -> Settings -> Criar Config Vars
	- **JWT\_EXPIRATION** -> 36000000
	- **JWT\_SECRET** -> MYSECRET

<!-- -->

- No Bash -> Enviar o commit -> git push heroku main
- No app -> Open app
- Whitelabel Error Page -> OK!!!
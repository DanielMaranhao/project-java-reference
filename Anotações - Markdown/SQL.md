# SQL

### DDL

- **CREATE DATABASE** banco\_de\_dados
- **DROP DATABASE** banco\_de\_dados

<!-- -->

- **CREATE TABLE** tabela(campo1 Tipo,campo2 Tipo,campo3 Tipo)
- **ALTER TABLE** tabela **ADD/MODIFY/DROP** coluna Tipo
- **DROP TABLE** tabela

<!-- -->

- **CHAR** - Caractere
- **CHAR(n)** - String com comprimento fixo
- **VARCHAR(n)** - String com comprimento variável
- **BIT** - Booleano
- **DATE** - Data
- **TIME** - Hora
- **NUMERIC(n,d)** - Número com n dígitos e d casas decimais
- **INT** - Inteiro
- **FLOAT** - Decimal

<!-- -->

- **NOT NULL** - Não pode ser nulo
- **DEFAULT** - Valor padrão
- **CHECK** - Checa condições
- **UNIQUE** - Não pode ser repetido
- **AUTO_INCREMENT** - Aumenta de valor a cada nova inserção
- **PRIMARY KEY** - NOT NULL + UNIQUE
- **REFERENCES** - Foreign Key

### DML

- **SELECT** coluna1,coluna2,coluna3 **FROM** tabela **WHERE** condicoes
- **INSERT INTO** tabela(coluna1,coluna2,coluna3) **VALUES**(valor1,valor2,valor3)
- **UPDATE** tabela **SET** coluna1 = valor1, coluna2 = valor2, coluna3 = valor3 **WHERE** condicoes
- **DELETE FROM** tabela **WHERE** condicoes

<!-- -->

- \* - Todos
- <> - Diferente
- **LIKE** - Contém este trecho de String
- **ORDER BY** - Ordenar por um campo
- **AS** - Dar um apelido a um campo
- **DISTINCT** - Elimina repetições

**Operações de Agregação**

- **COUNT** - Número de linhas
- **MAX** - O maior valor da coluna
- **MIN** - O menor valor da coluna
- **SUM** - Soma de todos os valores da coluna
- **AVG** - Média de todos os valores da coluna

<!-- -->

- **GROUP BY** - Em uma coluna com repetições, realizar operações de agregação
- **HAVING** - Restringe o WHERE após o GROUP BY
- **INNER JOIN** - Junção de tabelas baseada em chaves
- **UNION** - União em Teoria dos Conjuntos
- **INTERSECT** - Interseção em Teoria dos Conjuntos
- **EXCEPT** - Diferença em Teoria dos Conjuntos

### DCL

- **CREATE/ALTER/DROP USER** usuario
- **CREATE USER** usuario **IDENTIFIED BY** senha

<!-- -->

- **GRANT** privilegios **ON** tabela **TO** usuario
- **REVOKE** privilegios **ON** tabela **FROM** usuario

<!-- -->

- **SELECT** - Selecionar registros
- **INSERT** - Inserir registros
- **UPDATE** - Alterar registros
- **DELETE** - Apagar registros
- **REFERENCES** - Referenciar registros
- **EXECUTE** - Execução do Stored Procedure
- **ALL** - Todos os privilégios

### Exemplo

```sql
CREATE DATABASE clinica;

CREATE TABLE medico(
crm VARCHAR(15) PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
idade INT CHECK(idade > 21 AND idade < 80),
especialidade VARCHAR(50)
);

CREATE TABLE paciente(
cpf NUMERIC(11) PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
doenca VARCHAR(50),
crm_medico VARCHAR(15) REFERENCES medico(crm)
);

INSERT INTO medico
(crm, nome, idade, especialidade)
VALUES
("3782CE", "Alex Green", 32, "cardiologista");

INSERT INTO paciente
(cpf, nome, doenca, crm_medico)
VALUES
(58293710123, "Bob Brown", "diabetes", "3782CE");

INSERT INTO paciente
(cpf, nome, doenca, crm_medico)
VALUES
(83628340998, "Maria White", "cancer_de_pulmao", "3782CE");

UPDATE paciente
SET doenca = "hipertensao"
WHERE nome = "Bob Brown";

DELETE FROM paciente
WHERE doenca LIKE "%cancer%";

SELECT paciente.*,medico.nome AS nome_medico
FROM paciente INNER JOIN medico ON paciente.crm_medico = medico.crm
WHERE paciente.nome = "Bob Brown";
```

# Git - Comandos

**Para logar**

- git config --list (para verificar se você está logado)
- git config --global user.name "name"
- git config --global user.email "email"

**Apenas na criação do projeto (primeiro commit)**

- git init
- git branch -m master main (caso seu branch esteja como master)
- git remote add origin "repository URL"
- git pull origin main (se tiver criado o .gitignore no Github)
- git add .
- git commit -m "commit description"
- git push -u origin main

**Para realizar commits subsequentes**

- git add .
- git commit -m "commit description"
- git push

**Para apagar o último commit local e do Github (sem alterar o código local)**

- git reset --soft HEAD~1
- git push -f origin HEAD^:main (Necessário commitar antes de realizar esse comando)

**Disassociar um projeto do GitHub**

- Apagar .git

**Adicionar ao .gitignore (em caso de build - Ex: Projeto JavaFX + JDBC)**  

\# build folders  
bin/  
target/  
nbproject/private/  
build/  
nbbuild/  
dist/  
nbdist/  

**Obs**: Recomendável criar um Token de acesso e guardá-lo. Referência neste [link](https://docs.github.com/pt/github/authenticating-to-github/keeping-your-account-and-data-secure/creating-a-personal-access-token)
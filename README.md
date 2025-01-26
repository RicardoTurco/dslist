
# DSlist
```
Projeto de API Rest desenvolvida durante o treinamento Intensivão Java Sprint realizado 
pela DevSuperior de 20 a 24/01 de 2025.

Essa API têm como objetivo fornecer informações de gerenciamento de Games à um Frontend:
```

<img src=static/imgs/ijs-front1.png width="750" height="400" />
<br>
<img src=static/imgs/ijs-front2.png width="750" height="400" />
<br>
<img src=static/imgs/ijs-front3.png width="750" height="400" />
<br>
<img src=static/imgs/ijs-front4.png width="750" height="400" />
<br>

```
Além de listar todos os Games e exibir seus detalhes, existe a funcionalidade de mudar 
a posição de um Game dentro de uma determinada lista.
```

## Tecnologias
```
Este projeto foi desenvolvido com as seguintes tecnologias :
```
- Java (17)
- Spring Boot
- JPA / Hibernate
- Maven
- H2
- Postgres (dev/prod)
- Railway (CI/CD)
- Spring Initializr:  https://start.spring.io/

<br>
<img src=static/imgs/springInit.png width="750" height="400" />
<br>

## Modelo de domínio DSList

<img src=static/imgs/dominio.png width="750" height="400" />
<br>

## Arquitetura / estrutura do projeto
```
O projeto está estruturado usando o conceito de "camadas".
(controllers, services, repositories, etc ...)
```
<img src=static/imgs/ijs-camadas.png width="750" height="400" />
<br>

## Executando o projeto:
```
Podemos executar o projeto localmente, de 2 formas:
(Ao executar o projeto em modo de teste, será criado um banco de dados em 'memória'
usando o H2, e também serão inseridos os registros nas tabelas correspondentes) 

a) VIA TERMINAL:

- clonar o projeto
- entrar no diretório / pasta do projeto
- abrir um terminal

Executar os seguintes comandos:

- mvn clean
- mvn install
- java -jar target/dslist-0.0.1-SNAPSHOT.jar
```

<img src=static/imgs/ijs-exec-terminal.png width="950" height="400" />
<br>

```
b) VIA IDE:
(no exemplo, está sendo utilizado o IntelliJ da Jetbrains)

- clonar o projeto
- abrir o projeto dentro da IDE (IntelliJ)
- navegar até o "entrypoint" do projeto (vide imagem)
```

<img src=static/imgs/ijs-exec-ide1.png width="950" height="400" />
<br>

```
- executar o "clean" no Maven (vide imagem)
```

<img src=static/imgs/ijs-exec-ide2.png width="950" height="400" />
<br>

```
- executar o "install" no Maven (vide imagem)
```

<img src=static/imgs/ijs-exec-ide3.png width="950" height="400" />
<br>

```
- executar o projeto (vide imagem)
```

<img src=static/imgs/ijs-exec-ide4.png width="950" height="400" />
<br>

```
Com a aplicação em execução, basta realizar uma requisição para 
qualquer um dos endpoints do projeto.
```

## Endpoints

```
Na API existem basicamente 5 endpoints:

URL base:
(API sendo executada localmente em modo 'test')

http://localhost:8080
```

### - tipos de Games:
```
GET {{url_base}}/list 
```
<img src=static/imgs/ijs-ep-tipoGames.png width="750" height="400" />
<br>

### - todos os Games (independete do tipo):
```
GET {{url_base}}/games 
```
<img src=static/imgs/ijs-ep-games.png width="750" height="400" />
<br>

### - detalhes de um determinado Game:
```
GET {{url_base}}/games/{{id}} 
```
<img src=static/imgs/ijs-ep-detGame.png width="750" height="400" />
<br>

### - todos os games de um determinado Tipo:
```
GET {{url_base}}/lists/{{id}}/games 
```
<img src=static/imgs/ijs-ep-gamesPorTipo.png width="750" height="400" />
<br>

### - Altera a posição de um Game dentro de uma lista (tipo):
```
POST {{url_base}}/lists/{{id}}/replacement

payload: 

{
    "sourceIndex": 3,       # posição atual do game na lista 
    "destinationIndex": 1   # posição de destino do game na lista
}
```
<img src=static/imgs/ijs-ep-ordenacao.png width="750" height="400" />
<br>

## Deploy - CI / CD:
```
O projeto também pode ser executado em contexto de PRODUÇÃO, onde foi realizado o deploy do mesmo no Railway.

Além do projeto, também é provisionado / configurado uma base Postgres. Sendo que após sua criação, 
foi criado um banco de dados e inseridos os registros nas tabelas correspondentes 'manualmente' 
usando o script 'create.sql' (disponibilizado no repositório).
```

- URL base: https://dslist-production-63d5.up.railway.app

### IMPORTANTE:
```
Sempre que for feito um push para a branch master do projeto, será executado o deploy da API no Railway.
```
<img src=static/imgs/ijs-deploy-github.png width="750" height="400" />
<br>
<img src=static/imgs/ijs-deplooy-railway.png width="750" height="400" />
<br>

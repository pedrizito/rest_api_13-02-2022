# Basic Rest API

## Uma pequena API rest que fiz no dia 13/02 para relembrar um pouco do Java + Spring

## A little Rest API that I made to remember some concepts about Java and Spring framework.

###### Please ignore any gramatical mistake, I'm learning English.


#### Here is some data to your add on database through Postman.:

{
  "id": null,
  "name": "O Hobbit",
  "decription": "Breve descrição do filme O Hobbit",
  "postDate": "22/08/2021"
}


{
  "id": null,
  "name": "O Senhor dos Anéis",
  "decription": "Breve descrição do filme O Senhor dos Anéis",
  "postDate": "12/09/2021"
}

{
  "id": null,
  "name": "O Nome do Vento",
  "decription": "Breve descrição do filme O Nome do Vento",
  "postDate": "01/01/2022"
}

#### The database is configurated to a docker, you can edit it on application.yml -> spring -> datasource -> url
#### All end points can be tested on http://localhost:8080/informacoes/swagger-ui.html
#### JPA builds the database schema automatically.
#### Endpoints is configurated on: http://localhost:8080/informacoes/filmes / http://localhost:8080/informacoes/filmes/{id}

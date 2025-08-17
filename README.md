# Teste_Crud

Um CRUD com postgres via docker

## Libs usadas:

- Spring Web
- Spring Data JPA
- Spring Boot DevTools
- Docker Compose Support
- PostgreSQL Driver


## 

GET: localhost:8080/funcionario

GET: localhost:8080/funcionario/{id}

POST: localhost:8080/funcionario

`{
"nome": "xxxx",
"dataNascimento": [ yyyy, mm, dd ],
"salario": "0.99",
"funcao": "xxxxx"
}`

PUT: localhost:8080/funcionario/{id}

`{
"nome": "xxxx",
"dataNascimento": [ yyyy, mm, dd ],
"salario": "0.99",
"funcao": "xxxxx"
}`

DELETE: localhost:8080/funcionario/{id}
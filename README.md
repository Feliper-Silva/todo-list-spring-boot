# TODO LIST

API para gerenciar tarefas (CRUD) com base no [desafio](https://github.com/simplify-tec/desafio-junior-backend-simplify)
para pessoas desenvolvedoras backend júnior, que se candidataram para a Simplify.

## Tecnologias
- [Spring Boot](https://spring.io/projects/spring-boot/)
- [Spring  MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring JPA](https://spring.io/projects/spring-data-jpa)
- [Postgresql](https://www.postgresql.org/docs/)

## Práticas adotadas
- SOLID
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências 

## Como Executar
- Clonar repositório git
- Construir o projeto:
```` shell
./mvnw clean package
````
- Executar a aplicação:
```` shell
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
````
A API poderá ser acessada em [localhost:8080](http://localhost:8080).
## API Endpoints
Para realizar as requisições HTTP, foi utilizada a ferramento [postman](https://www.postman.com/downloads/)

- Criar Tarefa(POST)
    ```shell
    http://127.0.0.1:8080/todos
    ````
    ```shell
    [
        {
          "descricao": "Desc Todo 1",
          "id": 1,
          "nome": "Todo 1",
          "prioridade": 1,
          "realizado": false
        }
      ]
    ````
- Listar Tarefas (GET)
   ```shell
    http://127.0.0.1:8080/todos
    ````
    ```shell
  [
      {
        "descricao": "Desc Todo 1",
        "id": 1,
        "nome": "Todo 1",
        "prioridade": 1,
        "realizado": false
      }
    ]
    ````
- Atualizar Tarefas(PUT)
  ```shell
      http://127.0.0.1:8080/todos/1
  ````
  ```shell
    [
        {
        "descricao": "Desc Todo 1",
        "id": 1,
        "nome": "Todo 1 Atualizado",
        "prioridade": 1,
        "realizado": true
        }
    ]
   ````

- Delete Tarefa(DELETE)
  ```shell
      http://127.0.0.1:8080/todos/1
    ````
    retorno:
  ```
    []
  ````

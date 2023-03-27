## A modified version of the Micronaut guide - ACCESS A DATABASE WITH MICRONAUT DATA AND HIBERNATE REACTIVE

https://guides.micronaut.io/latest/micronaut-data-hibernate-reactive-gradle-java.html

This was put together to test many to many handling between entities which is not provided by standard Micronaut JDBC or R2DBC.

### JSON
**POST - Create genres:**

`curl --location 'http://localhost:8080/genres' --header 'Content-Type: application/json' --data '{ "name": "sci-fi" }'`

`curl --location 'http://localhost:8080/genres' --header 'Content-Type: application/json' --data '{ "name": "fiction" }'`

`curl --location 'http://localhost:8080/genres' --header 'Content-Type: application/json' --data '{ "name": "horror" }'`

**POST - Create book with one genre:**

`curl --location 'http://localhost:8080/books' --header 'Content-Type: application/json' 
--data '{ "name": "war of the worlds", "genres": [ 1 ] }'`

**PUT - Update book (replace):**

`curl --location --request PUT 'http://localhost:8080/books' --header 'Content-Type: application/json' --data '{"id": 1,"name": "star wars","genres": [3,2,1]}'`

**PATCH - Update genres only:**

`curl --location --request PATCH 'http://localhost:8080/books' --header 'Content-Type: application/json' --data '{"id": 1,"genres": [1,2]}'`
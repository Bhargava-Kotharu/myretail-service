# My Retail Service #

My Retail Service provides Products API.

## Prerequisites ##

Following software is required to run the application.

- MySQL DB 
- Mongo DB
- Eclipse or any other IDE
- Maven (for command line)

## Technology Stack & External Libraries ##

- Java 8
- Spring Boot
- Hibernate/JPA
- Junit 4
- MySQL DB
- Mongo DB
- Swagger

## Execution Instructions ##

Application can be executed in two ways

### From any IDE (Eclipse is used) ###
	- Right click on MyRetailServiceApplicaiton.java and select Run as Java Application
	- Right click on the project and run as Spring Boot App
	
### From Command Line ###
	- Open terminal in application root folder and execute command mvn spring-boot:run
	
## Instructions to access the API #

Application is started at context path /  and port 8080 and following APIs are exposed.

### GET Products API ###

	-RequestURL                 : http://localhost:8080/api/v1/products/{id}
	-Request Method             : GET
	-Successful Response Code   : 200
	-Successful Response Format : {"id":13860428,"current_price":{"value": 13.49,"currency_code":"USD", "product_desc":"Shirt"}}
	-Error Response Code        : 404 (Not Found)

### PUT Products API ###

	-RequestURL                 : http://localhost:8080/api/v1/products/{id}
	-Request Method             : PUT
	-Successful Response Code   : 204
	-Successful Response Format : No Content
	-Error Response Code        : 404 (Not Found)

## API Documentation ##

Swagger has been used to generate API docs.

Link: http://localhost:8080/api/swagger-ui.html




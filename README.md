# CRUD-Rest-API
I built a simple Spring Boot CRUD Rest API project. To test the REST APIs, I used Postman Client. I used Spring Data JPA to develop a repository layer and MySQL database at the backend.

# Know more about Spring
I would suggest to go through the spring.io website to know more about spring framework. Just go through the documentation so that you have an idea about what we are working on and in what all scenarios we can approach spring as a solution to our problems.
here is the link https://spring.io/

# Database
you have to create your own databse using mysql. I have named my database aparna.

# Connecting to database
I have used sql as database. The text inside application.properties is responsible for connecting to database. Do remeber to replace your username and password. Since my databse is named aparna therefore the url
spring.datasource.url=jdbc:mysql://localhost:3306/aparna?useSSL=false has aparna?... Instead replace it by your database name.

# Model
We are creating the table employees under our database and since we have set spring.jpa.hibernate.ddl-auto=update in application.properties, this means that if there is some change it will just update the table and not delete and create another everytime you run it.

# Repository
It will contain all CRUD methods. CRUD stands for Create Read Update Delete.

# Controller
A controller in Spring Boot is responsible for processing all the REST API requests.

# MVC
Model View Controller -> A CONTROLLER is responsible for processing API requests. It prepares a MODEL and returns the VIEW to be rendered as a response.

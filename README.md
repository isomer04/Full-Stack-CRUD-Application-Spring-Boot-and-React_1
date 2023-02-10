 #Full Stack CRUD Application
 
A full-stack CRUD application built with Spring Boot, MySQL, Bootstrap, and React. This application allows users to perform Create, Read, Update, and Delete operations on a database.

##Prerequisites
Java 8 or later
MySQL
Node.js
npm
Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

##Step 1: Clone the repository
Clone the repository to your local machine using the following command:

(``` 
git clone https://github.com/<your-username>/full-stack-crud-application.git```)

##Step 2: Create the database

Create a database in MySQL with the name "crud_db". You can do this by running the following command in the MySQL prompt:

###sql

(```sql
CREATE DATABASE crud_db;```)

###Step 3: Configure the database connection
Open the application.properties file in the src/main/resources directory and change the following properties to match your MySQL setup:

(```java
spring.datasource.url=jdbc:mysql://localhost:3306/crud_db
spring.datasource.username=<your-mysql-username>
spring.datasource.password=<your-mysql-password>```)


##Step 4: Build and run the application
Navigate to the root directory of the project and run the following command to build and run the application:


./mvnw spring-boot:run
The application will be running at http://localhost:8080.

##Step 5: Start the React client
Navigate to the client directory and run the following commands to start the React client:

(```
npm install
npm start```)

The React client will be running at http://localhost:3000.

###Built With

Spring Boot - The web framework used
MySQL - The database used
Bootstrap - The front-end framework used
React - The front-end library used

Contributing
Please read CONTRIBUTING.md for details on our code of conduct, and the process for submitting pull requests to us.

###License
This project is licensed under the MIT License - see the LICENSE.md file for details.

###Acknowledgments
Spring Initializer - Used for generating the initial Spring Boot project structure.
Create React App - Used for generating the initial React client.

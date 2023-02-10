# Full Stack CRUD Application

A full-stack CRUD application built with Spring Boot, MySQL, Bootstrap, and React. This application allows users to perform Create, Read, Update, and Delete operations on a database.

## Prerequisites

Before you begin, make sure you have the following software installed on your system:

- Java 8 or later
- MySQL
- Node.js
- npm

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Step 1: Clone the repository

Clone the repository to your local machine using the following command:

`git clone https://github.com/<your-username>/full-stack-crud-application.git`


### Step 2: Create the database

Create a database in MySQL with the name "crud_db". You can do this by running the following command in the MySQL prompt:

`CREATE DATABASE crud_db;`


### Step 3: Configure the database connection

Open the `application.properties` file in the `src/main/resources` directory and change the following properties to match your MySQL setup:

`spring.datasource.url=jdbc:mysql://localhost:3306/crud_db
spring.datasource.username=<your-mysql-username>
spring.datasource.password=<your-mysql-password>`


### Step 4: Build and run the application

Navigate to the root directory of the project and run the following command to build and run the application:

`./mvnw spring-boot:run`

The application will be running at [http://localhost:8080](http://localhost:8080).

### Step 5: Start the React client

Navigate to the `client` directory and run the following commands to start the React client:

`npm install
npm start`


The React client will be running at [http://localhost:3000](http://localhost:3000).

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
- [MySQL](https://www.mysql.com/) - The database used
- [Bootstrap](https://getbootstrap.com/) - The front-end framework used
- [React](https://reactjs.org/) - The front-end library used

## Contributing

If you want to contribute to the project, please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments

- [Spring Initializer](https://start.spring.io/) - Used for generating the initial Spring Boot project structure.
- [Create React App](https://facebook.github.io/create-react-app/) - Used for generating the initial React client.


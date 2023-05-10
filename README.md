

<h1 align="center"> Registration_Form </h1>

>### Prerequisites
* ![MySql](https://img.shields.io/badge/DBMS-MYSQL%205.7%20or%20Higher-red)
 * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)


* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)
>## Getting started
* Clone the repository to your local machine.
* Create a MySQL database and update the application.properties file with the database credentials and connection details.
* Build the project using Maven: mvn clean install
* Run the application using java -jar target/Registration_Form-0.0.1-SNAPSHOT.jar
* Access the APIs using any HTTP client such as Postman or cURL.
* In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the mysql-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.
* Employee APIs
* GET /controller/getAllUser - get all Users
* GET /controller/getById/{id} - get an Users by id
* POST /controller - create a new User
* PUT /controller/upadate/{id} - update an user by id
* DELETE /controller/delete/{id} - delete an user by id

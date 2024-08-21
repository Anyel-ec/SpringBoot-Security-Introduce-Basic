# Spring-Security-Basic

Spring-Security-Basic is a Java application built with Spring Boot that provides a REST API for managing departments, employees, languages, and their relationships in a MySQL database. The application uses Spring Security for basic security and Springdoc OpenAPI for API documentation.

## Features

- Department Management
- Employee Management
- Language Management
- Relationships between Departments and Languages
- API Documentation with Swagger

## Technologies Used

- **Spring Boot**: Framework for developing Java applications.
- **Spring Security**: For basic security.
- **Spring Data JPA**: For persistence management.
- **Springdoc OpenAPI**: For API documentation.
- **MySQL**: Relational database.
- **Lombok**: For automatic generation of getters, setters, and constructors.

## Requirements

- Java 17
- MySQL 8.0 or higher
- Maven

## Configuration

### Database

The database configuration can be found in the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring_security_basic
spring.datasource.username=root
spring.datasource.password=anyel
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
```

Make sure to create the `spring_security_basic` database in MySQL.

### Dependencies

The main dependencies are specified in the `pom.xml` file. These include:

- **Spring Boot Starter Web**
- **Spring Boot Starter Data JPA**
- **Spring Security**
- **Springdoc OpenAPI**
- **MySQL Connector**

## API Endpoints

### Departments

- **GET** `/departmentsAppd`: Retrieves all departments.
- **GET** `/departmentsAppd/{id}`: Retrieves a department by ID.
- **POST** `/departmentsAppd`: Creates new departments.
- **PUT** `/departmentsAppd/{id}`: Updates an existing department.
- **DELETE** `/departmentsAppd/{id}`: Deletes a department.

### Employees

- **GET** `/employeesAppd`: Retrieves all employees.
- **GET** `/employeesAppd/{id}`: Retrieves an employee by ID.
- **POST** `/employeesAppd`: Creates new employees.
- **PUT** `/employeesAppd/{id}`: Updates an existing employee.
- **DELETE** `/employeesAppd/{id}`: Deletes an employee.

### Languages

- **GET** `/languagesAppd`: Retrieves all languages.
- **GET** `/languagesAppd/{id}`: Retrieves a language by ID.
- **POST** `/languagesAppd`: Creates new languages.
- **PUT** `/languagesAppd/{id}`: Updates an existing language.
- **DELETE** `/languagesAppd/{id}`: Deletes a language.

### Department-Language Relationships

- **GET** `/departmentLanguagesAppd`: Retrieves all department-language relationships.
- **GET** `/departmentLanguagesAppd/{departmentIdAppd}/{languageIdAppd}`: Retrieves a relationship by department and language IDs.
- **POST** `/departmentLanguagesAppd`: Creates new department-language relationships.
- **PUT** `/departmentLanguagesAppd/{departmentIdAppd}/{languageIdAppd}`: Updates an existing relationship.
- **DELETE** `/departmentLanguagesAppd/{departmentIdAppd}/{languageIdAppd}`: Deletes a relationship.

## API Documentation

API documentation is available on Swagger UI. You can access it at the following URL:

```
http://localhost:8080/swagger-ui.html
```

## Running the Project

To run the application, follow these steps:

1. **Clone the repository:**

    ```bash
    git clone https://github.com/Anyel-ec/SpringBoot-Security-Introduce-Basic
    ```

2. **Navigate to the project directory:**

    ```bash
    cd SpringBoot-Security-Introduce-Basic
    ```

3. **Build and run the application with Maven:**

    ```bash
    ./mvnw spring-boot:run
    ```

## Testing

Tests are located in the `src/test/java` directory. You can run tests with Maven:

```bash
./mvnw test
```

## Contributing

If you wish to contribute to the project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your changes.
3. Submit a pull request with a description of your changes.

## License

This project is licensed under the Apache 2.0 License. See the `LICENSE` file for details.

## Contact

For questions or issues, contact:

- **Name:** Developed by Anyel EC
- **Email:** [cyberdevmatrix@gmail.com](mailto:cyberdevmatrix@gmail.com)

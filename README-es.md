# Spring-Security-Basic

Spring-Security-Basic es una aplicación Java construida con Spring Boot que proporciona una API REST para gestionar departamentos, empleados, lenguajes y sus relaciones en una base de datos MySQL. La aplicación utiliza Spring Security para la seguridad básica y Springdoc OpenAPI para la documentación de la API.

## Características

- Gestión de Departamentos
- Gestión de Empleados
- Gestión de Lenguajes
- Relaciones entre Departamentos y Lenguajes
- Documentación de API con Swagger

## Tecnologías Utilizadas

- **Spring Boot**: Framework para desarrollar aplicaciones Java.
- **Spring Security**: Para la seguridad básica.
- **Spring Data JPA**: Para la gestión de la persistencia.
- **Springdoc OpenAPI**: Para la documentación de la API.
- **MySQL**: Base de datos relacional.
- **Lombok**: Para la generación automática de getters, setters, y constructores.

## Requisitos

- Java 17
- MySQL 8.0 o superior
- Maven

## Configuración

### Base de Datos

La configuración de la base de datos se encuentra en el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring_security_basic
spring.datasource.username=root
spring.datasource.password=anyel
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
```

Asegúrate de crear la base de datos `spring_security_basic` en MySQL.

### Dependencias

Las dependencias principales están especificadas en el archivo `pom.xml`. Aquí se incluyen:

- **Spring Boot Starter Web**
- **Spring Boot Starter Data JPA**
- **Spring Security**
- **Springdoc OpenAPI**
- **MySQL Connector**

## Endpoints de la API

### Departamentos

- **GET** `/departmentsAppd`: Obtiene todos los departamentos.
- **GET** `/departmentsAppd/{id}`: Obtiene un departamento por ID.
- **POST** `/departmentsAppd`: Crea nuevos departamentos.
- **PUT** `/departmentsAppd/{id}`: Actualiza un departamento existente.
- **DELETE** `/departmentsAppd/{id}`: Elimina un departamento.

### Empleados

- **GET** `/employeesAppd`: Obtiene todos los empleados.
- **GET** `/employeesAppd/{id}`: Obtiene un empleado por ID.
- **POST** `/employeesAppd`: Crea nuevos empleados.
- **PUT** `/employeesAppd/{id}`: Actualiza un empleado existente.
- **DELETE** `/employeesAppd/{id}`: Elimina un empleado.

### Lenguajes

- **GET** `/languagesAppd`: Obtiene todos los lenguajes.
- **GET** `/languagesAppd/{id}`: Obtiene un lenguaje por ID.
- **POST** `/languagesAppd`: Crea nuevos lenguajes.
- **PUT** `/languagesAppd/{id}`: Actualiza un lenguaje existente.
- **DELETE** `/languagesAppd/{id}`: Elimina un lenguaje.

### Relaciones entre Departamentos y Lenguajes

- **GET** `/departmentLanguagesAppd`: Obtiene todas las relaciones entre departamentos y lenguajes.
- **GET** `/departmentLanguagesAppd/{departmentIdAppd}/{languageIdAppd}`: Obtiene una relación por ID de departamento y lenguaje.
- **POST** `/departmentLanguagesAppd`: Crea nuevas relaciones entre departamentos y lenguajes.
- **PUT** `/departmentLanguagesAppd/{departmentIdAppd}/{languageIdAppd}`: Actualiza una relación existente.
- **DELETE** `/departmentLanguagesAppd/{departmentIdAppd}/{languageIdAppd}`: Elimina una relación.

## Documentación de la API

La documentación de la API está disponible en Swagger UI. Puedes acceder a ella en la siguiente URL:

```
http://localhost:8080/swagger-ui.html
```

## Ejecución del Proyecto

Para ejecutar la aplicación, sigue estos pasos:

1. **Clona el repositorio:**

    ```bash
    git clone https://github.com/Anyel-ec/SpringBoot-Security-Introduce-Basic
    ```

2. **Navega al directorio del proyecto:**

    ```bash
    cd SpringBoot-Security-Introduce-Basic
    ```

3. **Compila y ejecuta la aplicación con Maven:**

    ```bash
    ./mvnw spring-boot:run
    ```

## Pruebas

Las pruebas están ubicadas en el directorio `src/test/java`. Puedes ejecutar las pruebas con Maven:

```bash
./mvnw test
```

## Contribución

Si deseas contribuir al proyecto, por favor sigue estos pasos:

1. Realiza un fork del repositorio.
2. Crea una nueva rama para tus cambios.
3. Envía un pull request con una descripción de tus cambios.

## Licencia

Este proyecto está licenciado bajo la Licencia Apache 2.0. Consulta el archivo `LICENSE` para más detalles.

## Contacto

Para preguntas o problemas, contacta a:

- **Nombre:** Desarrollado por Anyel EC
- **Email:** [cyberdevmatrix@gmail.com](mailto:cyberdevmatrix@gmail.com)

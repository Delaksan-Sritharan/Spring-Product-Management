# Product Management Application

This is a simple web application for managing products. It allows users to create, read, update, and delete product information.

## Technologies Used

* **Backend:**
    * Spring Boot:  For handling server-side logic and RESTful API endpoints.
    * Java: The programming language.
* **Frontend:**
    * Thymeleaf:  A server-side Java template engine for creating dynamic web pages.
    * HTML: For structuring the web pages.
 
* **Database:** 
    * MySQL
* **Build Tool:**
    * Maven: For project management and building.

## Features

* **List Products:** Displays all products in a table.  (`list.html`)
* **Add Product:** Allows users to add a new product. (`add.html`)
* **Edit Product:** Allows users to modify an existing product. (`edit.html`)
* **Delete Product:** Allows users to remove a product.

## Files Included

* `ProductController.java`:  Spring MVC controller to handle product-related requests.
* `ProductService.java`: Service layer to manage product business logic (not shown in your code, but implied).
* `ProductRepository`
* `Product.java`:  A Java class representing the product entity. 
* `list.html`:  HTML template to display the list of products.
* `add.html`:  HTML template to add a new product.
* `edit.html`:  HTML template to edit an existing product.
* `pom.xml`:  Maven project configuration file 
* `application.properties` or `application.yml`:  Spring Boot configuration file (not provided, but essential).

## Setup Instructions

1.  **Prerequisites:**
    * Java Development Kit (JDK) 17 or later
    * Maven 3.6 or later
    * A database (MySQL)
    * An IDE (IntelliJ IDEA)

2.  **Get the Code:**
    * Clone the repository containing the project.  
3.  **Set up the Database:**
    * Create a database schema for the application.
    * Configure the database connection in `application.properties` or `application.yml`.  For example:

        ```properties
        # MySQL Database Configuration
        spring.datasource.url=jdbc:mysql://localhost:3306/springboot_crud
        spring.datasource.username=root
        spring.datasource.password=
        spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
        ```

4.  **Build the Application:**
    * Open a terminal or command prompt in the project's root directory.
    * Run the following Maven command:
        ```bash
        mvn clean install
        ```

5.  **Run the Application:**
    * Run the Spring Boot application from your IDE, or use the following Maven command:
        ```bash
        mvn spring-boot:run
        ```

6.  **Access the Application:**
    * Open your web browser and go to `http://localhost:8080/products` to see the list of products.

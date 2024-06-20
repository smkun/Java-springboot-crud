# Java-springboot-crud

# Employee CRUD Application

This is a simple Spring Boot application that performs CRUD operations on an Employee entity using a PostgreSQL database. The application uses Spring Data JPA for data persistence and Thymeleaf for rendering the views.

## Table of Contents

-   [Technologies Used](#technologies-used)
-   [Features](#features)
-   [Installation](#installation)
-   [Usage](#usage)
-   [Application Structure](#application-structure)
-   [Endpoints](#endpoints)
-   [License](#license)

## Technologies Used

-   Spring Boot
-   Spring Data JPA
-   Thymeleaf
-   PostgreSQL
-   Maven

## Features

-   Create a new employee
-   Read a list of employees
-   Update an existing employee
-   Delete an employee

## Installation

### Prerequisites

-   Java 11 or later
-   Maven
-   PostgreSQL

### Steps

1. Clone the repository:

    ```sh
    git clone https://github.com/yourusername/EmployeeCRUDApp.git
    cd EmployeeCRUDApp
    ```

2. Set up the PostgreSQL database:

    - Create a database named `EmployeeDB`.
    - Update the `application.properties` file with your database credentials.

3. Build and run the application:

    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

4. Open a web browser and go to `http://localhost:8081` to see the application.

## Usage

1. **Home Page:** Displays a list of all employees. You can add a new employee, edit an existing one, or delete an employee.
2. **Add New Employee:** Click on "Add New Employee" to open a form to create a new employee.
3. **Edit Employee:** Click on "Edit" next to an employee to update their details.
4. **Delete Employee:** Click on "Delete" next to an employee to remove them from the database.

## Application Structure

-   `com.example.EmployeeCRUDApp`
    -   `controller` - Contains the controllers for handling HTTP requests.
        -   `EmployeeController.java`
    -   `model` - Contains the entity classes.
        -   `Employee.java`
    -   `repository` - Contains the repository interfaces for data access.
        -   `EmployeeRepository.java`
    -   `service` - Contains the service classes for business logic.
        -   `EmployeeService.java`
    -   `resources`
        -   `templates` - Contains Thymeleaf templates for views.
            -   `index.html`
            -   `new_employee.html`
            -   `update_employee.html`
        -   `application.properties` - Contains configuration properties for the application.
    -   `EmployeeCrudAppApplication.java` - The main class that Spring Boot uses to launch the application.

## Endpoints

-   `GET /` - View the home page with the list of employees.
-   `GET /showNewEmployeeForm` - Show the form to create a new employee.
-   `POST /saveEmployee` - Save a new or updated employee.
-   `GET /showFormForUpdate/{id}` - Show the form to update an existing employee.
-   `GET /deleteEmployee/{id}` - Delete an employee by their ID.

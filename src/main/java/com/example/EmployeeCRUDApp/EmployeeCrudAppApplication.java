//EmployeeCrudAppApplication.java is the main class that Spring Boot looks for to start the application.
package com.example.EmployeeCRUDApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeCrudAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeCrudAppApplication.class, args);
    }
}

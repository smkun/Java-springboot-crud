// EmployeeRepository.java
package com.example.EmployeeCRUDApp.repository;

import com.example.EmployeeCRUDApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // JpaRepository provides CRUD operations methods such as save(), findAll(), findById(), deleteById(), etc.
}

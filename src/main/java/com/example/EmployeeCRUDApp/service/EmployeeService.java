// EmployeeService.java
package com.example.EmployeeCRUDApp.service;

import com.example.EmployeeCRUDApp.model.Employee;
import com.example.EmployeeCRUDApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Retrieves all employees from the repository
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Saves a given employee to the repository
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    // Retrieves an employee by their ID
    public Employee getEmployeeById(Long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException("Employee not found for id :: " + id);
        }
        return employee;
    }

    // Deletes an employee by their ID
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}

package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
    public Employee saveEmployee(Employee employee);
    public Optional<Employee> getEmployeeById(int id);
    List<Employee>getAllEmployee();
    Employee updateEmployee(int id, Employee employee);
    void deleteEmployee(int id);
}

package com.tutorial.employeemanagmentbackend.controller;

import com.tutorial.employeemanagmentbackend.model.Employee;
import com.tutorial.employeemanagmentbackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();

    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
    public Employee updateEmployee(@PathVariable int id, Employee employee){
        return employeeService.updateEmployee(id, employee);
    }
    @DeleteMapping
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}

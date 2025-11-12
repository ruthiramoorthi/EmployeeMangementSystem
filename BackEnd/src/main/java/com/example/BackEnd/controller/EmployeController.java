package com.example.BackEnd.controller;

import com.example.BackEnd.model.Employee;
import com.example.BackEnd.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeController {

    @Autowired
    EmployeService employeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeService.getAllEmployee();
    }

    @PostMapping("/employee/add")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeService.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeService.deleteEmployee(id);
    }
}

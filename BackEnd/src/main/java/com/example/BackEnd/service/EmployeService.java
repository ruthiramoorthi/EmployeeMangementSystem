package com.example.BackEnd.service;

import com.example.BackEnd.model.Employee;
import com.example.BackEnd.repositary.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeService {

    @Autowired
    EmployeeRepositary employeeRepositary;


    public List<Employee> getAllEmployee() {
        return employeeRepositary.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepositary.save(employee);
    }
}

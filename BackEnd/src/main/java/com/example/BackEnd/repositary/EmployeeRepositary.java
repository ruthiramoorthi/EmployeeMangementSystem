package com.example.BackEnd.repositary;

import com.example.BackEnd.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Optional;
@Repository
public interface EmployeeRepositary extends JpaRepository<Employee,Integer> {

}
package com.api.company.controller;

import com.api.company.model.Department;
import com.api.company.model.Employee;
import com.api.company.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Employee save(@RequestBody @Valid Employee employee) {
        employee.setCreatedAt(LocalDateTime.now());
        return repository.save(employee);
    }
}

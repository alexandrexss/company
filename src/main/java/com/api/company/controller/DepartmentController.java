package com.api.company.controller;

import com.api.company.model.Department;
import com.api.company.repository.DepartmentRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    private final DepartmentRepository repository;

    public DepartmentController(DepartmentRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Department save(@RequestBody @Valid Department department) {
        department.setCreatedAt(LocalDateTime.now());
        return repository.save(department);
    }
}

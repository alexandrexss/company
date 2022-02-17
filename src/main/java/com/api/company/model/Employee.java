package com.api.company.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="tb_employee")

public class Employee  {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @JsonProperty("employee_registration")
    @Column(name = "employee_registration", unique = true)
    @Length(max = 30)
    private String employeeRegistration;
    @NotBlank
    @Length(max = 400)
    private String name;
    @CPF
    @Column(unique = true)
    private String document;
    private LocalDateTime createdAt;
    @NotNull
    @JsonProperty("department_code")
    @Column(name = "department_code")
    private Integer departmentCode;

    public Long getId() {
        return id;
    }

    public String getEmployeeRegistration() {
        return employeeRegistration;
    }

    public void setEmployeeRegistration(String employeeRegistration) {
        this.employeeRegistration = employeeRegistration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(Integer departmentCode) {
        this.departmentCode = departmentCode;
    }
}

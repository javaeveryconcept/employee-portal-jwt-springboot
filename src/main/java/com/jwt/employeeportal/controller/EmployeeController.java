package com.jwt.employeeportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/profile")
    public String getProfile() {
        return "Your profile info from DB";
    }

    @GetMapping("/salary")
    public String getSalary() {
        return "Your salary is confidential";
    }
}

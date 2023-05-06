package com.example.staff.controller;

import com.example.staff.model.Employee;
import com.example.staff.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PageController {
    private final EmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity<List<Employee>> index() {
        return new ResponseEntity<>(employeeService.showAllEmployees(), HttpStatus.OK);
    }
}

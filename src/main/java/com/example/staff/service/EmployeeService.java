package com.example.staff.service;

import com.example.staff.model.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    void deleteEmployee(Long id);
    List<Employee> showAllEmployees();
}

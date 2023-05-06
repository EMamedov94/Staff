package com.example.staff.service.impl;

import com.example.staff.model.Employee;
import com.example.staff.repository.EmployeeRepository;
import com.example.staff.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    // Add employee
    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    // Delete employee
    @Override
    public void deleteEmployee(Long id) {
        Employee employeeFromDb = employeeRepository.findById(id).orElse(null);
        assert employeeFromDb != null;
        employeeRepository.delete(employeeFromDb);
    }

    // Show all employees
    @Override
    public List<Employee> showAllEmployees() {
        return employeeRepository.findAll();
    }
}

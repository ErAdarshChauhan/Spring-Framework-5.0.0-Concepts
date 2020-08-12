package com.chauhansoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chauhansoft.model.Employee;
import com.chauhansoft.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String showMsg() {

        return "Hey ! Welcome to Spring Boot.";
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(Employee employee, Model model) {

        return employeeService.getAllEmployees();
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee, Model model) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getAllEmployees(@PathVariable String employeeId) {

        return employeeService.getEmployeeById(Long.parseLong(employeeId));
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable String employeeId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(Long.parseLong(employeeId), employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public Employee deleteEmployee(@PathVariable String employeeId, @RequestBody Employee employee) {
        employeeService.deleteEmployee(employee);
        return employee;
    }


}








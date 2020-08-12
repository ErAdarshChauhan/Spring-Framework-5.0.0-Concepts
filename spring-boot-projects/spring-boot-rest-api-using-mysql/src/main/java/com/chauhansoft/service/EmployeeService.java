package com.chauhansoft.service;

import java.util.List;

import com.chauhansoft.model.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(long employeeId);

    Employee updateEmployee(long parseLong, Employee employee);

    void deleteEmployee(Employee employee);
}

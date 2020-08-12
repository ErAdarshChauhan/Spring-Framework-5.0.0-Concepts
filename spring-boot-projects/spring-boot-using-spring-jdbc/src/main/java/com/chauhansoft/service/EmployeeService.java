package com.chauhansoft.service;

import java.util.List;

import com.chauhansoft.model.Employee;

public interface EmployeeService {

    public int insertEmployee(Employee employee);

    public List getAllEmployee();

    public List updateEmployee(Employee employee);

    public List deleteEmployee(Employee employee);

    public List searchEmployee(Employee employee);
}

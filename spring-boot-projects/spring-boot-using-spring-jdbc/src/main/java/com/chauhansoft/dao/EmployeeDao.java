package com.chauhansoft.dao;

import java.util.List;

import com.chauhansoft.model.Employee;

public interface EmployeeDao {

    public int insertNewEmployee(Employee employee);

    public List getAllEmployee();

    public List updateEmployee(Employee employee);

    public List deleteEmployee(Employee employee);

    public List searchEmployee(Employee employee);
}

package com.chauhansoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chauhansoft.dao.EmployeeDao;
import com.chauhansoft.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        // TODO Auto-generated method stub
        return employeeDao.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeDao.save(employee);
    }

    @Override
    public Employee getEmployeeById(long employeeId) {
        // TODO Auto-generated method stub
        return employeeDao.findByEmployeeId(employeeId);
    }

    @Override
    public Employee updateEmployee(long employeeId, Employee employee) {
        // TODO Auto-generated method stub
        employeeDao.findByEmployeeId(employeeId);
        employeeDao.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(Employee employee) {
        // TODO Auto-generated method stub
        employeeDao.delete(employee);
    }


}

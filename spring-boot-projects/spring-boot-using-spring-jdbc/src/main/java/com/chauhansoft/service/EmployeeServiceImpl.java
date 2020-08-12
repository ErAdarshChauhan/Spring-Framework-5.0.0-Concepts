package com.chauhansoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chauhansoft.dao.EmployeeDao;
import com.chauhansoft.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public int insertEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeDao.insertNewEmployee(employee);
    }

    @Override
    public List getAllEmployee() {
        // TODO Auto-generated method stub
        return employeeDao.getAllEmployee();
    }

    @Override
    public List updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public List deleteEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeDao.deleteEmployee(employee);
    }

    @Override
    public List searchEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeDao.searchEmployee(employee);
    }


}

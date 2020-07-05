package com.chauhansoft.dao;

import org.springframework.data.repository.CrudRepository;

import com.chauhansoft.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long> {

}

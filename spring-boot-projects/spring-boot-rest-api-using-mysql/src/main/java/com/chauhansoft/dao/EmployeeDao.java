package com.chauhansoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chauhansoft.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

    Employee findByEmployeeId(Long employeeId);


}

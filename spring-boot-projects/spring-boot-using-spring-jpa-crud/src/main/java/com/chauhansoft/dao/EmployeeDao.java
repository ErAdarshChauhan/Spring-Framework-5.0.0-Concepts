package com.chauhansoft.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chauhansoft.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

    List<Employee> findByEmployeeId(Long id);

    List<Employee> findByEmployeeName(String name);

    List<Employee> findByEmail(String email);

    List<Employee> findByAddress(String address);
}

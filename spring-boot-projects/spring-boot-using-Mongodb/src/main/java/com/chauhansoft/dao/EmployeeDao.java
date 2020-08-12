package com.chauhansoft.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chauhansoft.model.Employee;

public interface EmployeeDao extends MongoRepository<Employee, String> {

    List<Employee> findByEmployeeId(String eid);

    List<Employee> findByEmployeeName(String name);

    List<Employee> findByEmail(String email);

    List<Employee> findByAddress(String address);

    List<Employee> deleteByEmployeeId(String eid);

}

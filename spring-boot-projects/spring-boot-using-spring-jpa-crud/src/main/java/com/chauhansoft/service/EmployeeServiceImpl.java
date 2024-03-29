package com.chauhansoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.chauhansoft.dao.EmployeeDao;
import com.chauhansoft.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeDao {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {
        // TODO Auto-generated method stub
        return employeeDao.findAll();
    }

    @Override
    public List<Employee> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Employee> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub

    }

    @Override
    public <S extends Employee> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Employee> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub

    }

    @Override
    public Employee getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Employee> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Employee> S save(S entity) {
        // TODO Auto-generated method stub
        return employeeDao.save(entity);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        // TODO Auto-generated method stub
        return employeeDao.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return employeeDao.count();
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        employeeDao.deleteById(id);
    }

    @Override
    public void delete(Employee entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll(Iterable<? extends Employee> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }

    @Override
    public <S extends Employee> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Employee> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends Employee> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Employee> findByEmployeeName(String name) {
        // TODO Auto-generated method stub
        return employeeDao.findByEmployeeName(name);
    }

    @Override
    public List<Employee> findByEmail(String email) {
        // TODO Auto-generated method stub
        return employeeDao.findByEmail(email);
    }

    @Override
    public List<Employee> findByAddress(String address) {
        // TODO Auto-generated method stub
        return employeeDao.findByAddress(address);
    }

    @Override
    public List<Employee> findByEmployeeId(Long id) {
        // TODO Auto-generated method stub
        return employeeDao.findByEmployeeId(id);
    }

}

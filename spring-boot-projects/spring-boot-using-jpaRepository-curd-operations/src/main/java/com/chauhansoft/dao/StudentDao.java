package com.chauhansoft.dao;

import org.springframework.data.repository.CrudRepository;

import com.chauhansoft.model.Student;


public interface StudentDao extends CrudRepository<Student, Long>{

}

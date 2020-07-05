package org.chauhansoft.dao;

import java.util.List;

import org.chauhansoft.model.Student;

public interface StudentDao {

	public boolean insertStudent(Student student);

	public List<Student> getAllStudent();
}

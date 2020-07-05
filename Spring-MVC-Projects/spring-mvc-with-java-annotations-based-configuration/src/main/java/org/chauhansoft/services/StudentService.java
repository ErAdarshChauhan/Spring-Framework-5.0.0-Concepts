package org.chauhansoft.services;

import java.util.List;

import org.chauhansoft.model.Student;

public interface StudentService {

	public boolean insertStudent(Student student);

	public List<Student> getAllStudent();
	
}

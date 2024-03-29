package org.chauhansoft.services;

import java.util.ArrayList;
import java.util.List;

import org.chauhansoft.dao.StudentDao;
import org.chauhansoft.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.insertStudent(student);
	}
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

}

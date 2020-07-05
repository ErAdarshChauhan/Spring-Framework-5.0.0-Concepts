package org.chauhansoft.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.chauhansoft.model.Student;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDao {

	private JdbcTemplate jdbc;

	
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}


	public Boolean insertStudent(final Student stud) {
		// TODO Auto-generated method stub
		
		String query = "insert into student_crud values(?,?,?,?,?)";
		return jdbc.execute(query, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setString(1, stud.getStudentId());
				ps.setString(2, stud.getStudentName());
				ps.setString(3, stud.getEmail());
				ps.setString(4, stud.getCourse());
				ps.setString(5, stud.getCategory());
				return ps.execute();
			}
		});
	}


	public List displayAllStudent(Student stud) {
		// TODO Auto-generated method stub
		
		final List list = new ArrayList();
		String query = "select * from student_crud";
		
		jdbc.query(query, new ResultSetExtractor<Student>() {

			@Override
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				while (rs.next()) {
					Student student = new Student();
					student.setStudentId(rs.getString(1));
					student.setStudentName(rs.getString(2));
					student.setEmail(rs.getString(3));
					student.setCourse(rs.getString(4));
					student.setCategory(rs.getString(5));
					
					//add all student to arraylist obj
					list.add(student);
				}
				return null;
			}
			
		});
		
		return list;
	}


	public List searchStudent(Student stud) {
		// TODO Auto-generated method stub
		final List list = new ArrayList();
		String query = "select * from student_crud where sid= '"+stud.getStudentId()+"' ";
	
		jdbc.query(query, new ResultSetExtractor<Student>() {
			@Override
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				while (rs.next()) {
					Student student = new Student();
					student.setStudentId(rs.getString(1));
					student.setStudentName(rs.getString(2));
					student.setEmail(rs.getString(3));
					student.setCourse(rs.getString(4));
					student.setCategory(rs.getString(5));
					
					//add all student to arraylist obj
					list.add(student);
				}
				return null;
			}
		});
		return list;
	}


	public List advancedSerch(Student stud) {
		// TODO Auto-generated method stub
		
		final List list = new ArrayList();
		String query = "select * from student_crud where sid= '"+stud.getStudentId()+"' or sname = '"+stud.getStudentName()+
				"' or email = '"+stud.getEmail()+"' or course = '"+stud.getCourse()+"' or category = '"+stud.getCategory()+"' ";
		
		jdbc.query(query, new ResultSetExtractor<Student>() {
			@Override
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				while (rs.next()) {
					Student student = new Student();
					student.setStudentId(rs.getString(1));
					student.setStudentName(rs.getString(2));
					student.setEmail(rs.getString(3));
					student.setCourse(rs.getString(4));
					student.setCategory(rs.getString(5));
					
					//add all student records in list
					list.add(student);
				}
				
				return null;
			}
		});
		return list;
	}


	public List updateStudent(final Student stud) {
		// TODO Auto-generated method stub
		List list ;
		String query = "update student_crud set sname = ?,email = ?,course = ?,category = ? where sid = ?";
		
		jdbc.execute(query, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setString(1,stud.getStudentName());
				ps.setString(2,stud.getEmail());
				ps.setString(3,stud.getCourse());
				ps.setString(4,stud.getCategory());
				ps.setString(5,stud.getStudentId());
				return ps.execute();
			}
		});
//		list = displayAllStudent(stud);
		list = searchStudent(stud); 
		return list;
	}


	public List deleteStudent(Student stud) {
		// TODO Auto-generated method stub
		List list ;
		String query = "delete from student_crud where sid = '"+stud.getStudentId()+"' ";
		
		jdbc.update(query);
		list = displayAllStudent(stud);
		
		return list;
	}


	public List loginStudent(Student stud) {
		// TODO Auto-generated method stub
		
		final List list = new ArrayList();
		String query = "select * from student_crud where sname = '"+stud.getStudentName()+"' AND email = '"+stud.getEmail()+"' ";
		
		jdbc.query(query, new ResultSetExtractor<Student>() {
			@Override
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if (rs.next()) {
					Student student = new Student();
					student.setStudentName(rs.getString(1));
					student.setEmail(rs.getString(2));
					
					list.add(student);
				}
				return null;
			}
			
		});
		
		return list;
	} 
	
	
}

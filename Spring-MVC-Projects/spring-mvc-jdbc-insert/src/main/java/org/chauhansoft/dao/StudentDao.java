package org.chauhansoft.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.chauhansoft.model.Student;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class StudentDao {

	private JdbcTemplate jdbc;

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public Boolean insertStudent(final Student student) {
		// TODO Auto-generated method stub
		
		String query = "insert into student values(?,?,?,?,?)";
		
		return jdbc.execute(query, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setInt(1, student.getStudentId());
				ps.setString(2, student.getStudentName());
				ps.setString(3, student.getEmail());
				ps.setInt(4, student.getAge());
				ps.setString(5, student.getCourse());
				return ps.execute();
			}
		});
	}
	
}

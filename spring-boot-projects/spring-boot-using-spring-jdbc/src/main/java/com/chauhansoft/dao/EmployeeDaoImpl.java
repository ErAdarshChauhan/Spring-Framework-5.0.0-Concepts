package com.chauhansoft.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.chauhansoft.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public int insertNewEmployee(Employee employee) {
        // TODO Auto-generated method stub
        String query = "insert into employee_info values(?,?,?,?)";
        return jdbcTemplate.execute(query, new PreparedStatementCallback<Integer>() {

            @Override
            public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                // TODO Auto-generated method stub
                ps.setString(1, employee.getEmployeeId());
                ps.setString(2, employee.getEmployeeName());
                ps.setString(3, employee.getEmail());
                ps.setString(4, employee.getAddress());
                return ps.executeUpdate();
            }

        });
    }


    @Override
    public List getAllEmployee() {
        // TODO Auto-generated method stub
        String query = "select * from employee_info";
        List list = new ArrayList();
        jdbcTemplate.query(query, new ResultSetExtractor<Employee>() {

            @Override
            public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
                // TODO Auto-generated method stub
                while (rs.next()) {
                    Employee employee = new Employee();
                    employee.setEmployeeId(rs.getString(1));
                    employee.setEmployeeName(rs.getString(2));
                    employee.setEmail(rs.getString(3));
                    employee.setAddress(rs.getString(4));

                    list.add(employee);
                }
                return null;
            }

        });
        return list;
    }


    @Override
    public List updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        List list = new ArrayList();
        String query = "update employee_info set ename=?, email=?, address=? where eid=?";
        jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                // TODO Auto-generated method stub
//				System.out.println(employee.getEmployeeName());
                ps.setString(1, employee.getEmployeeName());
                ps.setString(2, employee.getEmail());
                ps.setString(3, employee.getAddress());
                ps.setString(4, employee.getEmployeeId());
                return ps.execute();
            }

        });

        list = getAllEmployee();
        return list;
    }


    @Override
    public List deleteEmployee(final Employee employee) {
        // TODO Auto-generated method stub

        String query = "delete from employee_info where eid=" + employee.getEmployeeId();
        List list = new ArrayList();
        jdbcTemplate.update(query);

        list = getAllEmployee();
        return list;

    }


    @Override
    public List searchEmployee(Employee employee) {
        // TODO Auto-generated method stub
        List list = new ArrayList();
        System.out.println("****************");
        String query = "select * from employee_info where eid='" + employee.getEmployeeId() + "' or ename='" + employee.getEmployeeName() + "' or email='" + employee.getEmail() + "' or address='" + employee.getAddress() + "'";
        System.out.println("------------");
        jdbcTemplate.query(query, new ResultSetExtractor<Employee>() {

            @Override
            public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
                // TODO Auto-generated method stub

                while (rs.next()) {
                    Employee ee = new Employee();

                    ee.setEmployeeId(rs.getString(1));
                    ee.setEmployeeName(rs.getString(2));
                    ee.setEmail(rs.getString(3));
                    ee.setAddress(rs.getString(4));

                    list.add(ee);
                }

                return null;
            }
        });
        return list;
    }

}

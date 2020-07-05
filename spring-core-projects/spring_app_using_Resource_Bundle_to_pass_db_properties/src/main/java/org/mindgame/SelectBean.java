package org.mindgame;
import javax.sql.*;
import java.sql.*;

public class SelectBean implements Select {
	
	//bean property
	private DataSource ds;
	private Connection connection;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	public String fetchUsername(int id) {
		// TODO Auto-generated method stub
		try {
			connection = ds.getConnection();
			PreparedStatement ps = connection.prepareStatement("select name from user where id = ?");
			ps.setInt(1,id);
			String name = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				name = rs.getString(1);
				return name;
			}
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Error occured ........"+e);
		}
		
		return "Username is not Found.";
	}

	public String fetchCity(int id) {
		// TODO Auto-generated method stub
		try {
			connection = ds.getConnection();
			PreparedStatement ps = connection.prepareStatement("select city from user where id = ?");
			ps.setInt(1,id);
			String city = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				city = rs.getString(1);
				return city;
			}
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Error occured ........"+e);
		}
		
		return "City is not Found.";
	}

	public String fetchUser(int id) {
		// TODO Auto-generated method stub
		try {
			connection = ds.getConnection();
			PreparedStatement ps = connection.prepareStatement("select * from user where id = ?");
			ps.setInt(1,id);
			int userId = 0;
			String name = null;
			String city = null;
			String state = null;
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				userId = rs.getInt(1);
				name = rs.getString(2);
				city = rs.getString(3);
				state = rs.getString(4);
				return userId +" "+name+" "+city+" "+state;
			}
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Error occured ........"+e);
		}
		
		return "User is not Found.";
	}

}

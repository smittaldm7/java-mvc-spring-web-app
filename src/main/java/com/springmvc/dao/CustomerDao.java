package com.springmvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.springmvc.model.Customer;
import com.springmvc.util.DBConnection;
import com.springmvc.util.DBConnection2;

public class CustomerDao implements CustomerDaoInterface
{
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void create(Customer customer){
		
		String sql = "INSERT INTO CUSTOMER " +
				"(NAME, AGE) VALUES (?, ?)";
		Connection conn = null;
		
		try {
			//conn = dataSource.getConnection();
			//conn = DBConnection.createConnection();
			conn = DBConnection2.createConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, customer.getName());
			ps.setInt(2, customer.getAge());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public Customer findByCustomerId(int custId){
		
		String sql = "SELECT * FROM CUSTOMER WHERE ID = ?";
		
		Connection conn = null;
		
		try {
			//conn = dataSource.getConnection();
			//conn = DBConnection.createConnection();
			conn = DBConnection2.createConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = new Customer(
					rs.getInt("id"),
					rs.getString("name"), 
					rs.getInt("age")
				);
			}
			rs.close();
			ps.close();
			return customer;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public void printAllCustomers()
	{
		try
		{
			Connection con = null;
			Statement statement = null;
			ResultSet resultSet = null;
			con = DBConnection.createConnection(); //establishing connection
			statement = con.createStatement(); //Statement is used to write queries. Read more about it.
			resultSet = statement.executeQuery("select * from users"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
}
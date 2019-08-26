package com.spring.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/jee-mvc"; // MySQL URL and followed by the database name
		String username = "root"; // MySQL username
		String password = ""; // MySQL password

		try {
			Class.forName("com.mysql.jdbc.Driver"); // loading mysql driver
			con = DriverManager.getConnection(url, username, password); // attempting to connect to MySQL database
			// System.out.println("Printing connection object "+con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

package com.utill;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	Connection con =null;
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alph","root","");
			System.out.println("Connection Established...");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
	}
}

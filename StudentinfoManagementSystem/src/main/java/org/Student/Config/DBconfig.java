package org.Student.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBconfig {
   
	protected Connection conn;
	protected  PreparedStatement stmt;
	protected ResultSet rs;
	
	
	public DBconfig() {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/StudentInformationSystem","root","Pass1234");
		}catch (Exception ex) {
			// TODO: handle exception
			System.out.println("error is "+ex);
		}
	}
}

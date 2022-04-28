package com.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sql {

	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:Xe","hr","admin");
		
		String s = "select * from employees";
		
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		
		ResultSet executeQuery = prepareStatement.executeQuery();
		
		while (executeQuery.next()) {
			
			int int1 = executeQuery.getInt("first_name");
			
			System.out.println(int1);
			
		}
		
		connection.close();
		
		
		
		
	}
	
}

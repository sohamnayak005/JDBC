package com.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class Connection_Object {
public static void main(String[] args) {
	 try {
		   Class.forName("org.postgresql.Driver"); // Now a days it is optional
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc","postgres","root");
		System.out.println(con);
	} catch (SQLException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	 
	 
}
}

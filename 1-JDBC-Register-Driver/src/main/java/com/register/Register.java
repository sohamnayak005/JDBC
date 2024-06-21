package com.register;


import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class Register {
public static void main(String[] args) {
	Driver d=new Driver();
	try {
		DriverManager.registerDriver(d);
		System.out.println("Register Driver");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}

package com.load;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class Load {
public static void main(String[] args) {
   try {
	   Class.forName("org.postgresql.Driver");
	 System.out.println("Loaded...");
   }
 catch (ClassNotFoundException e) {
	
	e.printStackTrace();
}
}
}

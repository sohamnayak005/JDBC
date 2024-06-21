package com.executeupdate;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.Driver;

//**************** Create the Database *****************

//public class ExecuteUpdate_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","root");
//		Statement stmt=con.createStatement();
//		int b2=stmt.executeUpdate("create database product");
//		System.out.println(b2);
//	}
//	catch(ClassNotFoundException e) {
//		e.printStackTrace();
//	}
//	catch(SQLException e) {
//		e.printStackTrace();
//	}
//}
//}


//**************** Create the table *****************

//public class ExecuteUpdate_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/product","postgres","root");
//		Statement stmt=con.createStatement();
//		int b1=stmt.executeUpdate("create table laptop(lpid int not null unique,lpname varchar(20) not null,price bigint)");
//		// if i write varchar(20) it will automatically convert character varying because PostgreSql support character varying
//		
//		int b2=stmt.executeUpdate("create table mobile(id int not null unique,name character varying not null,price bigint)");
//		System.out.println(b1+" "+b2);
//	}
//	catch(ClassNotFoundException e) {
//		e.printStackTrace();
//	}
//	catch(SQLException e) {
//		e.printStackTrace();
//	}
//}
//}

//**************** Insert the data into the table *****************
//public class ExecuteUpdate_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/product","postgres","root");
//		Statement stmt=con.createStatement();
//		String query="insert into laptop(lpid,lpname,price)values(102,'HP',57000)";
//		int b=stmt.executeUpdate(query);
//		System.out.println(b);
//	}
//	catch(ClassNotFoundException e) {
//		e.printStackTrace();
//	}
//	catch(SQLException e) {
//		e.printStackTrace();
//	}
//}
//}


////**************** Insert multiple the data into the table *****************
//public class ExecuteUpdate_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/product","postgres","root");
//		Statement stmt=con.createStatement();
//		String query="insert into laptop(lpid,lpname,price)values(104,'Dell',100000),(105,'Lenevo',800080)";
//		int b=stmt.executeUpdate(query);
//		System.out.println(b);
//	}
//	catch(ClassNotFoundException e) {
//		e.printStackTrace();
//	}
//	catch(SQLException e) {
//		e.printStackTrace();
//	}
//}
//}


//**************** Update the data into the table *****************
//public class ExecuteUpdate_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/product","postgres","root");
//		Statement stmt=con.createStatement();
//		String query="update laptop set lpname='Asus' where lpid=102";
//		int b=stmt.executeUpdate(query);
//		System.out.println(b);
//	}
//	catch(ClassNotFoundException e) {
//		e.printStackTrace();
//	}
//	catch(SQLException e) {
//		e.printStackTrace();
//	}
//}
//}

//**************** Delete the data into the table *****************
public class ExecuteUpdate_Method {
public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/product","postgres","root");
		Statement stmt=con.createStatement();
		String query="delete from laptop where lpid in(105,104)";
		int b=stmt.executeUpdate(query);
		System.out.println(b);
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
}
}



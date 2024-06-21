package com.execute;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.Driver;


//**************** Create the database *****************

//public class Execute_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","root");
//		Statement stmt=con.createStatement();
//		boolean b=stmt.execute("create database db");
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

//**************** Create the Table *****************

//public class Execute_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/db","postgres","root");
//		Statement stmt=con.createStatement();
//		boolean b1=stmt.execute("create table emp(eid int not null unique,ename varchar(20) not null,dob date,age int check(age>18))");
//		// if i write varchar(20) it will automatically convert character varying because PostgreSql support character varying
//		
//		boolean b2=stmt.execute("create table student(sid int not null unique,sname character varying(30) not null,dob date,age int check(age>18))");
//		boolean b3=stmt.execute("create table course(cid int not null unique,cname character varying not null)");
//		System.out.println(b1+" "+b2+" "+b3);
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

//public class Execute_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/db","postgres","root");
//		Statement stmt=con.createStatement();
//		String query="insert into emp(eid,ename,dob,age)values(101,'Soham Nayak','12-NOV-2023',67)";
//		boolean b=stmt.execute(query);
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


//**************** Insert multiple the data into the table *****************

//public class Execute_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/db","postgres","root");
//		Statement stmt=con.createStatement();
//		String query="insert into emp(eid,ename,dob,age)values(103,'Soham Nayak','12-NOV-2023',67),(104,'Ram Pal','12-06-2000',19)";
//		boolean b=stmt.execute(query);
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
//public class Execute_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/db","postgres","root");
//		Statement stmt=con.createStatement();
//		String query="update emp set ename='Rohit Pal' where eid=103";
//		boolean b=stmt.execute(query);
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

//public class Execute_Method {
//public static void main(String[] args) {
//	try {
//		Class.forName("org.postgresql.Driver");
//		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/db","postgres","root");
//		Statement stmt=con.createStatement();
//		String query="delete from emp where eid in(105,104)";
//		boolean b=stmt.execute(query);
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

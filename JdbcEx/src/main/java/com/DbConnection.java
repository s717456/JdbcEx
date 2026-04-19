package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
		DbConnection.ex1();
		System.out.println(DbConnection.ex2());
		System.out.println(DbConnection.getDb());//打包成連線method物件
	}
	
	public static Connection getDb() {
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="B2ev9cz3ui74";
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=DriverManager.getConnection(url,user,password);
		}
		catch (ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
			
		} 
		catch (SQLException e) {
			System.out.println("no Connection");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static String ex2() {
		return "巨匠電腦"; 
	}
	public static void ex1() {
		System.out.println("hello");
	}
}

package com;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * jdbc連線到company database
		 * 1.檢查driver-->Class.forNmae()
		 * 2.透過Drivermanager.getConnection()連線
		 */
		
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="B2ev9cz3ui74";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//檢查連線
			DriverManager.getConnection(url,user,password);
			System.out.println("Connection!");
		}
		catch (ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("no Connection");
			e.printStackTrace();
		}
	}

}

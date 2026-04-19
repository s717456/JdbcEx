package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEx {

	public static void main(String[] args) {
		/*
		 * 1.先連線到database
		 * 2.串接-->Connection
		 * 3.串接-->Statement-->撰寫SQL
		 */
		
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="B2ev9cz3ui74";
		String sql="insert into member(name,username,password,address,phone)"
				+"values('teacher2','def','b2ev9cz3ui74','基隆市','0123456789')";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,password);
			Statement st=conn.createStatement();
			st.execute(sql);
		}
		catch(ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("no Connection");
			e.printStackTrace();
		}
	}

}

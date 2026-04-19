package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateEx2 {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password = "B2ev9cz3ui74";
		String sql="insert into member(name,username,password,address,phone)"
				+"values(?,?,?,?,?)";
		//? 暫時不放值
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,password); 
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "Bob");
			ps.setString(2, "Bob1");
			ps.setString(3, "i9j8yf");
			ps.setString(4, "Taichung");
			ps.setString(5, "0912767321");
			
			ps.executeUpdate();
			System.out.println("Success");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("no Driver");
		} 
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("no Connection");
		}
		
	}

}

package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEx {

	public static void main(String[] args) {
		/*
		 * 1.先連線-->DriverManager-->Connection
		 * 2.PreparedStatement-->撰寫Sql-->
		 * 3.ResultSet-->顯示資料
		 */
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="B2ev9cz3ui74";
		String sql="SELECT*FROM member";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,password);
			
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {		//確認有資料才顯示，以免拋異常
				System.out.println(
				"id:"+rs.getInt("id")
				+"\tname:"+rs.getString("name")
				+"\tusername"+rs.getString("username")
				+"\tpassword"+rs.getString("password")
				+"\taddress"+rs.getString("address")
				+"\tphone"+rs.getString("phone")
				);
			}
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

package com.iberrylogin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VerifyLogin {
	String name = null;
	String pass = null;
	int flag=0;
	
	
	public static int validate(String name, String pass,int flag) {
		// This program validates the user id and password

		String query1 = "select * from userlogin";
		 String query2="insert into userlogin values(?,?)";
		
		int status = 0;
		
		System.out.println(name);
		System.out.println(pass);
		System.out.println("form data");
		try {

			 System.out.println("entered try");
			 Class.forName("com.mysql.jdbc.Driver");

			 System.out.println("1");
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashok_schema", "root",
					"loveall");
		

		
		if (flag==1){
			
			System.out.println("select query");
			PreparedStatement ps=conn.prepareStatement(query1);  

			System.out.println(query1);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				/*System.out.println(rs.getInt(1));*/
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));

				if ((name.equals(rs.getString(1)))) {

					if (pass.equals(rs.getString(2))) {

					status = 1;
					break;
					} else {

					status = 2;
					break;
					}
				}
		
			}
		}if(flag==2){
			
			System.out.println("insert query");
			PreparedStatement pst=conn.prepareStatement(query2);
			/*pst.setInt(1,1030);*/
			pst.setString(1, name);
			pst.setString(2, pass);
			pst.executeUpdate();
			
		}
		
		}
	
		catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
		}
	}
	


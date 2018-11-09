package com.ektha.multithreading.dao;



import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection implements Provider {
	public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}catch(Exception ex){System.out.println(ex);}
		return con;
	}
}

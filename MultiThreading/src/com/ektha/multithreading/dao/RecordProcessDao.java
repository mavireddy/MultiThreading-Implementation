package com.ektha.multithreading.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ektha.multithreading.controller.Record;

public class RecordProcessDao {

	public static void insertData(Record record) throws SQLException

	{
		Connection con = null;
		try {

			 con = DbConnection.getCon();

			String query = "Insert into userdata values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, record.getId());
			ps.setString(2, record.getFirstname());
			ps.setString(3, record.getLastname());
			ps.setInt(4, record.getAge());
			ps.setString(5, record.getEmail());
			ps.setLong(6, record.getPhone_num());

			int status = ps.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			
		}
	}


}

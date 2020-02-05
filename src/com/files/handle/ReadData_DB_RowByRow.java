package com.files.handle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData_DB_RowByRow{

	public static void main(String[] args) throws SQLException {
		
		// Database URL.
				// "test" Is database name. You can change It as per your database name.
				String sqldb_url = "jdbc:mysql://localhost:3307/company";
				String sqldb_uname = "root";
				String sqldb_pass = "admin";


		
		
		
		Connection connect= DriverManager.getConnection(sqldb_url, sqldb_uname,sqldb_pass);
		
		Statement st = connect.createStatement();
		ResultSet rs = st.executeQuery("SELECT *from emp;");
		ResultSetMetaData rsm = rs.getMetaData();
		
		int cc = rsm.getColumnCount();
		System.out.println(rsm.getColumnLabel(1));
		
		while(rs.next()) {
			
			for (int c = 1; c <=cc; c++) {
				System.out.println(rs.getString(c));
				
			}
			
		}
		
		connect.close();

	}

}

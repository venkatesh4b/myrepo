package com.files.handle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteData_DB {

	public static void main(String[] args) throws SQLException {
	
		String sqldb_Url="jdbc:mysql://localhost:3307/company";
		String sqldb_uname= "root";
		String sqldb_pass=  "admin";
		
		Connection connect = DriverManager.getConnection(sqldb_Url, sqldb_uname, sqldb_pass);
		Statement st = connect.createStatement();
		
		st.execute("INSERT INTO emp(id,name,age,sal) VALUES(3,'SSS',29,45000);");
		connect.close();
		
		
		
		

	}

}

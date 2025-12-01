package com.tnsif.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// demo for JDBC program

public class JDBCProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1: lord and register driver
		
		Class.forName("org.postgresql.Driver");
		System.out.println("driver loaded succefully");
		
		// Step2: Establishing connection
		
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/vkit","postgres","varshitha");
		System.out.println("connection succefully");
		
		//Step 3 : create statement
		
		Statement st=conn.createStatement();
		
		// step 4: prepare the query
		
		String query="select * from student";
		
		// step 5: reading the data
		
		ResultSet rs=st.executeQuery(query);
		
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
}
		
		// close the statement
		st.close();
		conn.close();
		
		
		
	}

}
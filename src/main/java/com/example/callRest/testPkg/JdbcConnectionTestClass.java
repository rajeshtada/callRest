package com.example.callRest.testPkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class JdbcConnectionTestClass {
	
	
	String GETEPAY_DB_HOST = "jdbc:mysql://localhost:3306/pi_getepay_db?useSSL=false";
	String GETEPAY_DB_USER = "root";
	String GETEPAY_DB_PASSWORD = "Root@1234";
	Connection connection;
	
	public static void main(String[] args) {
		try {
			JdbcConnectionTestClass testClass = new JdbcConnectionTestClass();
		testClass.getIntermedeiateTransactionById();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection () throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(GETEPAY_DB_HOST, GETEPAY_DB_USER, GETEPAY_DB_PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public List<String> getIntermedeiateTransactionById()	throws Exception {
		
		Connection con = getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<String> listString = new ArrayList<>();

		String query = "";
		try {
			query = "select * from vpa_qr_code";
			System.out.println("time : " + new Date() + " Query => " + query);

			stmt = con.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			stmt.setFetchSize(Integer.MIN_VALUE);

			rs = stmt.executeQuery();

			int i = 0;
			while (rs.next()) {
				String string = rs.getString(1);
				System.out.println(string);
				listString.add(string);
				i++;
			}
			System.out.println("No of Records returned from intermediate_transaction : " + i);
		}

		finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}
		return listString;

	}
	
	

}

package com.example.callRest.testPkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class JDBCconnection {

	String GETEPAY_DB_HOST = "jdbc:mysql://localhost:3306/getepaydb?useSSL=false";
	String GETEPAY_DB_USER = "root";
	String GETEPAY_DB_PASSWORD = "Root@1234";
	Connection connection;

	static { // would have to be surrounded by try catch
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public final Connection getGetepayConnection() throws Exception {
		if (this.connection == null || this.connection.isClosed()) {
			// Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(GETEPAY_DB_HOST, GETEPAY_DB_USER, GETEPAY_DB_PASSWORD);
		}
		return this.connection;
	}
	
	public final PreparedStatement getStatement(Connection con, String query) throws Exception {
		PreparedStatement stmt = con.prepareStatement(query);
		return stmt;
	}
	
	
	public Map<Long, String> searchMidFromVPa2(String mids) throws Exception {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Connection con = getGetepayConnection();
		Map<Long, String> midVpaMap = new HashMap<>();
		try {
			String query = "select vpa,mid from upi_qr_detail where mid in (#mid)";
			query = query.replace("#mid", mids);
			stmt = getStatement(con, query);
			rs = stmt.executeQuery();
			while (rs.next()) {
				midVpaMap.put(rs.getLong("mid"), rs.getString("vpa"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}
		return midVpaMap;
	}
	
	public static void main(String[] args) throws Exception {
		JDBCconnection jDBCconnection = new JDBCconnection();
		Map<Long,String> searchMidFromVPa2 = jDBCconnection.searchMidFromVPa2("362525");
		
		System.out.println(searchMidFromVPa2);
		
	}
	
}

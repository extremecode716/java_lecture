package com.mydomain.p2021_03._08;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementTest {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = null;
		CallableStatement cs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "716");

			sql = "{call del_all()}";

			// CallableStatement를 객체를 생성
			cs = con.prepareCall(sql);
			cs.execute();
			
			cs.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

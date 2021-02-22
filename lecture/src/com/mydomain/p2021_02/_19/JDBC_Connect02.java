package com.mydomain.p2021_02._19;

import java.sql.*;

public class JDBC_Connect02 {

	public static void main(String[] args) {

		/** ORACLE JDBC Driver Test *****************************************/
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
										//ip    //포트번호//sid(전역데이터명)
		/*******************************************************************/

		/** My-SQL JDBC Driver *********************************************/
		//	String driver ="com.mysql.jdbc.Driver";
		//	String url = "jdbc:mysql://localhost/academy";
		/*******************************************************************/

		Connection con = null;

		try {

			Class.forName(driver); // JDBC Driver Loading

			// 1. jdbc 방식 - 잘 안씀.
			/** ORACLE에서 Connection 객체 ***********************************/
			con = DriverManager.getConnection(url, "scott", "716"); //비밀번호 노출
			/*******************************************************************/

			/** My-SQL에서 Connection 객체 ***********************************/
			//	con = DriverManager.getConnection(url, "totoro", "1234" );
			/*******************************************************************/

			System.out.println("데이터베이스 연결 성공~!!");

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패~!!");
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

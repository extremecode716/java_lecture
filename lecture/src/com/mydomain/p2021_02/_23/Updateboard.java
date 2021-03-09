package com.mydomain.p2021_02._23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updateboard {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try (Connection con = DriverManager.getConnection(url, "scott", "716");
				PreparedStatement pstmt = con.prepareStatement(
						"update board set writer=?, passwd=?, subject=?, content=?, reg_date=sysdate where no = ?");) {
			Class.forName(driver);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("수정할 글번호를 입력 하세요.");
			String no = br.readLine();
			int ino = Integer.parseInt(no);
			System.out.println("작성자를 입력 하세요?");
			String writer = br.readLine();
			System.out.println("비밀번호를 입력 하세요?");
			String passwd = br.readLine();
			System.out.println("제목을 입력 하세요?");
			String subject = br.readLine();
			System.out.println("내용을 입력 하세요?");
			String content = br.readLine();

			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setInt(5, ino);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("글수정 성공");
			} else {
				System.out.println("글수정 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

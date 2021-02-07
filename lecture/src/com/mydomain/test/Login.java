package com.mydomain.test;

import java.util.Scanner;

//작성자 : ExtremeCode
public class Login {
	public static void main(String[] args) {
		// 서버 검증
		// 								ID			  PW
		final String[] arrUserData = { "ExtremeCode", "123123" }; // DB 저장 정보로 가정(ID중복x), PW는 해시값
		// 자바에서 내부 데이터 상수화 일반적인 방법이 안됨. final String[] final arrUserData = 

		final int MAX_SIZE = 25;
		String strInputId = null;
		String strInputPw = null;
		@SuppressWarnings("unused")
		boolean bLogin = false;

		Scanner sc = new Scanner(System.in);

		do {
			bLogin = false;
			strInputId = null;
			strInputPw = null;
			
			// 클라 가정
			System.out.println("------로그인 창------");
			System.out.print("ID: ");
			strInputId = sc.nextLine();	// +정규식 검사
			if (strInputId.length() > MAX_SIZE) {
				System.out.println("ID Length Over");	
				continue;
			}
			System.out.print("PW: ");
			strInputPw = sc.nextLine();	// +정규식 검사
			if (strInputPw.length() > MAX_SIZE) {
				System.out.println("PW Length Over");
				continue;
			}

			// 서버 가정
			// 클라: 로그인 버튼 클릭 event 발생
			// id를 DB에서 find 했다고 가정 (중복x) 		// pw 해시값과 equals
			if (!arrUserData[0].equals(strInputId) || !arrUserData[1].equals(strInputPw)) {
				System.out.println("login false");
				continue;
			}
			
			System.out.println("-------------------");
			
			// 대입 break // 클라에 정보를 넘긴다.
			if (bLogin = true)
				break;
			
		} while (true);

		// 클라
		System.out.printf("%s 님이 로그인 하셨습니다.", arrUserData[0]);

		sc.close();
	}

}

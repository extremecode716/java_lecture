package com.yrdomain.test;

import java.util.Arrays;
import java.util.Scanner;

//작성자 : 김동일
public class FindId {
	public static void main(String[] args) {
		// 서버 검증
		// Email 주소로 ID 찾기
		//							ID				Email				name
		final String[] arrStrUser = { "ExtremeCode", "code@gmail.com", "김동일" }; // DB 저장 정보 (중복x) //자바 내부 데이터도 final 할 것.
		final int MAX_SIZE = 50;

		String strInputEmail = null;
		String strInputName = null;
		@SuppressWarnings("unused")
		boolean bFindId = false;

		Scanner sc = new Scanner(System.in);

		do {
			
			bFindId = false;
			strInputEmail = null;
			strInputName = null;

			// 클라 가정
			System.out.println("아이디를 찾으시려면 email 과 name 을 입력하시오.");
			System.out.print("email: ");
			strInputEmail = sc.nextLine();	//  +정규식 검사 할 것
			if (strInputEmail.length() > MAX_SIZE) {
				System.out.println("Email Length Over");	
				continue;
			}
			System.out.print("name: ");
			strInputName = sc.nextLine();	//  +정규식 검사 할 것
			if (strInputName.length() > MAX_SIZE) {
				System.out.println("Name Length Over");	
				continue;
			}
			
			// 서버 가정 //////////////////////////////////////
			// DB Email Find 했다고 가정
			if (strInputEmail.equals(arrStrUser[1]) && strInputName.equals(arrStrUser[2])) {
				bFindId = true;
				break;
			}
			////////////////////////////////////////////////
			
			System.out.println("email에 맞는 아이디가 없습니다.");
			System.out.println("------------------------------");
			
		} while (true);

		// 클라 가정. find true
		System.out.println("------------------------------");
		System.out.println("아이디 찾기 성공");
		//아스테릭 id 
		char[] arrAsteriskId = new char[arrStrUser[0].length()+1];
		arrStrUser[0].getChars(0, arrStrUser[0].length()/2, arrAsteriskId, 0);
		Arrays.fill(arrAsteriskId, arrStrUser[0].length()/2, arrStrUser[0].length(), '*');
		arrAsteriskId[arrStrUser[0].length()] = '\0';
		//
		System.out.println("ID: " + String.valueOf(arrAsteriskId));

		sc.close();
	}

}

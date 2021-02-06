package com.yrdomain.test;

import java.util.Scanner;

//작성자 : ExtremeCode
public class LoginFunction {

	static final int MAX_SIZE = 25;
	
	private static boolean isLogin(final String[] _arrUserData, final String[] _arrStrInputData) {
		// 서버 가정
		// 클라: 로그인 버튼 클릭 event 발생
		// id를 DB에서 find 했다고 가정 (중복x) // pw 해시값과 equals
		if (!_arrUserData[0].equals(_arrStrInputData[0]) || !_arrUserData[1].equals(_arrStrInputData[1])) {
			System.out.println("login false");
			return false;
		}
		
		return true;
	}

	private static boolean isInputData(final String[] _arrStrInputData, Scanner _sc) {
		// 클라 가정
		System.out.println("------로그인 창------");
		System.out.print("ID: ");
		_arrStrInputData[0] = _sc.nextLine(); // +정규식 검사
		if (_arrStrInputData[0].length() > MAX_SIZE) {
			System.out.println("ID Length Over");
			return false;
		}
		
		System.out.print("PW: ");
		_arrStrInputData[1] = _sc.nextLine(); // +정규식 검사
		if (_arrStrInputData[1].length() > MAX_SIZE) {
			System.out.println("PW Length Over");
			return false;
		}
		
		return true;
	}
	
	private static void printLoginId(final String[] _arrUserData) {
		// 클라
		System.out.printf("%s 님이 로그인 하셨습니다.", _arrUserData[0]);

	}
	
	public static void main(String[] args) {
		// 서버 검증
		// ID PW
		final String[] arrUserData = { "ExtremeCode", "123123" }; // DB 저장 정보로 가정(ID중복x), PW는 해시값
		// 자바에서 내부 데이터 상수화 일반적인 방법이 안됨. final String[] final arrUserData; (x)

		// String 참조형으로 쓰기 위해 배열로 받음
		//String strInputId = null;
		//String strInputPw = null;
		final String[] arrStrInputData = new String[2];
		@SuppressWarnings("unused")
		boolean bLogin = false;

		Scanner sc = new Scanner(System.in);

		do {
			bLogin = false;
			//strInputId = null;
			//strInputPw = null;
			arrStrInputData[0] = null;
			arrStrInputData[1] = null;

			if(!isInputData(arrStrInputData, sc))
				continue;
			
			if(!isLogin(arrUserData, arrStrInputData))
				continue;
			
			System.out.println("-------------------");

			// 대입 break // 클라에 정보를 넘긴다.
			if (bLogin = true)
				break;

		} while (true);

		printLoginId(arrUserData);
		
		sc.close();
	}

}

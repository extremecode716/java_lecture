package com.yrdomain.test;

import java.util.Arrays;
import java.util.Scanner;

//작성자 : 김동일
public class FindIdFunction {

	static final int MAX_SIZE = 50;

	private static boolean isInputData(final String[] _arrStrInputData, Scanner _sc) {
		// 클라 가정
		System.out.println("아이디를 찾으시려면 email 과 name 을 입력하시오.");
		System.out.print("email: ");
		_arrStrInputData[0] = _sc.nextLine(); // +정규식 검사 할 것
		if (_arrStrInputData[0].length() > MAX_SIZE) {
			System.out.println("Email Length Over");
			return false;
		}

		System.out.print("name: ");
		_arrStrInputData[1] = _sc.nextLine(); // +정규식 검사 할 것
		if (_arrStrInputData[1].length() > MAX_SIZE) {
			System.out.println("Name Length Over");
			return false;
		}

		return true;
	}

	private static boolean isFindId(final String[] _arrUserData, final String[] _arrStrInputData) {
		// 서버 가정
		// DB Find 해서 비교
		if (_arrStrInputData[0].equals(_arrUserData[1]) && _arrStrInputData[1].equals(_arrUserData[2])) {
			return true;
		}

		return false;
	}

	private static void printAsteriskId(final String[] _arrUserData, final char[] _arrAsteriskId) {
		// 클라
		System.out.println("------------------------------");
		System.out.println("아이디 찾기 성공");

		////////// 아스테릭 id ////////////
		// final char[] _arrAsteriskId = new char[arrStrUser[0].length() + 1];
		_arrUserData[0].getChars(0, _arrUserData[0].length() / 3, _arrAsteriskId, 0);
		Arrays.fill(_arrAsteriskId, _arrUserData[0].length() / 3, _arrUserData[0].length() / 3 * 2, '*');
		_arrUserData[0].getChars(_arrUserData[0].length() / 3 * 2, _arrUserData[0].length(), _arrAsteriskId,
				_arrUserData[0].length() / 3 * 2);
		_arrAsteriskId[_arrUserData[0].length()] = '\0';
		/////////////////////////////////

		System.out.println("ID: " + String.valueOf(_arrAsteriskId));
	}

	public static void main(String[] args) {
		// 서버 검증
		// Email 주소로 ID 찾기
		// ID Email name
		final String[] arrStrUser = { "ExtremeCode", "code@gmail.com", "김동일" }; // DB 저장 정보 (중복x)
		// 자바 내부 데이터도 final 해줄 것

		// String 참조형으로 쓰기 위해 배열로 받음
		// String strInputEmail = null;
		// String strInputName = null;
		final String[] arrStrInputData = new String[2];
		@SuppressWarnings("unused")
		boolean bFindId = false;

		Scanner sc = new Scanner(System.in);

		do {
			bFindId = false;
			// strInputEmail = null;
			// strInputName = null;
			arrStrInputData[0] = null;
			arrStrInputData[1] = null;

			if (!isInputData(arrStrInputData, sc))
				continue;

			if (isFindId(arrStrUser, arrStrInputData)) {
				bFindId = true;
				break;
			}

			System.out.println("email에 맞는 아이디가 없습니다.");
			System.out.println("------------------------------");
		} while (true);

		// 아스테릭 id
		final char[] arrAsteriskId = new char[arrStrUser[0].length() + 1];
		printAsteriskId(arrStrUser, arrAsteriskId);

		sc.close();
	}

}

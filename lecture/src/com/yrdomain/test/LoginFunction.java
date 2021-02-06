package com.yrdomain.test;

import java.util.Scanner;

//�ۼ��� : ExtremeCode
public class LoginFunction {

	static final int MAX_SIZE = 25;
	
	private static boolean isLogin(final String[] _arrUserData, final String[] _arrStrInputData) {
		// ���� ����
		// Ŭ��: �α��� ��ư Ŭ�� event �߻�
		// id�� DB���� find �ߴٰ� ���� (�ߺ�x) // pw �ؽð��� equals
		if (!_arrUserData[0].equals(_arrStrInputData[0]) || !_arrUserData[1].equals(_arrStrInputData[1])) {
			System.out.println("login false");
			return false;
		}
		
		return true;
	}

	private static boolean isInputData(final String[] _arrStrInputData, Scanner _sc) {
		// Ŭ�� ����
		System.out.println("------�α��� â------");
		System.out.print("ID: ");
		_arrStrInputData[0] = _sc.nextLine(); // +���Խ� �˻�
		if (_arrStrInputData[0].length() > MAX_SIZE) {
			System.out.println("ID Length Over");
			return false;
		}
		
		System.out.print("PW: ");
		_arrStrInputData[1] = _sc.nextLine(); // +���Խ� �˻�
		if (_arrStrInputData[1].length() > MAX_SIZE) {
			System.out.println("PW Length Over");
			return false;
		}
		
		return true;
	}
	
	private static void printLoginId(final String[] _arrUserData) {
		// Ŭ��
		System.out.printf("%s ���� �α��� �ϼ̽��ϴ�.", _arrUserData[0]);

	}
	
	public static void main(String[] args) {
		// ���� ����
		// ID PW
		final String[] arrUserData = { "ExtremeCode", "123123" }; // DB ���� ������ ����(ID�ߺ�x), PW�� �ؽð�
		// �ڹٿ��� ���� ������ ���ȭ �Ϲ����� ����� �ȵ�. final String[] final arrUserData; (x)

		// String ���������� ���� ���� �迭�� ����
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

			// ���� break // Ŭ�� ������ �ѱ��.
			if (bLogin = true)
				break;

		} while (true);

		printLoginId(arrUserData);
		
		sc.close();
	}

}

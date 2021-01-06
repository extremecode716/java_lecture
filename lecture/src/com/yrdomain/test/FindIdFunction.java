package com.yrdomain.test;

import java.util.Arrays;
import java.util.Scanner;

//�ۼ��� : �赿��
public class FindIdFunction {

	static final int MAX_SIZE = 50;

	private static boolean isInputData(final String[] _arrStrInputData, Scanner _sc) {
		// Ŭ�� ����
		System.out.println("���̵� ã���÷��� email �� name �� �Է��Ͻÿ�.");
		System.out.print("email: ");
		_arrStrInputData[0] = _sc.nextLine(); // +���Խ� �˻� �� ��
		if (_arrStrInputData[0].length() > MAX_SIZE) {
			System.out.println("Email Length Over");
			return false;
		}

		System.out.print("name: ");
		_arrStrInputData[1] = _sc.nextLine(); // +���Խ� �˻� �� ��
		if (_arrStrInputData[1].length() > MAX_SIZE) {
			System.out.println("Name Length Over");
			return false;
		}

		return true;
	}

	private static boolean isFindId(final String[] _arrUserData, final String[] _arrStrInputData) {
		// ���� ����
		// DB Find �ؼ� ��
		if (_arrStrInputData[0].equals(_arrUserData[1]) && _arrStrInputData[1].equals(_arrUserData[2])) {
			return true;
		}

		return false;
	}

	private static void printAsteriskId(final String[] _arrUserData, final char[] _arrAsteriskId) {
		// Ŭ��
		System.out.println("------------------------------");
		System.out.println("���̵� ã�� ����");

		////////// �ƽ��׸� id ////////////
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
		// ���� ����
		// Email �ּҷ� ID ã��
		// ID Email name
		final String[] arrStrUser = { "ExtremeCode", "code@gmail.com", "�赿��" }; // DB ���� ���� (�ߺ�x)
		// �ڹ� ���� �����͵� final ���� ��

		// String ���������� ���� ���� �迭�� ����
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

			System.out.println("email�� �´� ���̵� �����ϴ�.");
			System.out.println("------------------------------");
		} while (true);

		// �ƽ��׸� id
		final char[] arrAsteriskId = new char[arrStrUser[0].length() + 1];
		printAsteriskId(arrStrUser, arrAsteriskId);

		sc.close();
	}

}

package com.yrdomain.test;

import java.util.Scanner;

//�ۼ��� : ExtremeCode
public class Login {
	public static void main(String[] args) {
		// ���� ����
		// 								ID			  PW
		final String[] arrUserData = { "ExtremeCode", "123123" }; // DB ���� ������ ����(ID�ߺ�x), PW�� �ؽð�
		// �ڹٿ��� ���� ������ ���ȭ �Ϲ����� ����� �ȵ�. final String[] final arrUserData = 

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
			
			// Ŭ�� ����
			System.out.println("------�α��� â------");
			System.out.print("ID: ");
			strInputId = sc.nextLine();	// +���Խ� �˻�
			if (strInputId.length() > MAX_SIZE) {
				System.out.println("ID Length Over");	
				continue;
			}
			System.out.print("PW: ");
			strInputPw = sc.nextLine();	// +���Խ� �˻�
			if (strInputPw.length() > MAX_SIZE) {
				System.out.println("PW Length Over");
				continue;
			}

			// ���� ����
			// Ŭ��: �α��� ��ư Ŭ�� event �߻�
			// id�� DB���� find �ߴٰ� ���� (�ߺ�x) 		// pw �ؽð��� equals
			if (!arrUserData[0].equals(strInputId) || !arrUserData[1].equals(strInputPw)) {
				System.out.println("login false");
				continue;
			}
			
			System.out.println("-------------------");
			
			// ���� break // Ŭ�� ������ �ѱ��.
			if (bLogin = true)
				break;
			
		} while (true);

		// Ŭ��
		System.out.printf("%s ���� �α��� �ϼ̽��ϴ�.", arrUserData[0]);

		sc.close();
	}

}

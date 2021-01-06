package com.yrdomain.test;

import java.util.Arrays;
import java.util.Scanner;

//�ۼ��� : �赿��
public class FindId {
	public static void main(String[] args) {
		// ���� ����
		// Email �ּҷ� ID ã��
		//							ID				Email				name
		final String[] arrStrUser = { "ExtremeCode", "code@gmail.com", "�赿��" }; // DB ���� ���� (�ߺ�x) //�ڹ� ���� �����͵� final �� ��.
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

			// Ŭ�� ����
			System.out.println("���̵� ã���÷��� email �� name �� �Է��Ͻÿ�.");
			System.out.print("email: ");
			strInputEmail = sc.nextLine();	//  +���Խ� �˻� �� ��
			if (strInputEmail.length() > MAX_SIZE) {
				System.out.println("Email Length Over");	
				continue;
			}
			System.out.print("name: ");
			strInputName = sc.nextLine();	//  +���Խ� �˻� �� ��
			if (strInputName.length() > MAX_SIZE) {
				System.out.println("Name Length Over");	
				continue;
			}
			
			// ���� ���� //////////////////////////////////////
			// DB Email Find �ߴٰ� ����
			if (strInputEmail.equals(arrStrUser[1]) && strInputName.equals(arrStrUser[2])) {
				bFindId = true;
				break;
			}
			////////////////////////////////////////////////
			
			System.out.println("email�� �´� ���̵� �����ϴ�.");
			System.out.println("------------------------------");
			
		} while (true);

		// Ŭ�� ����. find true
		System.out.println("------------------------------");
		System.out.println("���̵� ã�� ����");
		//�ƽ��׸� id 
		char[] arrAsteriskId = new char[arrStrUser[0].length()+1];
		arrStrUser[0].getChars(0, arrStrUser[0].length()/2, arrAsteriskId, 0);
		Arrays.fill(arrAsteriskId, arrStrUser[0].length()/2, arrStrUser[0].length(), '*');
		arrAsteriskId[arrStrUser[0].length()] = '\0';
		//
		System.out.println("ID: " + String.valueOf(arrAsteriskId));

		sc.close();
	}

}

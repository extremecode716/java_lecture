package com.yrdomain.ch02;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
		// float : ��ȣ(1bit) + ����(8bit) + ����(23bit)
		float num3 = num2;
		System.out.println(num3); //1.23456784E8 // float�� �뷫 6~7�ڸ����� ���е��� ����.
		num2 = (int)num3;

		int result = num1 - num2;
		System.out.println(result);
	}
	

}

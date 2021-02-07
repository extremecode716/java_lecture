package com.yrdomain.ch02;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
		// float : 부호(1bit) + 지수(8bit) + 가수(23bit)
		float num3 = num2;
		System.out.println(num3); //1.23456784E8 // float은 대략 6~7자리까지 정밀도를 가짐.
		num2 = (int)num3;

		int result = num1 - num2;
		System.out.println(result);
	}
	

}

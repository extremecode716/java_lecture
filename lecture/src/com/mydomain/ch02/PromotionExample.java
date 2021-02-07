package com.mydomain.ch02;

public class PromotionExample {
	public static void main(String[] args) {
		/*
		 byte byteValue = 65;
		 char charValue = byteValue; // 컴파일 에러 
		 // 암시적(자동) 타입 변환이 안되는 이유
		 // char는 유니코드 2byte로 음수를 저장할 수 없으나, byte는 음수를 저장될 수 있기 때문에 자동 변환x
		 char charData = (char) byteData; // (0) 명시적 타입 변환
		 */
		
		byte byteValue = 10;
		int intValue = byteValue;	//int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;		//int <- char
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;	//long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	//double <- int
		System.out.println(doubleValue);
	}
}

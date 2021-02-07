package com.mydomain.ch03;

public class InputDataCheckNaNExample1And2 {

	public static void main(String[] args) {
		//1
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
		
		//2
		// 문자열 정수,실수 타입 변환시 NaN체크 할 것.
		String userInput2 = "NaN";
		double val2 = Double.valueOf(userInput2);
		
		double currentBalance2 = 10000.0;
		
		// NaN을 검사.
		if(Double.isNaN(val2)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val2 = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance2);
		
	}

}

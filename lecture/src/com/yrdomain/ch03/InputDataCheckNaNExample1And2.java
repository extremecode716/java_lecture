package com.yrdomain.ch03;

public class InputDataCheckNaNExample1And2 {

	public static void main(String[] args) {
		//1
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
		
		//2
		// ���ڿ� ����,�Ǽ� Ÿ�� ��ȯ�� NaNüũ �� ��.
		String userInput2 = "NaN";
		double val2 = Double.valueOf(userInput2);
		
		double currentBalance2 = 10000.0;
		
		// NaN�� �˻�.
		if(Double.isNaN(val2)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val2 = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance2);
		
	}

}

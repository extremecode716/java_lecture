package com.yrdomain.ch10;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); // NumberFormatException ¹ß»ý
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);

	}

}

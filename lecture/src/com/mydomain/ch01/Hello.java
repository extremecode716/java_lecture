package com.mydomain.ch01;



public class Hello {

	public static int add(int _num1, int _num2) {
		return _num1 + _num2;
	}
	
	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 30;
              
		System.out.println(add(iNum1, iNum2));
		System.out.println("Hello, welcome to the java world!");
	}
}

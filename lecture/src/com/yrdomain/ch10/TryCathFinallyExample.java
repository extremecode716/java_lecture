package com.yrdomain.ch10;

public class TryCathFinallyExample {

	public static void main(String[] args) /* throws ClassNotFoundException */ {
		// TODO Auto-generated method stub
//		Class clazz = Class.forName("com.yrdomain.ch10.ClassCastExceptionExample");
		try {
			@SuppressWarnings("rawtypes")
			Class clazz = Class.forName("com.yrdomain.ch10.ClassCastExceptionExample");
			
			System.out.println(clazz.toString());
		}
		catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}

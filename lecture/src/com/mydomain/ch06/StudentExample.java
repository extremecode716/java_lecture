package com.mydomain.ch06;

public class StudentExample {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		@SuppressWarnings("unused")
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}

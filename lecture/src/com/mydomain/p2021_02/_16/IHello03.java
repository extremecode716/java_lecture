package com.mydomain.p2021_02._16;

public interface IHello03 {
	
	public static final int iValue = 5;
	
	void sayHello(String name);	// 추상메소드 (public abstract 생략)
	
	default void say() {
		System.out.println("안녕3");
	}
	
	public static void staticsay() {
		System.out.println("say3");
	}
}

package com.mydomain.p2021_02._16;

interface IHello01 {
	void sayHello(String name);	// 추상메소드 (public abstract 생략)
	
	default void say() {
		System.out.println("안녕");
	}
}

class Hello01 implements IHello01 {

	@Override
	public void sayHello(String name) {		// 메소드 오버라이딩
		// TODO Auto-generated method stub	
		System.out.println(name + "씨 안녕하세요!");
	}
}

class InterfaceTest01 {
	public static void main(String[] args) {
		//인터페이스는 자체적으로 객체 생성을 할 수 없다.
//		IHello01 ih = new IHello01();		
		
		Hello01 obj = new Hello01();
		obj.say();
		obj.sayHello("홍길동");
		obj.sayHello("이순신");
		
		Hello02 obj1 = new Hello02();
		//System.out.println(Hello02.iValue); //다중상속 문제

		obj.say();
		obj.sayHello("홍길동");
		obj.sayHello("이순신");
	}
}




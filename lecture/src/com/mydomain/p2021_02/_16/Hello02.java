package com.mydomain.p2021_02._16;

public class Hello02 implements IHello02, IHello03 {

	@Override
	public void sayHello(String name) { // 메소드 오버라이딩
		// TODO Auto-generated method stub
		System.out.println(name + "씨 안녕하세요!");
	}

	// 인터페이스 default 메소드가 중복 되기 때문에 override를 하여 무엇을 호출할지 명시해야함.
	@Override
	public void say() {
		IHello02.super.say();
	}
}
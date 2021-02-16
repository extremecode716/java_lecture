package com.mydomain.p2021_02._16;

interface IHello1 {
	public abstract void sayHello(String name);
}

interface IGoodBye1 {
	public abstract void sayGoodBye(String name);
}

//두 인터페이스로부터 상속을 받는 클래스 설계
class SubClass1 implements IHello1, IGoodBye1 {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class InterfaceTest02 {
	public static void main(String[] args) {
		SubClass1 test = new SubClass1();
		test.sayHello(args[0]);
		test.sayGoodBye(args[0]);
	}
}
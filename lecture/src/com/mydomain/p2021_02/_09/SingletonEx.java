package com.mydomain.p2021_02._09;
// p244

class Singleton{
	
	// 싱글톤(Singleton) : 객체 생성을 1번만 수행
	private static Singleton s = new Singleton();
	
	public static Singleton getInstance() { //정적 메소드
		return s;
	}
	
	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}	
	
//	private Singleton() {};
}

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(Integer.toHexString(obj1.hashCode()));
		System.out.println(obj2);
		if(obj1 == obj2) {	// 주소값 비교
			System.out.println("같은 Singleton객체 입니다.");
		}else {
			System.out.println("다른 Singleton객체 입니다.");
		}
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
	}

}

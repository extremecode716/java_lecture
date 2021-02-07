package com.mydomain.ch06;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성
		// Car myCar = new Car(); // 기본 생성자가 없어짐. 명시적 생성자를 선언했기 때문에
		Car myCar = new Car("검정", 3000);

		// 필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);

		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		System.out.println();

		/////////////////////////////////////////////////
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);

	}
}

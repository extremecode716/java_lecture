package com.yrdomain.ch06;

public class Car1Example {

	public static void main(String[] args) {
		Car1 myCar1 = new Car1();

		myCar1.setGas(5); // Car1의 setGas() 메소드 호출

		boolean gasState = myCar1.isLefGas(); // Car의 isLeftGas() 메소드 호출.
		if (gasState) {
			System.out.println("출발합니다.");
			myCar1.run(); // Car의 run() 메소드 호출
		}

		if (myCar1.isLefGas()) { // Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입해세요.");
		}
	}

}

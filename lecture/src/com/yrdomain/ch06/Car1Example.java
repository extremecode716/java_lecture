package com.yrdomain.ch06;

public class Car1Example {

	public static void main(String[] args) {
		Car1 myCar1 = new Car1();

		myCar1.setGas(5); // Car1�� setGas() �޼ҵ� ȣ��

		boolean gasState = myCar1.isLefGas(); // Car�� isLeftGas() �޼ҵ� ȣ��.
		if (gasState) {
			System.out.println("����մϴ�.");
			myCar1.run(); // Car�� run() �޼ҵ� ȣ��
		}

		if (myCar1.isLefGas()) { // Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ؼ���.");
		}
	}

}

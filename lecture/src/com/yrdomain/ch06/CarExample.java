package com.yrdomain.ch06;

public class CarExample {

	public static void main(String[] args) {
		// ��ü ����
		// Car myCar = new Car(); // �⺻ �����ڰ� ������. ����� �����ڸ� �����߱� ������
		Car myCar = new Car("����", 3000);

		// �ʵ尪 �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);

		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
		System.out.println();

		/////////////////////////////////////////////////
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		Car car2 = new Car("�ڰ���");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		Car car3 = new Car("�ڰ���", "����");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		Car car4 = new Car("�ý�", "����", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);

	}
}

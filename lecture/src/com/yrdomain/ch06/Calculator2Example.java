package com.yrdomain.ch06;

public class Calculator2Example {
	public static void main(String[] args) {
		Calculator2 myCalcu = new Calculator2();

		// ���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);

		// ���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20);

		// ��� ���
		System.out.println("���簢�� ����=" + result1);
		System.out.println("���簢�� ����=" + result2);
	}

}

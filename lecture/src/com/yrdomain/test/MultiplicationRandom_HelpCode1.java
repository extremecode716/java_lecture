package com.yrdomain.test;

//�ڵ� �ּ� ���� �� ���������� : ExtremeCode
public class MultiplicationRandom_HelpCode1 {

	public static void main(String[] args) {
		MultiplicationRandom_HelpCode1 test = new MultiplicationRandom_HelpCode1(); // MultiplicationRandom_HelpCode1��ü�� �����ؼ� test ������ ���������� �ִ´�.
		int num1 = (int) (Math.random() * 8 + 2); // num1 �� 2 <= num1 < 10 ������ ������ ���� ������.
		int num2 = (int) (Math.random() * 8 + 2); // num2 �� 2 <= num2 < 10 ������ ������ ���� ������.

		while (num1 == num2) { // �ݺ����� ���ǽ� num1 == num2�� ������ ���η����� ����ȴ�. // ���� ���� �ܼ��� ����ϴ� ���� ���� ���� �Ͻ� ��.
			num1 = (int) (Math.random() * 8 + 2); // num1 �� 2 <= num1 < 10 ������ ������ ���� ������.
													// num1 �� ��������� while�� �������ü��ִ�.
		} // while�� ��
		test.sys(num1, num2); // test�� sys�޼ҵ带 ȣ���Ѵ�.
	}// main�޼��� ��

	public void sys(int num1, int num2) {
		System.out.println("---- " + num1 + "�� ----"); // ��¹� num1 ��

		for (int i = 1; i <= 9; i++) { // i�� 1���� �����ؼ� ���ǽ� i<=9 �˻��ϰ� true�̸� ���� ���� ���� false �̸� �ݺ��� Ż��
			System.out.println(num1 + " x " + i + " = " + num1 * i); // ��� num1 x i = num1 * i;
		} // i�� ���� 1���� ��Ű��, i <= 9; ���ǽ��� true�̸� �ٽ� ���η��� ���� false �̸� �ݺ��� Ż��

		System.out.println("---- " + num2 + "�� ----"); // ���� ���� �������� num2 ��
		for (int i = 1; i <= 9; i++) {
			System.out.println(num2 + " x " + i + " = " + num2 * i);
		}
	}
}
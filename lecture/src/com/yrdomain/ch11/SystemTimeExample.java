package com.yrdomain.ch11;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime(); // ���� �ð�
		
		int sum = 0;
		for(int i =1; i<=1000000; ++i) {
			sum += i;
		}
		
		long time2 = System.nanoTime(); // �� �ð�
		
		System.out.println("1~1000000������ ��: " + sum);
		System.out.println("��꿡 " + (time2-time1) + " �����ʰ� �ҿ�Ǿ����ϴ�.");
		System.out.println((time2-time1)/1000000000.0+"��");
	}

}

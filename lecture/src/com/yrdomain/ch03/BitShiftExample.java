package com.yrdomain.ch03;

public class BitShiftExample {

	public static void main(String[] args) {
		System.out.println("1 << 3 = " + (1<<3));
		System.out.println("-8 >> 3 = " + (-8>>3));
		System.out.println("-8 >>> 3 = "+ (-8>>>3));
		
		//����Ʈ ������
		/*
		 *a << b : ���� a�� �� ��Ʈ�� b��ŭ �������� �̵�(���ڸ��� 0���� ä������.)
		 *a >> b : ���� a�� �� ��Ʈ�� b��ŭ ���������� �̵�(���ڸ��� ���� a�� �ֻ��� ��ȣ ��Ʈ(MSB)�� ���� ������ ä������.
		 * MSB: most significant bit
		 *a >>> b : ���� a�� �� ��Ʈ�� b��ŭ ���������� �̵�(���ڸ��� 0���� ä������.)
		 */
	
		
	}

}

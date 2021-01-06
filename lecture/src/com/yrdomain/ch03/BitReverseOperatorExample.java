package com.yrdomain.ch03;

public class BitReverseOperatorExample {

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);

		/*
		//��ȿ���� 
		 * "0" + str; <- JVM�� �󸶳� ����ȭ ������ ��. �޸𸮸� ����� �˼������ٵ�...��Ŭ���� ���� �����ִ°� ����.
		 * 1�� �������� GC�� String�� ����, ��ü�� ���� �� ������ ����.
		 * JDK 1.5 �̻� �������� String += �� StringBuilder�� �����Ѵٰ���.
		while(str.length() < 32) {
			str = "0" + str;
		}
		*/
		
		//or StringBuilder+append 
		int iStrLength = str.length();
		if(iStrLength > 31)
			return str;
		
		char[] arrBinary32 = new char[32];
		for(int i = 0; i < 32 - iStrLength; ++i)
		{
			arrBinary32[i] = '0';
		}
		
		for(int i = 32 - iStrLength, j = 0; i < 32; ++i, ++j)
		{
			arrBinary32[i] = str.charAt(j);
		}
		
		return String.valueOf(arrBinary32);
	}
	
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println(toBinaryString(v1) + "(������: " + v1 + ")");
		System.out.println(toBinaryString(v2) + "(������: " + v2 + ")");
		System.out.println(toBinaryString(v3) + "(������: " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		
		System.out.println(toBinaryString(v4) + " (������: " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (������: " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (������: " + v6 + ")");
	}

}

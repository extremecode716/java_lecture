package com.yrdomain.ch03;

public class BitReverseOperatorExample {

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);

		/*
		//비효율적 
		 * "0" + str; <- JVM이 얼마나 최적화 해줄지 모름. 메모리를 열어보면 알수있을텐데...이클립스 지원 안해주는것 같다.
		 * 1번 돌때마다 GC에 String이 들어가고, 객체를 생성 할 것으로 예상.
		 * JDK 1.5 이상 버전부터 String += 은 StringBuilder로 동작한다고함.
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
		
		System.out.println(toBinaryString(v1) + "(십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + "(십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + "(십진수: " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");
	}

}

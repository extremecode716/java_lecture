package com.yrdomain.ch02;

public class GarbageValueExample {
	public static void main(String[] args) {

	
		byte var1_1 = 125;
		int var2_1 = 125;
		
		//최상위 비트 변경.
		for (int i = 0; i < 5; i++) {
			var1_1++;
			var2_1++;
			System.out.println("var1_1: " + var1_1 + "\t" + "var2_1: " + var2_1);
		}
	}
}

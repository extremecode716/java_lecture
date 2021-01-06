package com.yrdomain.ch03;

public class OverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		
		System.out.println(z);
		
		long longX = 1000000;
		long longY = 1000000;
		long longZ = longX * longY;
		System.out.println(longZ);
	}
}

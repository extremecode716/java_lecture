package com.yrdomain.ch03;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;

		double z = x / y;
		// double z = x % y;

		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));

		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가"); // Infinity
		} else {
			System.out.println(z + 2); // Infinity
		}
	}

}

package com.yrdomain.ch04;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 100; ++i) {
			sum += i;
		}

		System.out.println("1~100 гу : " + sum);

		int sum1 = 0;

		int i = 0;
		for (i = 1; i <= 100; ++i) {
			sum1 += i;
		}

		System.out.println("1~" + (i - 1) + " гу : " + sum1);

	}

}

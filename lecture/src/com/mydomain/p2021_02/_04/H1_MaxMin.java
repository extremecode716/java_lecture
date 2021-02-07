package com.mydomain.p2021_02._04;

import java.util.Scanner;

public class H1_MaxMin {
	static final int ARR_MAX_SIZE = 3;

	public static void main(String[] args) {
		int[] arrNum = new int[ARR_MAX_SIZE];
		int iMax = Integer.MIN_VALUE, iMin = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 3개를 입력 하세요?");
		for (int i = 0; i < ARR_MAX_SIZE; ++i) {
			arrNum[i] = sc.nextInt();
			iMax = (arrNum[i] > iMax) ? (arrNum[i]) : (iMax);
			iMin = (arrNum[i] < iMin) ? (arrNum[i]) : (iMin);
		}

		System.out.println("Max Number : " + iMax);
		System.out.println("Min Number : " + iMin);

		sc.close();
	}
}

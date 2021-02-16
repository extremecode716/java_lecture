package com.mydomain.p2021_02;
//과제.
//1.
//키보드로 3개의 정수를 입력 받았을때 최대값과
//최소값을 구하는 프로그램을 작성 하세요?
//(단, 조건 연산자를 활용해서 작성하세요)
//제출
//author: ExtremeCode
import java.util.Scanner;

public class H1_MinMax {
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

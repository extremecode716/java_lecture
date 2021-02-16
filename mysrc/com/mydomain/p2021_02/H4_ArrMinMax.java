package com.mydomain.p2021_02;

//과제.
//키보드를 이용해서 정수 5개를 입력 받은후 int형
//배열에 저장한다. 이때 배열에 저장된 값중에서
//최대값과 최소값을 구하는 프로그램을 작성하세요?
//제출.
//author: ExtremeCode
import java.util.Scanner;
import java.util.Arrays;

public class H4_ArrMinMax {
	static final int ARR_MAX_SIZE = 5;

	public static void main(String[] args) {
		int[] arrNum = new int[ARR_MAX_SIZE];
		Scanner sc = new Scanner(System.in);

		// 1.입력과 동시에 최솟값과 최댓값 구하는 방식.
		int iMax = Integer.MIN_VALUE, iMin = Integer.MAX_VALUE;
		System.out.println("정수 5개를 입력 하세요?");
		for (int i = 0; i < arrNum.length; ++i) {
			arrNum[i] = sc.nextInt(); //입력 받는 부분
			
			if (arrNum[i] > iMax) {
				iMax = arrNum[i];
			}
			if (arrNum[i] < iMin) {
				iMin = arrNum[i];
			}

		}
		System.out.println("Max Number : " + iMax);
		System.out.println("Min Number : " + iMin);
		//

		// 2. 값을 입력은 후 반복문을 다시 돌면서 최솟값과 최댓값 구하는 방식
		iMax = iMin = arrNum[0];
		for (int i = 1; i < arrNum.length; ++i) {
			if (arrNum[i] > iMax) {
				iMax = arrNum[i];
			} else if (arrNum[i] < iMin) {
				iMin = arrNum[i];
			}
		}
		System.out.println("Max Number : " + iMax);
		System.out.println("Min Number : " + iMin);
		//

		// 3. 정렬 후 최솟값과 최댓값 구하는 방식
		Arrays.sort(arrNum);
		iMin = arrNum[0];
		iMax = arrNum[arrNum.length - 1];
		System.out.println("Max Number : " + iMax);
		System.out.println("Min Number : " + iMin);
		//
		sc.close();
	}
}

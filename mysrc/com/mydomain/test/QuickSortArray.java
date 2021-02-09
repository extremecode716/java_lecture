package com.mydomain.test;

public class QuickSortArray {
	public static void main(String[] args) {
		Integer[] arrs = { 5, -5, 8, 30, 9 };
		QuickSort.sort(arrs);

		int iMin = arrs[0];
		int iMax = arrs[arrs.length - 1];

		System.out.println("Max Number : " + iMax);
		System.out.println("Min Number : " + iMin);

		int[] arr = new int[] { 66, 77, 44, 33, 11 };
		int i;
		System.out.println("정수5개를 입력하세요.");

		int max = arr[0];
		int min = arr[0];

		for (i = 1; i < arr.length; i++) {
			if (arr[i] > max) { // 최대값
				int temp = arr[i];
				arr[i] = max;
				max = temp;
			} else if (arr[i] < min) { // 최소값
				int temp = arr[i];
				arr[i] = min;
				min = temp;
			}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}

		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}

package com.yrdomain.test;

import java.util.Arrays;

//ÀÛ¼ºÀÚ : ExtremeCode
public class Lotto_HelpCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrNumbers = new int[45];
		for (int i = 0; i < 45; ++i) {
			arrNumbers[i] = i + 1;
		}

		for (int i = 0; i < 6; ++i) {
			int index = (int) (Math.random() * 45);
			int tmp = arrNumbers[i];
			arrNumbers[i] = arrNumbers[index];
			arrNumbers[index] = tmp;
		}

		int[] arrLottoNumbers = Arrays.copyOfRange(arrNumbers, 0, 6);
		Arrays.sort(arrLottoNumbers);
	
		for (int i = 0; i < 6; ++i) {
			System.out.print(arrLottoNumbers[i] + "\t");
		}
	}
}

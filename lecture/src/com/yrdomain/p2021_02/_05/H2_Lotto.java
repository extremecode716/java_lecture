package com.yrdomain.p2021_02._05;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class H2_Lotto {
	public static void main(String[] args) {
		List<Integer> listNumbers = new ArrayList<Integer>();
		for (int i = 1; i < 46; ++i) {
			listNumbers.add(i);
		}
		
		// shuffle internal logic keyword : for / random / swap
		Collections.shuffle(listNumbers);

		// 추첨
		List<Integer> listWinningNumber = listNumbers.subList(0, 6);
		Integer iBonusNumber = listNumbers.get(6);

		Collections.sort(listWinningNumber);

		System.out.println("\t[당첨 번호]\t+\t [보너스]");
		System.out.println(listWinningNumber + "\t/\t[" + iBonusNumber + "]");
	}
}

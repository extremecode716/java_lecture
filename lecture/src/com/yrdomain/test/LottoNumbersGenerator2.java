package com.yrdomain.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// �������� �ζ� ��÷�� ( ȿ�� �Ű� x )
public class LottoNumbersGenerator2 {

	public static void main(String[] args) {
		List<Integer> listNumbers = new ArrayList<Integer>();
		List<Integer> listWinningNumber = new ArrayList<Integer>();
		
		for (int i = 1; i < 46; ++i) {
			listNumbers.add(i);
		}

		Integer tmpNumber = 0;
		for (int i = 0; i < 6; ++i) {
			Collections.shuffle(listNumbers);
			tmpNumber = listNumbers.get(0);
			listWinningNumber.add(tmpNumber);
			listNumbers.remove(tmpNumber);
		}

		Collections.sort(listWinningNumber);

		System.out.println("\t[��÷ ��ȣ]\t+\t [���ʽ�]");
		
		Collections.shuffle(listNumbers);
		Integer iBonusNumber = listNumbers.get(0);
		listNumbers.remove(iBonusNumber);
		System.out.println(listWinningNumber + "\t/\t[" + iBonusNumber + "]");
	}
}

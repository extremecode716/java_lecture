package com.yrdomain.test;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

//�ۼ���: �赿��
public class LottoNumbersGenerator {
	public static void main(String[] args) {
		List<Integer> listNumbers = new ArrayList<Integer>();
		for (int i = 1; i < 46; ++i) {
			listNumbers.add(i);
		}
		
		// shuffle internal logic keyword : for / random / swap
		Collections.shuffle(listNumbers);

		// ��÷
		List<Integer> listWinningNumber = listNumbers.subList(0, 6);
		Integer iBonusNumber = listNumbers.get(6);

		Collections.sort(listWinningNumber);

		System.out.println("\t[��÷ ��ȣ]\t+\t [���ʽ�]");
		System.out.println(listWinningNumber + "\t/\t[" + iBonusNumber + "]");
	}
}

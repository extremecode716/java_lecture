package com.mydomain.p2021_02;
//과제
//2. 1~45사이의 숫자를 6개(배열이용,다중for문)
//   추출 하는 프로그램을 작성 하세요? 
//    (단, 중복된 숫자는 1번만 출력 되도록 한다.)
//    난수값끼리 비교 연산 break 문으로 빠져나오고 
//    빠져나오면서 
//    Math.random() 이용해서 프로그램을 작성 하세요.
//
//          0.0 <= Math.random() < 1.0

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class H3_Lotto {
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

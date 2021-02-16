package com.mydomain.p2021_02;
//과제.
//1. 키보드를 이용해서 입력한 정수의 팩토리얼을
//   구하는 프로그램을 작성 하세요?
//	ex) 3! = 3 * 2 * 1
//                  5! = 5 * 4 * 3 * 2 * 1
//	    32! 은 20억을 넘어감 
//	for문 또는 반복문으로 
//제출
//author: ExtremeCode
import java.math.BigInteger;
import java.util.Scanner;

public class H2_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger bigN = null;

		System.out.println("N 팩토리얼 계산 -> 음수가 아닌 N을 입력하시오.");
		String strInputN = sc.nextLine();
		if (!isNumber(strInputN)) {
			System.out.println("error 정수 값을 입력하세요!");
		} else {
			// or bigN = sc.nextBigInteger();
			bigN = new BigInteger(strInputN);

			BigInteger bigFactorialResult = BigInteger.ONE;
			for (BigInteger i = bigN; i.compareTo(BigInteger.ONE) > 0; i = i.subtract(BigInteger.ONE)) {
				bigFactorialResult = bigFactorialResult.multiply(i);
			}
			
			System.out.println("팩토리얼 결과값 : " + bigFactorialResult);
		}
		sc.close();
	}

	static boolean isNumber(String _str) {
		for (int i = 0; i < _str.length(); ++i) {
			if (!Character.isDigit(_str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}

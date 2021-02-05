package com.yrdomain.p2021_02._05;

import java.math.BigInteger;
import java.util.Scanner;

public class H1_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger bigN = null;

		System.out.println("N ���丮�� ��� -> ������ �ƴ� N�� �Է��Ͻÿ�.");
		String strInputN = sc.nextLine();
		if (!isNumber(strInputN)) {
			System.out.println("error ���� ���� �Է��ϼ���!");
		} else {
			// or bigN = sc.nextBigInteger();
			bigN = new BigInteger(strInputN);

			BigInteger bigFactorialResult = BigInteger.ONE;
			for (BigInteger i = bigN; i.compareTo(BigInteger.ONE) > 0; i = i.subtract(BigInteger.ONE)) {
				bigFactorialResult = bigFactorialResult.multiply(i);
			}
			
			System.out.println("���丮�� ����� : " + bigFactorialResult);
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

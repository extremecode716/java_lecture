package com.mydomain.test;

// 특정 수 이하의 n1과 n2의 배수의 합을 구하는 코드

public class MultipleOfN1AndN2_Add {
	private static int addMultipleOfN1AndN2(int _iMaxNum, int _iN1, int _iN2) {
		int iDiv = _iMaxNum / _iN1;
		int iSumN1 = (1 + iDiv) * iDiv * _iN1 / 2;
		iDiv = _iMaxNum / _iN2;
		int iSumN2 = (1 + iDiv) * iDiv * _iN2 / 2;
		iDiv = _iMaxNum / (_iN1 * _iN2);
		int iSumN3 = (1 + iDiv) * iDiv * (_iN1 * _iN2) / 2;
		return iSumN1 + iSumN2 - iSumN3;
	}

	public static void main(String[] args) {
		int iMaxNum = 20;
		int iN1 = 5;
		int iN2 = 3;
		int iResult = addMultipleOfN1AndN2(iMaxNum, iN1 , iN2);
		
		System.out.println(iMaxNum+"이하의 "+iN1+"과 "+iN2+" 배수의 합 : "+iResult);
	}

}

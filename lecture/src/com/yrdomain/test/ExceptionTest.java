package com.yrdomain.test;

// 작성자: ExtremeCode
public class ExceptionTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String data = null;
////////////Null 예외처리1///////////////////
		if (null == data) {
			System.out.println("NullPointerException!!");
		} else {
			System.out.println(data.toString());
		}
////////////Null 예외처리2///////////////////
//////////object로 up casting 후 검사////////
		printIsNull(isNull(data));
/////////////숫자 판별 예외처리1/////////////(정규식 방식)
		data = "String";
		printIsNumber(data.matches("[+-]?\\d*(\\.\\d+)?"));
/////////////숫자 판별 예외처리2/////////////(모든 문자열 탐색 방식)
		printIsNumber(isNumber(data));
/////////////숫자 판별 예외처리3/////////////(오버로드 방식)
		printIsNumber(isNumber(10.4));
/////////////숫자 판별 예외처리4///////////////(Java 8 이상에서 가능하다고 함)
		data = "00100";
		printIsNumber(data.chars().allMatch(Character::isDigit)); 

////////////일반적인 예외처리//////////////	
		try {
			int iValue = Integer.parseInt(data);
			System.out.println(iValue);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException!!");
		}
//////////배열은 class로 랩핑해서 index관리해서 예외처리//(랩핑 방식)
//하거나, try catch(ArrayIndexOutOfBoundsException e)으로 예외처리//(일반적인 예외처리)
//...
////////////////////////////////////////////
	}

	static boolean isNumber(String _str) {
		for (int i = 0; i < _str.length(); ++i) {
			if (!Character.isDigit(_str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	static boolean isNumber(int _i) {
		return true;
	}

	static boolean isNumber(double _i) {
		return true;
	}

	static void printIsNumber(boolean _b) {
		if (_b) {
			System.out.println("data는 Number로 변환 가능.");
		} else {
			System.out.println("data는 Number로 변환 불가능.");
		}
	}
	
	static boolean isNull(Object _o) {
		if(null == _o) {
			return true;
		}
		return false;
	}
	
	static void printIsNull(boolean _b) {
		if (_b) {
			System.out.println("NullPointerException!!");
		} else {
			System.out.println("Null이 아닙니다.");
		}
	}
}

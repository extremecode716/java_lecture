package com.yrdomain.test;

// �ۼ���: ExtremeCode
public class ExceptionTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String data = null;
////////////Null ����ó��1///////////////////
		if (null == data) {
			System.out.println("NullPointerException!!");
		} else {
			System.out.println(data.toString());
		}
////////////Null ����ó��2///////////////////
//////////object�� up casting �� �˻�////////
		printIsNull(isNull(data));
/////////////���� �Ǻ� ����ó��1/////////////(���Խ� ���)
		data = "String";
		printIsNumber(data.matches("[+-]?\\d*(\\.\\d+)?"));
/////////////���� �Ǻ� ����ó��2/////////////(��� ���ڿ� Ž�� ���)
		printIsNumber(isNumber(data));
/////////////���� �Ǻ� ����ó��3/////////////(�����ε� ���)
		printIsNumber(isNumber(10.4));
/////////////���� �Ǻ� ����ó��4///////////////(Java 8 �̻󿡼� �����ϴٰ� ��)
		data = "00100";
		printIsNumber(data.chars().allMatch(Character::isDigit)); 

////////////�Ϲ����� ����ó��//////////////	
		try {
			int iValue = Integer.parseInt(data);
			System.out.println(iValue);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException!!");
		}
//////////�迭�� class�� �����ؼ� index�����ؼ� ����ó��//(���� ���)
//�ϰų�, try catch(ArrayIndexOutOfBoundsException e)���� ����ó��//(�Ϲ����� ����ó��)
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
			System.out.println("data�� Number�� ��ȯ ����.");
		} else {
			System.out.println("data�� Number�� ��ȯ �Ұ���.");
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
			System.out.println("Null�� �ƴմϴ�.");
		}
	}
}

package com.yrdomain.classTest;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// 후위표기법으로 계산할 계산기 클래스.
public class Calculator {
	private static Scanner sc = new Scanner(System.in);

	private List<String> listNumbers = new ArrayList<String>();
	private List<Character> listOperators = new ArrayList<Character>();

	private boolean m_bPowerSwitch = true;
	private String m_strBrandName = null;
	private String m_strInputData = null;
	private String m_strResult = null;

	public Calculator() {
		m_bPowerSwitch = true;
		m_strBrandName = null;
		m_strInputData = null;
		m_strResult = null;

		printString("생성자 호출");
	}

	public Calculator(String _strBrandName) {
		m_bPowerSwitch = true;
		m_strBrandName = _strBrandName;
		m_strInputData = null;
		m_strResult = null;

		printString("생성자 호출 (브랜드: " + m_strBrandName + ")");
	}

	/////////////////////
	// 실행 로직
	public boolean run() {
		if (!m_bPowerSwitch) {
			printString("전원을 키세요.");
			return false;
		}

		if (!inputData())
			return false;
		spliteInputDataAddListNumbersAndOperators();
		if (!changeInfixToPrefix())
			return false;
		if (!calculate())
			return false;
		printResult();

		return true;
	}
	
	public void reset() {
		m_strInputData = null;
		m_strResult = null;
		listNumbers.clear();
		listOperators.clear();
	}

	// 숫자와 연산자를 분리시키는 메소드 (현재 중위표기법)
	private void spliteInputDataAddListNumbersAndOperators() {
		boolean bNumberContinue = false;
		int iNumberStartIndex = 0;
		int iNumberEndIndex = 0;

		for (int i = 0; i < m_strInputData.length(); ++i) {
			switch (m_strInputData.charAt(i)) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				if (!bNumberContinue) {
					iNumberStartIndex = i;
					bNumberContinue = true;
				}
				iNumberEndIndex = i + 1;
				break;
			case '(':
			case '*':
			case '/':
			case '+':
			case '-':
			case ')':
				if (bNumberContinue) {
					listNumbers.add(m_strInputData.substring(iNumberStartIndex, iNumberEndIndex));
					bNumberContinue = false;
				}
				listOperators.add(m_strInputData.charAt(i));
				break;
			default:
				bNumberContinue = false;
				break;
			}
			if (bNumberContinue) {
				listNumbers.add(m_strInputData.substring(iNumberStartIndex, iNumberEndIndex));
				bNumberContinue = false;
			}
		}
		printString("숫자와 연산자를 분리시키는 메소드 실행(현재 중위표기법)");
	}

	// 데이터 입력 메소드
	public boolean inputData() {
		printString("↓계산기 입력↓");
		// 빈 공간 날린다
		m_strInputData = sc.nextLine().replaceAll(" ", "");
		// 문자열을 검사하여 맞는 표현인지 검사 진행.
		//return false;
		
		printString("입력 받았다");

		return true;
	}

	// 결과값 출력한다.
	public void printResult() {
		if (m_strResult == null)
			return;

		printString("결과값: " + m_strResult);
	}

	// 계산한다.
	private boolean calculate() {
		printString("계산 메소드 실행");

		// 계산이 되면 필드에 바로 때려넣을것임.
		return true;
	}

	// 계산기를 키고 끈다.
	public boolean powerSwitch() {
		m_bPowerSwitch = (m_bPowerSwitch == false) ? (m_bPowerSwitch = true) : (m_bPowerSwitch = false);

		if (m_bPowerSwitch) {
			printString("전원 on");
		} else {
			printString("전원 off");
		}

		return m_bPowerSwitch;
	}

	public void printString(String _str) {
		System.out.println(_str);
	}

	//	후위연산자로 변경.
	private boolean changeInfixToPrefix() {

		return true;
	}

}

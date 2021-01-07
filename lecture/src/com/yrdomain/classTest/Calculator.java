package com.yrdomain.classTest;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// ����ǥ������� ����� ���� Ŭ����.
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

		printString("������ ȣ��");
	}

	public Calculator(String _strBrandName) {
		m_bPowerSwitch = true;
		m_strBrandName = _strBrandName;
		m_strInputData = null;
		m_strResult = null;

		printString("������ ȣ�� (�귣��: " + m_strBrandName + ")");
	}

	/////////////////////
	// ���� ����
	public boolean run() {
		if (!m_bPowerSwitch) {
			printString("������ Ű����.");
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

	// ���ڿ� �����ڸ� �и���Ű�� �޼ҵ� (���� ����ǥ���)
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
		printString("���ڿ� �����ڸ� �и���Ű�� �޼ҵ� ����(���� ����ǥ���)");
	}

	// ������ �Է� �޼ҵ�
	public boolean inputData() {
		printString("����� �Է¡�");
		// �� ���� ������
		m_strInputData = sc.nextLine().replaceAll(" ", "");
		// ���ڿ��� �˻��Ͽ� �´� ǥ������ �˻� ����.
		//return false;
		
		printString("�Է� �޾Ҵ�");

		return true;
	}

	// ����� ����Ѵ�.
	public void printResult() {
		if (m_strResult == null)
			return;

		printString("�����: " + m_strResult);
	}

	// ����Ѵ�.
	private boolean calculate() {
		printString("��� �޼ҵ� ����");

		// ����� �Ǹ� �ʵ忡 �ٷ� ������������.
		return true;
	}

	// ���⸦ Ű�� ����.
	public boolean powerSwitch() {
		m_bPowerSwitch = (m_bPowerSwitch == false) ? (m_bPowerSwitch = true) : (m_bPowerSwitch = false);

		if (m_bPowerSwitch) {
			printString("���� on");
		} else {
			printString("���� off");
		}

		return m_bPowerSwitch;
	}

	public void printString(String _str) {
		System.out.println(_str);
	}

	//	���������ڷ� ����.
	private boolean changeInfixToPrefix() {

		return true;
	}

}

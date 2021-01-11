package com.yrdomain.classtest;

import java.util.Scanner;

// User ���� ���� // Enum ���� ���� �ص� ��
class EnumUserPermission {
	public static final int USER_NO_PERMISSION = 0;
	public static final int USER_ADMIN_PERMISSION = 1;
	public static final int USER_MANAGER_PERMISSION = 2;
	public static final int USER_GUEST_PERMISSION = 3;
	public static final int USER_GENERAL_PERMISSION = 4;
}

// �Խ��� Ŭ���� && ���� Ŭ����.
public class NoticeBoard {
	// Static field //
	public static final int NOMAR_TYPE = 0;
	public static final int NOTICE_TYPE = 1;
	public static final Scanner SC = new Scanner(System.in);

	///////////////////////////////////////////////////////
	private int m_iUserPermission = EnumUserPermission.USER_NO_PERMISSION;
	private int m_iNoticeType = NOMAR_TYPE; // ���� ������ �Խ������� ������� ������ �Ҳ���, �� �ʵ常 ó���ϸ� ��.//������ ��ӿ� ������ �ƴѵ�.
	private String m_strSubject = "";
	private String m_strBodyText = "";
	///////////////////////////////////////////////////////

	public NoticeBoard() {
		m_iUserPermission = EnumUserPermission.USER_NO_PERMISSION;
		m_iNoticeType = NOMAR_TYPE;
		m_strSubject = "";
		m_strBodyText = "";
	}

	public NoticeBoard(int _userPermission) {
		m_iUserPermission = _userPermission;
		m_iNoticeType = NOMAR_TYPE;
		m_strSubject = "";
		m_strBodyText = "";
	}

	public void run() {
		while (true) {
			viewWritePage();
			if (!controlPage())
				break;
		}
	}

	private void viewControlPage() {
		printlnString("Ÿ������ Ű���带 �Է��ϼ���.");
		int userPermission = getUserPermission();
		String strKeyword = "( ���� || ���� ";
		if (userPermission == EnumUserPermission.USER_MANAGER_PERMISSION
				|| userPermission == EnumUserPermission.USER_ADMIN_PERMISSION) {
			strKeyword += "|| ���� ";
		}
		strKeyword += "|| ���� )";
		printlnString(strKeyword);
	}

	private boolean controlPage() {
		viewControlPage();
		String strInputData = SC.nextLine();

		switch (strInputData) {
		case "����":
			int userPermission = getUserPermission();
			int noticeType = getNoticeType();
			if (userPermission == EnumUserPermission.USER_MANAGER_PERMISSION
					|| userPermission == EnumUserPermission.USER_ADMIN_PERMISSION) {
				noticeType = (noticeType == NOMAR_TYPE) ? (noticeType = NOTICE_TYPE) : (noticeType = NOMAR_TYPE);
				setNoticeType(noticeType);
				printString("��������( ");
				switch (noticeType) {
				case NOTICE_TYPE:
					printString("o");
					break;
				default:
					printString("x");
					break;
				}
				printString(" )");
			}
			printlnString("");
			break;
		case "����":
			printString("����: ");
			printlnString(inputSubject());
			break;
		case "����":
			printString("����: ");
			printlnString(inputBodyText());
			break;
		case "����":
			if (submit()) {
				printlnString("���� �Ͽ����ϴ�.");
				viewReadPage();
				return false;
			} else {
				printlnString("��ĭ�� �־ ������� �ʾҽ��ϴ�.");
			}
			break;
		}

		return true;
	}

	private void viewNoticeType() {
		int userPermission = getUserPermission();
		int noticeType = getNoticeType();
		if (userPermission == EnumUserPermission.USER_MANAGER_PERMISSION
				|| userPermission == EnumUserPermission.USER_ADMIN_PERMISSION) {
			printString("��������( ");
			switch (noticeType) {
			case NOTICE_TYPE:
				printString("o");
				break;
			default:
				printString("x");
				break;
			}
			printString(" )");
		}
	}
	private boolean submit() {
		if (getSubject().equals(""))
			return false;
		else if (getBodyText().equals(""))
			return false;
		return true;
	}

	public void viewWritePage() {
		printlnString("---�Խ��� �ۼ�---");
		printString("�޴�: ");
		viewNoticeType();
		printlnString("");
		printString("����: ");
		printlnString(getSubject());
		printString("����: ");
		printString(getBodyText());

		printlnString("");
		printlnString("[���� ��ư]");
		printlnString("-------------");
	}

	public void viewReadPage() {
		printlnString("---�Խ���---");
		printString("����: ");
		printlnString(getSubject());
		printString("����: ");
		printString(getBodyText());
		printlnString("");
		printlnString("---------");
	}

	private String inputSubject() {
		String strSubject = SC.nextLine();
		m_strSubject = strSubject;
		return strSubject;
	}

	private String inputBodyText() {
		String strBodyText = SC.nextLine();
		m_strBodyText = strBodyText;
		return strBodyText;
	}

	/////////////////////////////////////////
	public int getUserPermission() {
		return m_iUserPermission;
	}

	protected void setUserPermission(int _iUserPermission) {
		this.m_iUserPermission = _iUserPermission;
	}

	public int getNoticeType() {
		return m_iNoticeType;
	}

	protected void setNoticeType(int _iNoticeType) {
		this.m_iNoticeType = _iNoticeType;
	}

	public String getSubject() {
		return m_strSubject;
	}

	protected void setSubject(String _strSubject) {
		this.m_strSubject = _strSubject;
	}

	public String getBodyText() {
		return m_strBodyText;
	}

	protected void setBodyText(String _strBodyText) {
		this.m_strBodyText = _strBodyText;
	}

	private void printlnString(String _str) {
		System.out.println(_str);
	}

	private void printString(String _str) {
		System.out.print(_str);
	}

	// main
	public static void main(String[] args) {
		NoticeBoard nb = new NoticeBoard(EnumUserPermission.USER_MANAGER_PERMISSION);
		nb.run();
	}
}

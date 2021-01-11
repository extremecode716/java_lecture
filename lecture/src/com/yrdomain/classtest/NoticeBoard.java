package com.yrdomain.classtest;

import java.util.Scanner;

// User 접근 권한 // Enum 으로 변경 해도 됨
class EnumUserPermission {
	public static final int USER_NO_PERMISSION = 0;
	public static final int USER_ADMIN_PERMISSION = 1;
	public static final int USER_MANAGER_PERMISSION = 2;
	public static final int USER_GUEST_PERMISSION = 3;
	public static final int USER_GENERAL_PERMISSION = 4;
}

// 게시판 클래스 && 실행 클래스.
public class NoticeBoard {
	// Static field //
	public static final int NOMAR_TYPE = 0;
	public static final int NOTICE_TYPE = 1;
	public static final Scanner SC = new Scanner(System.in);

	///////////////////////////////////////////////////////
	private int m_iUserPermission = EnumUserPermission.USER_NO_PERMISSION;
	private int m_iNoticeType = NOMAR_TYPE; // 만약 공지랑 게시판으로 상속으로 나눠서 할꺼면, 이 필드만 처리하면 됨.//적합한 상속용 과제는 아닌듯.
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
		printlnString("타이핑할 키워드를 입력하세요.");
		int userPermission = getUserPermission();
		String strKeyword = "( 제목 || 본문 ";
		if (userPermission == EnumUserPermission.USER_MANAGER_PERMISSION
				|| userPermission == EnumUserPermission.USER_ADMIN_PERMISSION) {
			strKeyword += "|| 공지 ";
		}
		strKeyword += "|| 제출 )";
		printlnString(strKeyword);
	}

	private boolean controlPage() {
		viewControlPage();
		String strInputData = SC.nextLine();

		switch (strInputData) {
		case "공지":
			int userPermission = getUserPermission();
			int noticeType = getNoticeType();
			if (userPermission == EnumUserPermission.USER_MANAGER_PERMISSION
					|| userPermission == EnumUserPermission.USER_ADMIN_PERMISSION) {
				noticeType = (noticeType == NOMAR_TYPE) ? (noticeType = NOTICE_TYPE) : (noticeType = NOMAR_TYPE);
				setNoticeType(noticeType);
				printString("공지사항( ");
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
		case "제목":
			printString("제목: ");
			printlnString(inputSubject());
			break;
		case "본문":
			printString("본문: ");
			printlnString(inputBodyText());
			break;
		case "제출":
			if (submit()) {
				printlnString("제출 하였습니다.");
				viewReadPage();
				return false;
			} else {
				printlnString("빈칸이 있어서 제출되지 않았습니다.");
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
			printString("공지사항( ");
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
		printlnString("---게시판 작성---");
		printString("메뉴: ");
		viewNoticeType();
		printlnString("");
		printString("제목: ");
		printlnString(getSubject());
		printString("내용: ");
		printString(getBodyText());

		printlnString("");
		printlnString("[제출 버튼]");
		printlnString("-------------");
	}

	public void viewReadPage() {
		printlnString("---게시판---");
		printString("제목: ");
		printlnString(getSubject());
		printString("내용: ");
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

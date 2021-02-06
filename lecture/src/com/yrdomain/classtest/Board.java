package com.yrdomain.classtest;

import java.util.Scanner;

// �ۼ���: ExtremeCode
// User ���� ���� // Enum ���� ���� �ص� ��
class EnumUserPermission {
	public static final int USER_NO_PERMISSION = 0;
	public static final int USER_ADMIN_PERMISSION = 1;
	public static final int USER_MANAGER_PERMISSION = 2;
	public static final int USER_GUEST_PERMISSION = 3;
	public static final int USER_GENERAL_PERMISSION = 4;
}

// �Խ��� Ŭ���� && ���� Ŭ����.
public class Board {
	// Static field //
	public static final int NOMAR_TYPE = 0;
	public static final int NOTICE_TYPE = 1;
	public static final Scanner SC = new Scanner(System.in);

	///////////////////////////////////////////////////////
	private int m_iUserPermission = EnumUserPermission.USER_NO_PERMISSION; // ���� ������ ���� �� ��.(�ӽ�)
	private int m_iNoticeType = NOMAR_TYPE;
	// ���� ������ �Խ������� ������� ������ �Ҳ���, �� �ʵ� 2���� ó���ϸ� ��.
	private int m_iNo = 0;
	private int m_iSeq = 0;
	private String m_strSubject = "";
	private String m_strBodyText = "";
	private String m_strWriter = "";
	private String m_strWiterSeq = "";
	private String m_strCounter = "";

	///////////////////////////////////////////////////////

	public Board() {
		m_iUserPermission = EnumUserPermission.USER_NO_PERMISSION;
		m_iNoticeType = NOMAR_TYPE;
		m_strSubject = "";
		m_strBodyText = "";
		m_strWriter = "";
	}

	public Board(int _userPermission) {
		m_iUserPermission = _userPermission;
		m_iNoticeType = NOMAR_TYPE;
		m_strSubject = "";
		m_strBodyText = "";
		m_strWriter = "";
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
				noticeType = (noticeType == NOMAR_TYPE) ? (NOTICE_TYPE) : (NOMAR_TYPE);
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

	// ��Ͽ� ������ ������ �ҷ����� �Լ�
	public void showList() {
	}

	// ��ȭ�鿡 ������ ������ �ҷ����� �Լ�
	public void showView(int _seq) {
	}

	// ���ȭ�鿡 ������ ������ �ҷ����� �Լ�
	public void showForm() {
		showView(m_iSeq);
		procInsert();
	}

	// �Է� ���� �����͸� ��� ����ϴ� ���μ���
	public int procInsert() {
		return 1;
	}

	// ���õ� ������ �����ϴ� ���μ��� : ���� �����ͺ��̽� �󿡼� ����
	public int procUpdate(int _seq) {
		return 1;
	}

	// ���õ� �����͸� ���� �� ��ó�� ������Ʈ �ϴ� ���μ���:
	// ���� �����ʹ� ���� ���� �ʰ� ���� ������ ���� ���� �ʵ带 n->y �� ó��
	public int proUelete(int _seq) {
		return 1;
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
		Board nb = new Board_Notice();
		nb.run();

		SC.close();
	}
}
//////////////////// �θ�////////////////////
//String m_strFileName = "";
//String m_strFileExtension = "";
//
//static final int FILE_MAX_SIZE = 50;
//static final String[] ALLOWED_FILE_EXTENSION = {"gif","png","jpg","tiff"};
//static final String[] NOT_ALLOWED_FILE_EXTENSION = {"exe", "bat", "sh", "abc"};
//
//public void fileUpload() {
//}
//
//public void fileDownload() {
//}
//
//public void fileDelete() {
//}
//
//public void like() {
//}
////////////////////////////////////////////////
//����
class Board_Notice extends Board {

	public Board_Notice() {
		super();
		super.setUserPermission(EnumUserPermission.USER_MANAGER_PERMISSION);
		super.setNoticeType(NOTICE_TYPE);
	}
}

//�Ϲ�
class Board_Nomar extends Board {

	public Board_Nomar() {
		super();
		super.setUserPermission(EnumUserPermission.USER_GUEST_PERMISSION);
		super.setNoticeType(NOMAR_TYPE);
	}
}

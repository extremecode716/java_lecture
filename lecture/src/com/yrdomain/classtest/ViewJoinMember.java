package com.yrdomain.classtest;
import java.util.Scanner;

// �ۼ���: ExtremeCode // ȸ������ ���� Ŭ���� && View Ŭ����
// ����: ViewJoinMember.java
public class ViewJoinMember {
	private static EnumJoinMember ejm = EnumJoinMember.JOINMEMBER_FAILED;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---ȸ������---");
		// ��
		while (true) {
			if (IsInputLastName(sc))
				break;
		}
		// �̸�
		while (true) {
			if (IsInputFirstName(sc))
				break;
		}
		// �̸��� �ּ�
		while (true) {
			if (IsInputEmailID(sc))
				break;
		}
		// ��й�ȣ �Է�
		while (true) {
			if (IsInputPw(sc))
				break;
		}
		// �������
		JoinMember.getInstance().getMemberData().setTermsOfService(true);
		if (JoinMember.getInstance().submit()) {
			System.out.println("-----ȸ������ ����-----");
			ejm = EnumJoinMember.JOINMEMBER_SUCCEED;
		}
		sc.close();
	}

	private static boolean IsInputEmailID(final Scanner _sc) {
		String strUserInput = null;
		System.out.print("Email ID : ");
		strUserInput = _sc.nextLine();
		ejm = JoinMember.getInstance().checkEmailID(strUserInput);
		switch (ejm) {
		case REGULAR_EMAILID_FAILED:
			System.out.println("�̸��� ���Ŀ� �°� �Է��ϼ���!");
			return false;
		case FIND_EMAILID_SUCCED:
			System.out.println("�̸���ID �� �ߺ��Ǿ����ϴ�!");
			return false;
		default:
			break;
		}
		JoinMember.getInstance().getMemberData().setEmailID(strUserInput);
		return true;
	}

	private static boolean IsInputPw(final Scanner _sc) {
		String strUserInput = null;
		System.out.println("Ư������,���� ���� ����(8~20)");
		System.out.print("Pw : ");
		strUserInput = _sc.nextLine();
		ejm = JoinMember.getInstance().checkPw(strUserInput);
		switch (ejm) {
		case REGULAR_PW_FAILED:
			System.out.println("pw ���Ŀ� �°� �Է��ϼ���!");
			return false;
		default:
			break;
		}
		System.out.print("Pw ��Ȯ�� : ");
		if (!strUserInput.equals(_sc.nextLine())) {
			System.out.println("��й�ȣ�� ��ġ ���� �ʽ��ϴ�.");
			return false;
		}

		JoinMember.getInstance().getMemberData().setPw(strUserInput);
		return true;
	}

	private static boolean IsInputLastName(final Scanner _sc) {
		String strUserInput = null;
		System.out.print("�� (LastName) : ");
		strUserInput = _sc.nextLine();
		ejm = JoinMember.getInstance().checkLastName(strUserInput);
		switch (ejm) {
		case REGULAR_LASTNAME_FAILED:
			System.out.println("���� ���Ŀ� �°� �Է��ϼ���!");
			return false;
		case FIND_LASTNAME_SUCCED:
			System.out.println("���� �ߺ��Ǿ����ϴ�!");
			return false;
		default:
			break;
		}
		JoinMember.getInstance().getMemberData().setLastName(strUserInput);
		return true;
	}

	private static boolean IsInputFirstName(final Scanner _sc) {
		String strUserInput = null;
		System.out.print("�̸� (FirstName) : ");
		strUserInput = _sc.nextLine();
		ejm = JoinMember.getInstance().checkFirstName(strUserInput);
		switch (ejm) {
		case REGULAR_FIRSTNAME_FAILED:
			System.out.println("�̸� ���Ŀ� �°� �Է��ϼ���!");
			return false;
		case FIND_FIRSTNAME_SUCCED:
			System.out.println("�̸��� �ߺ��Ǿ����ϴ�!");
			return false;
		default:
			break;
		}
		JoinMember.getInstance().getMemberData().setFirstName(strUserInput);
		return true;
	}

}

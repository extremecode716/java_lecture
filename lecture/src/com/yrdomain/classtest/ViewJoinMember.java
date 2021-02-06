package com.yrdomain.classtest;
import java.util.Scanner;

// 작성자: ExtremeCode // 회원가입 실행 클래스 && View 클래스
// 파일: ViewJoinMember.java
public class ViewJoinMember {
	private static EnumJoinMember ejm = EnumJoinMember.JOINMEMBER_FAILED;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---회원가입---");
		// 성
		while (true) {
			if (IsInputLastName(sc))
				break;
		}
		// 이름
		while (true) {
			if (IsInputFirstName(sc))
				break;
		}
		// 이메일 주소
		while (true) {
			if (IsInputEmailID(sc))
				break;
		}
		// 비밀번호 입력
		while (true) {
			if (IsInputPw(sc))
				break;
		}
		// 약관동의
		JoinMember.getInstance().getMemberData().setTermsOfService(true);
		if (JoinMember.getInstance().submit()) {
			System.out.println("-----회원가입 성공-----");
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
			System.out.println("이메일 형식에 맞게 입력하세요!");
			return false;
		case FIND_EMAILID_SUCCED:
			System.out.println("이메일ID 가 중복되었습니다!");
			return false;
		default:
			break;
		}
		JoinMember.getInstance().getMemberData().setEmailID(strUserInput);
		return true;
	}

	private static boolean IsInputPw(final Scanner _sc) {
		String strUserInput = null;
		System.out.println("특수문자,영문 숫자 조합(8~20)");
		System.out.print("Pw : ");
		strUserInput = _sc.nextLine();
		ejm = JoinMember.getInstance().checkPw(strUserInput);
		switch (ejm) {
		case REGULAR_PW_FAILED:
			System.out.println("pw 형식에 맞게 입력하세요!");
			return false;
		default:
			break;
		}
		System.out.print("Pw 재확인 : ");
		if (!strUserInput.equals(_sc.nextLine())) {
			System.out.println("비밀번호가 일치 하지 않습니다.");
			return false;
		}

		JoinMember.getInstance().getMemberData().setPw(strUserInput);
		return true;
	}

	private static boolean IsInputLastName(final Scanner _sc) {
		String strUserInput = null;
		System.out.print("성 (LastName) : ");
		strUserInput = _sc.nextLine();
		ejm = JoinMember.getInstance().checkLastName(strUserInput);
		switch (ejm) {
		case REGULAR_LASTNAME_FAILED:
			System.out.println("성을 형식에 맞게 입력하세요!");
			return false;
		case FIND_LASTNAME_SUCCED:
			System.out.println("성이 중복되었습니다!");
			return false;
		default:
			break;
		}
		JoinMember.getInstance().getMemberData().setLastName(strUserInput);
		return true;
	}

	private static boolean IsInputFirstName(final Scanner _sc) {
		String strUserInput = null;
		System.out.print("이름 (FirstName) : ");
		strUserInput = _sc.nextLine();
		ejm = JoinMember.getInstance().checkFirstName(strUserInput);
		switch (ejm) {
		case REGULAR_FIRSTNAME_FAILED:
			System.out.println("이름 형식에 맞게 입력하세요!");
			return false;
		case FIND_FIRSTNAME_SUCCED:
			System.out.println("이름이 중복되었습니다!");
			return false;
		default:
			break;
		}
		JoinMember.getInstance().getMemberData().setFirstName(strUserInput);
		return true;
	}

}

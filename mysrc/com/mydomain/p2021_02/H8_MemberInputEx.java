package com.mydomain.p2021_02;

//회원정보 입력 받는 클래스 작성.
//제출
//author: ExtremeCode
import java.util.Scanner;
import java.util.regex.Pattern;

class MemberInfo_1 {
	private String name;
	private int age;
	private String email;
	private String address;
	{
		name = null;
		age = 0;
		email = null;
		address = null;
	}

	public MemberInfo_1() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void printInfo() {
		System.out.println("-MemberInfo-");
		System.out.println("성명  : " + name);
		System.out.println("나이  : " + age);
		System.out.println("이메일 : " + email);
		System.out.println("주소  : " + address);
	}
}

public class H8_MemberInputEx {
	static int s_number_of_members = 1;

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.print("입력 받을 멤버 수 : ");
				s_number_of_members = Integer.parseInt(sc.nextLine());
				if (s_number_of_members < 1) {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException e) {
				System.out.println("멤버 수가 올바르지 않습니다. 다시 입력해주세요.");
				continue;
			}
			break;
		} while (true);
		String inputData = null;
		MemberInfo_1[] memInfo = new MemberInfo_1[s_number_of_members];
		for (int i = 0; i < memInfo.length; ++i) {
			System.out.println((i + 1) + " 번째 회원 정보 입력 하시오.");
			memInfo[i] = new MemberInfo_1();

			do {
				System.out.print("성명  : ");
				inputData = sc.nextLine();
				if (!Pattern.matches("^[가-힣]{1,10}|[a-zA-Z]{1,25}$", inputData)) {
					System.out.println("성명이 올바르지 않습니다. 다시 입력해주세요.");
					continue;
				}
				memInfo[i].setName(inputData);
				break;
			} while (true);

			do {
				try {
					System.out.print("나이  : ");
					inputData = sc.nextLine();
					int iAge = Integer.parseInt(inputData);
					if (iAge < 0)
						throw new NumberFormatException();
					memInfo[i].setAge(iAge);
				} catch (NumberFormatException e) {
					System.out.println("나이가 올바르지 않습니다. 다시 입력해주세요.");
					continue;
				}
				break;
			} while (true);

			do {
				System.out.print("이메일  : ");
				inputData = sc.nextLine();
				if (!Pattern.matches(
						"^[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$",
						inputData)) {
					System.out.println("이메일이 올바르지 않습니다. 다시 입력해주세요.");
					continue;
				}
				memInfo[i].setEmail(inputData);
				break;
			} while (true);

			do {
				System.out.print("주소  : ");
				inputData = sc.nextLine();
				memInfo[i].setAddress(inputData);
				break;
			} while (true);
		}

		System.out.println("저장된 멤버 정보");
		for (int i = 0; i < memInfo.length; ++i) {
			memInfo[i].printInfo();
		}

		sc.close();
	}
}
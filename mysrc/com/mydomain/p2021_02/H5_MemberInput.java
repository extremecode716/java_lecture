package com.mydomain.p2021_02;

//과제. 
//키보드를 통해서 각 회원들의 정보를 입력 받는                         
//클래스(MemberInput)를 작성한다. 
//이때 입력 받는 회원의 정보는 성명, 나이, 이메일, 주소를  
//입력 받는다. 그리고 키보드로 입력한 회원의 정보는 새로운
//회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에 
//저장을 시킨후 출력하는 프로그램을 작성하시오.
//(단, 1명의 회원정보를 입력 받아서 처리한다. 
// 가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해본다.)

import java.util.Scanner;
import java.util.regex.Pattern;

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	public MemberInfo() {
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
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
		System.out.println("성명  : " + getName());
		System.out.println("나이  : " + getAge());
		System.out.println("이메일 : " + getEmail());
		System.out.println("주소  : " + getAddress());
	}
}

public class H5_MemberInput {
	static int s_number_of_members = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
		MemberInfo[] memInfo = new MemberInfo[s_number_of_members];
		for (int i = 0; i < memInfo.length; ++i) {
			System.out.println((i + 1) + " 번째 회원 정보 입력 하시오.");
			memInfo[i] = new MemberInfo();

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
					if(iAge < 0)
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

package com.mydomain.p2021_02._10;
import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 배열
		MemberInfo[] m = new MemberInfo[5];
		int i = 0;
		String yn;
		Scanner sc = new Scanner(System.in);
		String name, email, address;
		int age;
		do {						
			System.out.print("성명을 입력하세요? ");
			name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			age = sc.nextInt();// 숫자를 입력받은후에 enter키를 
			sc.nextLine();	    // 누르면 null값을 return하게 됨
			System.out.print("E-Mail을 입력하세요? ");
			email = sc.nextLine();			
			System.out.print("주소를 입력하세요? ");
			address = sc.nextLine();		
	
			m[i] = new MemberInfo(name, age, email, address);
			// m.name="홍길동";
			i++;

			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}

		} while (true);

		for (int j = 0; j < i; j++) {
			System.out.println("성명:" + m[j].getName());
			System.out.println("나이:" + m[j].getAge());
			System.out.println("E-Mail:" + m[j].getEmail());
			System.out.println("주소:" + m[j].getAddress());
		}
	}

}

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
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

}

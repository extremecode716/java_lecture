package com.mydomain.p2021_02._04;


public class Oper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 산술 연산자 : +, -, *, /(몫), %(나머지)
// int형과 int형을 산술연산을 수행하면, 결과는 int형으로 처리된다.		
		int a = 10, b = 3, c;
		
		c = a + b;
		System.out.println("a+b="+c);
		System.out.println("a+b="+(a+b)); // 13
		System.out.println("a-b="+(a-b)); // 7
		System.out.println("a*b="+(a*b)); // 30
		System.out.println("a/b="+(a/b)); //몫: 3
		System.out.println("a%b="+(a%b)); //나머지 : 1
		
	}

}

package com.yrdomain.p2021_02._04;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("정수 2개를 입력 하세요?");
	
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();  // 스페이스바 or 엔터키로 구분함
		int n2 = sc.nextInt();
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		
		if(n1 > n2) {
			System.out.println(n1+"이 "+n2+"보다 크다.");
		}else {
			System.out.println(n2+"이 "+n1+"보다 크다.");
		}
	
	}
 
}

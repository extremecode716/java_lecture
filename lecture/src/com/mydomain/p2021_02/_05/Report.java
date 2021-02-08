package com.mydomain.p2021_02._05;

import java.util.Scanner;

public class Report{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("3개의 정수를 입력 하세요?");
		int n1, n2, n3, max, min;

		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt(); // n1=20;
		n2 = sc.nextInt(); // n2=10;
		n3 = sc.nextInt();

		// 최대값
		max = (n1 > n2) ? n1 : n2;
		max = (max > n3) ? max : n3;		
//		max = (n1>n2 && n1>n3) ? n1 : (n2>n3) ? n2: n3;
		
		
		// 최소값		
		min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;		
//		min = (n1<n2 && n1<n3) ? n1 : (n2<n3) ? n2: n3;
		
		System.out.println("max=" + max);
		System.out.println("min=" + min);		
		
	}

}

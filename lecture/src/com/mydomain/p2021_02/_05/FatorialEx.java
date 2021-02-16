package com.mydomain.p2021_02._05;

import java.util.Scanner;

public class FatorialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, f=1;
		System.out.print("정수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=n; i>=1; i--){
			f = f * i;      // f *= i;
		}
		System.out.println(n+"!="+f);	
	}

}

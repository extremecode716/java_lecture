package com.mydomain.p2021_02._16;

// 1년 365.242374
// 평년 = 365일 (2월달 - 28일까지)
// 윤년 = 366일 (2월달 - 29일까지)

/* 윤년의 정의

1. 해당 연도를 4로 나누어 떨어지면 윤년

2. 그 중에서 100으로 나누어 떨어지면 윤년이 아님

3. 그 중에서 400으로 나누어 떨어지면 윤년
*/

import java.util.Scanner;

public class YearCheck01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("연도를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		if((y%4==0 && y%100!=0) || y%400==0){
			System.out.println(y+"은 윤년");
		}else{
			System.out.println(y+"은 평년");
		}
		
		
		
	}

}

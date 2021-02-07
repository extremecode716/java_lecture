package com.mydomain.p2021_02._04;
import java.util.Scanner;


import java.util.Scanner;

public class Oper07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 논리 연산자 : and(&&), or(||), not(!)
// 자바에서는 논리 연산자 기호를 사용해야 된다.   &&, ||, !
		
// 5과목의 점수를 키보드로 입력 받았을때, 합격, 불합격을 판별하는 프로그램을
// 작성 하세요?
// 각 과목당 과락은 40점이고, 평균 60점 이상 받아야 합격한다.
		
	int n1, n2, n3, n4, n5, total;
	double avg;
	System.out.println("5과목의 점수를 입력하세요?");
	Scanner sc= new Scanner(System.in);
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	n3 = sc.nextInt();
	n4 = sc.nextInt();
	n5 = sc.nextInt();
	total = n1 + n2 + n3 + n4 + n5;
	avg = (double)total /(double)5;
	System.out.println("avg:"+avg);
	
	if(n1>=40 && n2>=40 && n3>=40 && n4>=40 && n5>=40 && avg>=60) {
		System.out.println("합격");
	}else {
		System.out.println("불합격");
	}
	
	
	
	
	
	
		
		
		
	}

}
package com.mydomain.p2021_02._05;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break문 : 반복문을 빠져 나오는 역할
		// 무한 루프 : for문
//		for(;;) {
//			System.out.println("무한출력");
//		}
		
		for(int i=1; ; i++) {	
			System.out.println(i+"무한 출력");
			if(i==100) break;
		}
		
	}

}

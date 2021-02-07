package com.mydomain.p2021_02._04;

import java.sql.Timestamp;
import java.util.Date;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 : 메모리상에 데이터를 저장하기 위한 기억 공간
		// 변수를 만드는 형식 : 자료형 변수명 = 데이터(값);
		
		// 기본 자료형
		// 1. 정수형 변수
		byte b1 = 10; 		// -128 ~ 127
		short s = 100; 		// -32768 ~ 32767
		int i = 1000;
		long l = 10000;
		
		System.out.println("b1="+b1);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
		
		Date d = new Date();
		System.out.println(d);
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
		
		
	}

}

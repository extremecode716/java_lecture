package com.mydomain.p2021_02._03;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자바 출력 성공1");
		System.out.println("자바 출력 성공2");
		System.out.println("자바 출력 성공3");

		Date d = new Date();
		System.out.println(d);

		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);

		SimpleDateFormat format1 = null;
		format1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		System.out.println(format1.format(d));
		System.out.println(format1.format(ts));

	}

}

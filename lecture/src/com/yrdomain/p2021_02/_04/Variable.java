package com.yrdomain.p2021_02._04;

import java.sql.Timestamp;
import java.util.Date;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� : �޸𸮻� �����͸� �����ϱ� ���� ��� ����
		// ������ ����� ���� : �ڷ��� ������ = ������(��);
		
		// �⺻ �ڷ���
		// 1. ������ ����
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

package com.mydomain.p2021_02._10;

public class AppendStringBuffer {
	public static void main(String[] args) {

		// StringBuffer 객체 생성
		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println("sb1 = " + sb1);

		// StringBuffer sb1에 문자열을 추가해 새로운 객체 생성
		StringBuffer sb2 = sb1.append(" is beautiful");
		System.out.println("sb2 = " + sb2);
		System.out.println("sb1 = " + sb1);
		if(sb1 == sb2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}

		// 정수형 데이타 형을 추가
		System.out.println(sb1.append(1004));
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);

		String str = new String(sb1); // StringBuffer를 String으로 변환
		if(str.hashCode() == sb2.hashCode()) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		String str1 = sb1.toString();
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(sb1.hashCode());
		System.out.println(str.toUpperCase());
	}
}



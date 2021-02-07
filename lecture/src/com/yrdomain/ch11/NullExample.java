package com.yrdomain.ch11;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		String name = null;
		System.out.println(Objects.requireNonNull(str1));

		try {
			name = Objects.requireNonNull(str2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(name);
		}
		
		try {
			name = Objects.requireNonNull(str2, "이름이 없습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(name);
		}
		
		try {
			name= Objects.requireNonNull(str2, ()->"이름이 없다."); //람다식 Supplier<String> msgSupplier
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(name);
		}
	}

}

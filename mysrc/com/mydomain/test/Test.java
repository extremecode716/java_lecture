package com.mydomain.test;

import java.lang.annotation.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface Def {
	int value();
}

class A {
	List<Integer> asd = new ArrayList<Integer>();
	public String name;

	public A(String _name) {
		this.name = _name;
	}

	protected A hi() {
		System.out.println("부모");
		return this;
	}

	protected A hi1() {
		System.out.println("부모1");
		return this;
	}
}

class B extends A {
	public int num = 0;

	public B(String _name, int _num) {
		super(_name);
		this.num = _num;
	}

	@Override
	public B hi() {
		System.out.println("자식");
		return this;
	}
}

class C extends B {
	public C(String _name, int _num) {
		super(_name, _num);
		this.hi1();
	}
}

class Box2<T> {
	public T aa;

	public void dd() {
	}
}


public class Test {
	String m_str = "hi";

	static void aaa(int... arg1) {

	}


	public static void main(String[] args) {
		
		Box2<Integer> bbb = new Box2<Integer>();
		bbb.aa = 50;
		System.out.println(bbb.aa);
		A a = new B("asd", 5);

		a.hi();
		Test asd1 = new Test();
		Test asd2 = new Test();
		String str = "asd";
		Integer asd = 101;
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		System.out.println("=============");
		System.out.println(asd.hashCode());
		System.out.println(System.identityHashCode(asd));
		System.out.println(asd1.hashCode());
		System.out.println(asd2.hashCode());
		System.out.println(System.identityHashCode(asd1));
		System.out.println("=============");
		System.out.println(str.toString());
		System.out.println(asd.toString());
		System.out.println(asd1.toString());
		System.out.println(asd2.toString());

		Object oasd = new Object();
		System.out.println(Integer.toHexString(oasd.hashCode()));
		System.out.println(oasd.toString());

		DecimalFormat df = new DecimalFormat("0");

		double num = 1234567.89;
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));

		aaa(new int[]{3, 2, 4, 2, 5});

		List<Integer> listA = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

		listA.add(5);
		listA.set(1, 10); // listA[1] = 10;
		for (Integer item : listA) {
			System.out.print(item + "\t");
		}

		Integer[] arrs = {5, -5, 8, 30, 9}; // 5칸인 정수 배열 생성
		Arrays.sort(arrs); // arrs를 오름차순 정렬
		// -5 5 8 9 30
		int iMin = arrs[0]; // iMin은 배열 첫번째 값 -5
		int iMax = arrs[arrs.length - 1]; // iMax는 배열 마지막 값 30

		System.out.println("Max Number : " + iMax); // 출력 Max = 30
		System.out.println("Min Number : " + iMin); // 출력 Min = -5

		String strasa = "가나다";
		String strasd1 = "hi";
		System.out.println(
				strasa.getBytes().length + "   " + strasd1.getBytes().length);

	}
}

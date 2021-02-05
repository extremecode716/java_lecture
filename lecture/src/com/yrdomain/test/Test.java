package com.yrdomain.test;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class A{
	List<Integer> asd = new ArrayList<Integer>();
	public String name;

	public A(String _name) {
		this.name = _name;
	}
	protected A hi() {
		System.out.println("부모");
		return this;
	}
}

class B extends A{
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

class Box2<T>{
	public T aa;
	
	public void dd() {}
}
public class Test {
	String m_str = "hi";

	static void aaa(int ...arg1) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<Integer> bbb = new Box2<Integer>();
		bbb.aa = 50;
		System.out.println(bbb.aa);
		A a = new B("asd",5);
		
		a.hi();
		Test asd1 = new Test();
		Test asd2 = new Test();
		String str="asd";
		Integer asd=101;
		System.out.println(str.hashCode());
		System.out.println(asd.hashCode());
		System.out.println(asd1.hashCode());
		System.out.println(asd2.hashCode());
		System.out.println(str.toString());
		System.out.println(asd.toString());
		System.out.println(asd1.toString());
		System.out.println(asd2.toString());
		
		Object oasd = new Object();
		System.out.println(Integer.toHexString(oasd.hashCode()) );
		System.out.println(oasd.toString());
			
		DecimalFormat df = new DecimalFormat("0");
		
		double num = 1234567.89;
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		

		aaa(new int[]{3,2,4,2,5});
		
		List<Integer> listA = new ArrayList<Integer>(Arrays.asList(1,2,3));

		listA.add(5);
		listA.set(1, 10); // listA[1] = 10; 
		for(Integer item : listA) {
			System.out.print(item + "\t");
		}
	}
}

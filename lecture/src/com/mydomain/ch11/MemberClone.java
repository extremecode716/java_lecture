package com.mydomain.ch11;

public class MemberClone implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public MemberClone(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public MemberClone getMember() {
		MemberClone cloned = null;

		try {
			cloned = (MemberClone) clone();
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
	}

	public static void main(String[] args) {
		//���� ��ü ����
		MemberClone original = new MemberClone("blue", "ȫ�浿", "12345", 25, true);
		
		//���� ��ü�� ���� �Ŀ� �н����� ����
		MemberClone cloned = original.getMember();
		cloned.password = "67890";	//���� ��ü���� �н����� ����.
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age: " + original.age);
		System.out.println("adult: " + original.adult);	
	}
}

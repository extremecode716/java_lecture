package com.yrdomain.classtest.a_package;

public class Parrent {
	public String m_strParrentPublic = "Parrent의 public 필드";
	protected String m_strParrentProtected = "Parrent의 protected 필드";
	String m_strParrentDefault = "Parrent의 default 필드";
	private String m_strParrentPrivate = "Parrent의 private 필드";

	public Parrent() {
		System.out.println("부모 생성자 호출");
	}

	public void methodParrentPublic() {
		System.out.println("Parrent의 public 메소드");
	}

	protected void methodParrentProtected() {
		System.out.println("Parrent의 protected 메소드");
	}

	void methodParrentDefault() {
		System.out.println("Parrent의 Default 메소드");
	}

	private void methodParrentPrivate() {
		System.out.println("Parrent의 private 메소드");
	}
}

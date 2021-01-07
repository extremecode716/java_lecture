package com.yrdomain.classTest.b_package;

import com.yrdomain.classTest.a_package.Parrent;

public class Child extends Parrent {
	//public String m_strParrentPublic = "Child의 오버라이딩된 public 필드";
	public String m_strChildPublic = "Child의 public 필드";
	protected String m_strChildProtected = "Child의 protected 필드";
	String m_strChildDefault = "Child의 default 필드";
	private String m_strChildPrivate = "Child의 private 필드";

	public Child() {
		System.out.println("자식 생성자 호출");
		System.out.println(m_strParrentPublic);
		System.out.println(m_strParrentProtected);
		// System.out.println(m_strParrentDefault); //에러
	}

	public void methodChildPublic() {
		System.out.println("Child의 public 메소드");
	}

	protected void methodChildProtected() {
		System.out.println("Child의 protected 메소드");
	}

	void methodChildDefault() {
		System.out.println("Child의 Default 메소드");
	}

	private void methodChildPrivate() {
		System.out.println("Child의 private 메소드");
	}

	@Override
	public void methodParrentPublic() {
		System.out.println("Child의 오버라이딩 public 메소드");
	}

	@Override
	public void methodParrentProtected() {
		System.out.println("Child의 오버라이딩 protected 메소드");
	}
	// 에러
//	@Override
//	public void methodParrentDefault() {
//		System.out.println("Child의 오버라이딩 Default 메소드");
//	}

}

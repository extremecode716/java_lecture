package com.yrdomain.classTest.b_package;

import com.yrdomain.classTest.a_package.Parrent;

public class Child extends Parrent {
	//public String m_strParrentPublic = "Child�� �������̵��� public �ʵ�";
	public String m_strChildPublic = "Child�� public �ʵ�";
	protected String m_strChildProtected = "Child�� protected �ʵ�";
	String m_strChildDefault = "Child�� default �ʵ�";
	private String m_strChildPrivate = "Child�� private �ʵ�";

	public Child() {
		System.out.println("�ڽ� ������ ȣ��");
		System.out.println(m_strParrentPublic);
		System.out.println(m_strParrentProtected);
		// System.out.println(m_strParrentDefault); //����
	}

	public void methodChildPublic() {
		System.out.println("Child�� public �޼ҵ�");
	}

	protected void methodChildProtected() {
		System.out.println("Child�� protected �޼ҵ�");
	}

	void methodChildDefault() {
		System.out.println("Child�� Default �޼ҵ�");
	}

	private void methodChildPrivate() {
		System.out.println("Child�� private �޼ҵ�");
	}

	@Override
	public void methodParrentPublic() {
		System.out.println("Child�� �������̵� public �޼ҵ�");
	}

	@Override
	public void methodParrentProtected() {
		System.out.println("Child�� �������̵� protected �޼ҵ�");
	}
	// ����
//	@Override
//	public void methodParrentDefault() {
//		System.out.println("Child�� �������̵� Default �޼ҵ�");
//	}

}

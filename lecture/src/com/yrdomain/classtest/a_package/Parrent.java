package com.yrdomain.classtest.a_package;

public class Parrent {
	public String m_strParrentPublic = "Parrent�� public �ʵ�";
	protected String m_strParrentProtected = "Parrent�� protected �ʵ�";
	String m_strParrentDefault = "Parrent�� default �ʵ�";
	private String m_strParrentPrivate = "Parrent�� private �ʵ�";

	public Parrent() {
		System.out.println("�θ� ������ ȣ��");
	}

	public void methodParrentPublic() {
		System.out.println("Parrent�� public �޼ҵ�");
	}

	protected void methodParrentProtected() {
		System.out.println("Parrent�� protected �޼ҵ�");
	}

	void methodParrentDefault() {
		System.out.println("Parrent�� Default �޼ҵ�");
	}

	private void methodParrentPrivate() {
		System.out.println("Parrent�� private �޼ҵ�");
	}
}

package com.yrdomain.classtest.b_package;

public class ChildOfChild extends Child{

	public ChildOfChild() {
		System.out.println("�ڽ��� �ڽ� ������ ȣ��");
	}

	@Override
	public void methodChildPublic() {
		// TODO Auto-generated method stub
		super.methodChildPublic();
	}

	@Override
	protected void methodChildProtected() {
		// TODO Auto-generated method stub
		super.methodChildProtected();
	}

	@Override
	void methodChildDefault() {
		// TODO Auto-generated method stub
		super.methodChildDefault();
	}

	@Override
	public void methodParrentPublic() {
		// TODO Auto-generated method stub
		super.methodParrentPublic();
		
		System.out.println("ChildOfChild�� �������̵� public �޼ҵ�");
	}

	@Override
	public void methodParrentProtected() {
		// TODO Auto-generated method stub
		super.methodParrentProtected();
	}
	
	
}

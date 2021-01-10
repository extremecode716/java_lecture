package com.yrdomain.classtest.b_package;

public class ChildOfChild extends Child{

	public ChildOfChild() {
		System.out.println("자식의 자식 생성자 호출");
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
		
		System.out.println("ChildOfChild의 오버라이딩 public 메소드");
	}

	@Override
	public void methodParrentProtected() {
		// TODO Auto-generated method stub
		super.methodParrentProtected();
	}
	
	
}

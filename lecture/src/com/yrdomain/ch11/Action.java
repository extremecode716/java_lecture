package com.yrdomain.ch11;

public interface Action {
	public void execute();
}

class SendAction implements Action{
	@Override
	public void execute() {
		System.out.println("�����͸� �����ϴ�.");
	}
}

class ReceiveAction implements Action{
	@Override
	public void execute() {
		System.out.println("�����͸� �޽��ϴ�.");
	}
}
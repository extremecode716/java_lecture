package com.mydomain.ch11;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = null;
		for(int i = 1; i <= 50; ++i) {
			counter = new Counter(i);
			
			counter = null;
			
			System.gc();
		}

	}

}

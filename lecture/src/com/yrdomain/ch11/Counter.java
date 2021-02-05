package com.yrdomain.ch11;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "¹ø °´Ã¼ÀÇ finalize()°¡ ½ÇÇàµÊ");
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

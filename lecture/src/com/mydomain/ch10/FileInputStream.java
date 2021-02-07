package com.mydomain.ch10;

public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception{
		System.out.println(file+ "을 닫습니다.");
	}
	
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
//			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}finally {
			System.out.println("finally");
		}
	}

}

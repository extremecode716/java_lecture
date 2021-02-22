package com.mydomain.p2021_02._18;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {

		// FileReader 객체 선언
		FileReader file = null;
		int inputValue = 0;
		String path = FileReaderTest.class.getResource("").getPath();
		try {
			// "data.txt" File과 stream 형성
			file = new FileReader(path + "data.txt");

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}

			// stream을 닫음
			file.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}// main() end
}

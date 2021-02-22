﻿package com.mydomain.p2021_02._18;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 */
		System.out.print("Input Data : ");

		try {// 입력한 한줄을 모두읽음.
			String inputString = br.readLine();
			System.out.println();
			System.out.println("Output String = " + inputString);
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}// main() end
}

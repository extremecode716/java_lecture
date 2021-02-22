package com.mydomain.p2021_02._18;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReadEx {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String inputDan = br.readLine();
			int dan = Integer.parseInt(inputDan);

			for (int i = 1; i <= 9; ++i) {
				System.out.println(dan + "*" + i + " = " + dan * i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

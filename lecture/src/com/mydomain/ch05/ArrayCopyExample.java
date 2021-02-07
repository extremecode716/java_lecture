package com.mydomain.ch05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = { "Java", "array", "copy" };
		String[] newStrArray = new String[5];

		// 얕은 복사(shallow copy)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; ++i) {
			System.out.print(newStrArray[i] + ", ");
		}

	}

}

package com.yrdomain.ch02;


/*
 * Byte.class // class�� �����ϵ� ���ϵ� �ٷ� Ȯ�� �����ϳ�.
 public final class Byte extends Number implements Comparable<Byte> {

    public static final byte   MIN_VALUE = -128;

	public static final byte   MAX_VALUE = 127;
 */
public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;

		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���");
		}
		else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}

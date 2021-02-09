package com.mydomain.test;

import java.lang.instrument.Instrumentation;

// 클래스를 컴파일 해서 JAR 안에 넣어야함.
// MANIFEST.MF 에 아래 내용 추가
// Premain-Class: ObjectSizeFetcher
class ObjectSizeFetcher {
	private static Instrumentation instrumentation;

	public static void premain(String args, Instrumentation inst) {
		instrumentation = inst;
	}

	public static long getObjectSize(Object o) {
		return instrumentation.getObjectSize(o);
	}
}
//
public class ObjectSizeEx {
	private int X;
	private int Y;
	public static void main(String[] args) {

		
		System.out.println(ObjectSizeFetcher.getObjectSize(new ObjectSizeEx()));
	}

}

package com.mydomain.test;

class MethodCallSpeedTest2 {
	public static long staticField = 0;

	public static long staticMethod() {
		return ++staticField;
	}

	public static void resetStaticField() {
		staticField = 0;
	}

	public long instanceField = 0;

	public void resetInstanceField() {
		instanceField = 0;
	}

	public long instanceMethod_staicField() {
		return ++staticField;
	}

	public long instanceMethod_instanceField() {
		return ++instanceField;
	}
}

public class MethodCallSpeedTest {

	public static long staticField = 0;

	public static long staticMethod() {
		return ++staticField;
	}

	public static void resetStaticField() {
		staticField = 0;
	}

	public long instanceField = 0;

	public void resetInstanceField() {
		instanceField = 0;
	}

	public long instanceMethod_staicField() {
		return ++staticField;
	}

	public long instanceMethod_instanceField() {
		return ++instanceField;
	}

	static final long MAX_VALUE = 100000000000L;

	public static void main(String[] args) {
		long lStartTime = 0;
		long lEndtTime = 0;
		double dDiffTime = 0;

//		lStartTime = System.nanoTime();
//		lEndtTime = System.nanoTime();
//		dDiffTime = (lEndtTime - lStartTime) / Math.pow(10, 9);

		MethodCallSpeedTest mcst = new MethodCallSpeedTest();
		MethodCallSpeedTest2 mcst2 = new MethodCallSpeedTest2();

		lStartTime = System.nanoTime();
		for (long i = 0; i < MAX_VALUE; ++i) {
			MethodCallSpeedTest.staticMethod();
			MethodCallSpeedTest2.staticMethod();
		}
		lEndtTime = System.nanoTime();
		dDiffTime = (lEndtTime - lStartTime) / Math.pow(10, 9);
		System.out.println("static 메소드 호출 속도( " + MAX_VALUE + " 회 ) " + dDiffTime + " 초");
		MethodCallSpeedTest.resetStaticField();
		mcst.resetInstanceField();
		MethodCallSpeedTest2.resetStaticField();
		mcst2.resetInstanceField();
		////////////////////////

		lStartTime = System.nanoTime();
		for (long i = 0; i < MAX_VALUE; ++i) {
			mcst.instanceMethod_staicField();
			mcst2.instanceMethod_staicField();
		}
		lEndtTime = System.nanoTime();
		dDiffTime = (lEndtTime - lStartTime) / Math.pow(10, 9);
		System.out.println("instanceMethod_staicField 호출 속도( " + MAX_VALUE + " 회 ) " + dDiffTime + " 초");
		MethodCallSpeedTest.resetStaticField();
		mcst.resetInstanceField();
		MethodCallSpeedTest2.resetStaticField();
		mcst2.resetInstanceField();

		lStartTime = System.nanoTime();
		for (long i = 0; i < MAX_VALUE; ++i) {
			mcst.instanceMethod_instanceField();
			mcst2.instanceMethod_instanceField();
		}
		lEndtTime = System.nanoTime();
		dDiffTime = (lEndtTime - lStartTime) / Math.pow(10, 9);
		System.out.println("instanceMethod_instanceField 호출 속도( " + MAX_VALUE + " 회 ) " + dDiffTime + " 초");
		MethodCallSpeedTest.resetStaticField();
		mcst.resetInstanceField();
		MethodCallSpeedTest2.resetStaticField();
		mcst2.resetInstanceField();

////////////////////////

		lStartTime = System.nanoTime();
		for (long i = 0; i < MAX_VALUE; ++i) {
			mcst.instanceMethod_staicField();
			mcst.instanceMethod_staicField();
		}
		lEndtTime = System.nanoTime();
		dDiffTime = (lEndtTime - lStartTime) / Math.pow(10, 9);
		System.out.println("레지스터 instanceMethod_staicField 호출 속도( " + MAX_VALUE + " 회 ) " + dDiffTime + " 초");
		MethodCallSpeedTest.resetStaticField();
		mcst.resetInstanceField();
		MethodCallSpeedTest2.resetStaticField();
		mcst2.resetInstanceField();

////////////////////////

		lStartTime = System.nanoTime();
		for (long i = 0; i < MAX_VALUE; ++i) {
			mcst.instanceMethod_instanceField();
			mcst.instanceMethod_instanceField();
		}
		lEndtTime = System.nanoTime();
		dDiffTime = (lEndtTime - lStartTime) / Math.pow(10, 9);
		System.out.println("레지스터 instanceMethod_instanceField 호출 속도( " + MAX_VALUE + " 회 ) " + dDiffTime + " 초");
		MethodCallSpeedTest.resetStaticField();
		mcst.resetInstanceField();
		MethodCallSpeedTest2.resetStaticField();
		mcst2.resetInstanceField();
	}
}

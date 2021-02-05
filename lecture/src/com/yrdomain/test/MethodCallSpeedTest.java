package com.yrdomain.test;

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
		System.out.println("static �޼ҵ� ȣ�� �ӵ�( " + MAX_VALUE + " ȸ ) " + dDiffTime + " ��");
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
		System.out.println("instanceMethod_staicField ȣ�� �ӵ�( " + MAX_VALUE + " ȸ ) " + dDiffTime + " ��");
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
		System.out.println("instanceMethod_instanceField ȣ�� �ӵ�( " + MAX_VALUE + " ȸ ) " + dDiffTime + " ��");
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
		System.out.println("�������� instanceMethod_staicField ȣ�� �ӵ�( " + MAX_VALUE + " ȸ ) " + dDiffTime + " ��");
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
		System.out.println("�������� instanceMethod_instanceField ȣ�� �ӵ�( " + MAX_VALUE + " ȸ ) " + dDiffTime + " ��");
		MethodCallSpeedTest.resetStaticField();
		mcst.resetInstanceField();
		MethodCallSpeedTest2.resetStaticField();
		mcst2.resetInstanceField();
	}
}

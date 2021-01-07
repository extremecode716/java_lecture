package com.yrdomain.classTest;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator("Extreme Brand");

		while (true) {
			if (!cal.run()) {
				cal.reset();
				break;
			}
		}

	}
}

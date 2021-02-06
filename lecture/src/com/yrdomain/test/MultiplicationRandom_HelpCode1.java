package com.yrdomain.test;

//코드 주석 설명 및 오류수정자 : ExtremeCode
public class MultiplicationRandom_HelpCode1 {

	public static void main(String[] args) {
		MultiplicationRandom_HelpCode1 test = new MultiplicationRandom_HelpCode1(); // MultiplicationRandom_HelpCode1객체를 생성해서 test 변수에 참조값으로 넣는다.
		int num1 = (int) (Math.random() * 8 + 2); // num1 은 2 <= num1 < 10 사이의 랜덤한 수를 가진다.
		int num2 = (int) (Math.random() * 8 + 2); // num2 은 2 <= num2 < 10 사이의 랜덤한 수를 가진다.

		while (num1 == num2) { // 반복문을 조건식 num1 == num2가 같으면 내부로직이 실행된다. // 서로 같은 단수를 출력하는 것을 막기 위해 하신 듯.
			num1 = (int) (Math.random() * 8 + 2); // num1 은 2 <= num1 < 10 사이의 랜덤한 수를 가진다.
													// num1 이 변경됨으로 while을 빠져나올수있다.
		} // while문 끝
		test.sys(num1, num2); // test의 sys메소드를 호출한다.
	}// main메서드 끝

	public void sys(int num1, int num2) {
		System.out.println("---- " + num1 + "단 ----"); // 출력문 num1 단

		for (int i = 1; i <= 9; i++) { // i는 1부터 시작해서 조건식 i<=9 검사하고 true이면 내부 로직 실행 false 이면 반복문 탈출
			System.out.println(num1 + " x " + i + " = " + num1 * i); // 출력 num1 x i = num1 * i;
		} // i의 값을 1증가 시키고, i <= 9; 조건식이 true이면 다시 내부로직 실행 false 이면 반복문 탈출

		System.out.println("---- " + num2 + "단 ----"); // 위랑 같은 조건으로 num2 단
		for (int i = 1; i <= 9; i++) {
			System.out.println(num2 + " x " + i + " = " + num2 * i);
		}
	}
}
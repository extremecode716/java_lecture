package com.yrdomain.ch04;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			//Enter input-> CR (캐리지리턴: 13)-> LF (라인피드: 10) 
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1.종속 | 2.감속 | 3.중지");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.print("선택: ");
			}

			System.out.println("11");
			keyCode = System.in.read(); // 키보드의 키를 읽음
			
			if(keyCode == 49) { //1
				++speed;
				System.out.println("현재 속도="+speed);
			}else if(keyCode == 50) { //2
				--speed;
				System.out.println("현재 속도="+speed);
			}else if(keyCode == 51) { //3
				run = false;
			}
			System.out.println("22");
		}
		
		System.out.println("프로그램 종료");
	}

}

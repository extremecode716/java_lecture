package com.yrdomain.ch04;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			//Enter input-> CR (ĳ��������: 13)-> LF (�����ǵ�: 10) 
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.print("����: ");
			}

			System.out.println("11");
			keyCode = System.in.read(); // Ű������ Ű�� ����
			
			if(keyCode == 49) { //1
				++speed;
				System.out.println("���� �ӵ�="+speed);
			}else if(keyCode == 50) { //2
				--speed;
				System.out.println("���� �ӵ�="+speed);
			}else if(keyCode == 51) { //3
				run = false;
			}
			System.out.println("22");
		}
		
		System.out.println("���α׷� ����");
	}

}

package com.yrdomain.ch06;

public class Car1 {
	// �ʵ�
	int gas;

	// ������

	// �޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLefGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas + ")");
				return;
			}
		}
	}

}

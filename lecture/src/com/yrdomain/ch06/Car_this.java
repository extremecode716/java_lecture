package com.yrdomain.ch06;

// �ٸ� �����ڸ� ȣ���ؼ� �ߺ� �ڵ� ���̱�
public class Car_this {
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	// ������
	Car_this() {

	}

	Car_this(String _model) {
		this(_model, "����", 250);
	}

	Car_this(String _model, String _color) {
		this(_model, _color, 250);
	}

	Car_this(String _model, String _color, int _maxSpeed) {
		this.model = _model;
		this.color = _color;
		this.maxSpeed = _maxSpeed;
	}
}

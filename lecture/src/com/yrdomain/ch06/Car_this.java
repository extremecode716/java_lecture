package com.yrdomain.ch06;

// 다른 생성자를 호출해서 중복 코드 줄이기
public class Car_this {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car_this() {

	}

	Car_this(String _model) {
		this(_model, "은색", 250);
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

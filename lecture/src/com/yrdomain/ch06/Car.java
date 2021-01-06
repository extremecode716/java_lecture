package com.yrdomain.ch06;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	// 생성자
	Car() {

	}

	Car(String _model) {
		this.model = _model;
	}

	Car(String _color, int _speed) {
		this.color = _color;
		this.speed = _speed;
	}

	Car(String _model, String _color) {
		this.model = _model;
		this.color = _color;
	}

	Car(String _model, String _color, int _maxSpeed) {
		this.model = _model;
		this.color = _color;
		this.maxSpeed = _maxSpeed;
	}
}

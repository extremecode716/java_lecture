package com.yrdomain.ch10;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog)
			@SuppressWarnings("unused")
			Dog dog = (Dog) animal;
		//}
	}
}

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}

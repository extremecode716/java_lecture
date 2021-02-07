package com.mydomain.ch11;

class Car{
	
}

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class<? extends Car> clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());		
		System.out.println(clazz1.getPackage());
		System.out.println(clazz1.getPackage().getName());

		try {
			Class<?> clazz2 = Class.forName("com.mydomain.ch11.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

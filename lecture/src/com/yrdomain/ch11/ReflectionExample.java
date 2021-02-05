package com.yrdomain.ch11;

import java.lang.reflect.*;

public class ReflectionExample {

	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("com.yrdomain.ch06.Car");

			System.out.println("[클래스 이름]");
			System.out.println(clazz.getName());
			System.out.println();

			System.out.println("[생성자 정보]");
			Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				System.out.print(constructor.getName() + "(");
				Class<?>[] parameters = constructor.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}

			System.out.println("[필드 정보]");
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field.getType().getSimpleName() + " " + field.getName());
			}
			System.out.println();
			
			System.out.println("[메소드 정보]");
			Method[] methods = clazz.getDeclaredMethods();
			for(Method method : methods) {
				System.out.print(method.getName() + "(");
				Class<?>[] parameters = method.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
			
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; ++i) {
			System.out.print(parameters[i].getSimpleName());
			if (i < (parameters.length - 1)) {
				System.out.print(",");
			}
		}
	}
}

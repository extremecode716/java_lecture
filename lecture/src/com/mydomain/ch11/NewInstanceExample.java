package com.mydomain.ch11;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("com.mydomain.ch11.ReceiveAction");
			@SuppressWarnings("deprecation")
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		int startNum = 1;
		startNum = ( startNum - startNum % 3);
		for (int i = startNum; i < 100; i += 3 - i % 3) {
			System.out.println(i);
		}
		
	}
}

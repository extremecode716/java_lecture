package com.yrdomain.ch11;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		// 개별 속성 읽기
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈디렉토리: " + userHome);
		
		System.out.println("-----------------------");
		System.out.println(" [ key ] value");
		System.out.println("-----------------------");
		
		// 모든 속성의 키와 값을 출력
		Properties props = System.getProperties();
		Set<?> keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[ " + key + " ]" + value);
			
		}

	}

}

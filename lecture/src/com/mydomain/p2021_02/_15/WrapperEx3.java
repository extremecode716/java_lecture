package com.mydomain.p2021_02._15;
// p530
// 자동박싱과 자동언박싱
public class WrapperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자동박싱                                   // 박싱 : Integer obj = new Integer(100);
		Integer obj = 100;			// 자동박싱
		System.out.println("언박싱:" + obj.intValue());	// 언박싱
		System.out.println("자동언박싱:" + obj);			// 자동언박싱
		
		// 자동 언박싱					// 언박싱 : int value = obj.intValue();
		int value = obj;			// 자동언박싱
		System.out.println("value:"+ value);
		
		// 자동 언박싱
		int result = obj + 100;
		System.out.println("result:"+ result);
	}

}

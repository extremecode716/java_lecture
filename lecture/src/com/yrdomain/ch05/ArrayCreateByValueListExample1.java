package com.yrdomain.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for(int i = 0; i<3; ++i) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ : " + sum);
		double avg = sum/3.0;
		System.out.printf("Æò±Õ : %.4f\n",avg);
		
	}

}

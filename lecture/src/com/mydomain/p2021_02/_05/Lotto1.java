package com.mydomain.p2021_02._05;

class Lotto1 {

	public static void main(String[] args) {

		int num[] = new int[6];

		for (int i = 0; i < num.length; i++){

			num[i] = (int) (Math.random() * 45) + 1;	
			
			 for (int j = 0; j < i; j++){	
				 if (num[i] == num[j]){
					i--;	
					break;
				}// if end
			 }// for end			

		}// for end

		for (int k = 0; k < num.length; k++){
			System.out.print(num[k] + "  ");
		}
	}
}


/*
난수 발생 공식
난수=(정수화)((상한값-하한값+1)* Math.random()+하한값)

*/
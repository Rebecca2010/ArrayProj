package com.revature.array;

public class ArrayProj {
	public static void main(String [] args) {
		int num [] = new int[10];
		int sum = 0;
		int i;
		
		num[0] = 10;
		num[1] = 11;
		num[2] = 12;
		num[3] = 13;
		num[4] = 14;
		num[5] = 15;
		num[6] = 16;
		num[7] = 17;
		num[8] = 18;
		num[9] = 19;
		
		for(int element : num) {
			System.out.println(element);
		
		
		}
	
		for (i = 0; i < num.length; i++)
			sum += num[i];
			System.out.println("Sum of array: " + sum);
			
			
					
		
		for (i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				System.out.println("Even numbers: " + num[i]);
			}
		}
		for (i = 0; i < num.length; i++) {
			if(num[i] % 2 != 0) {
				System.out.println("Odd numbers: " + num[i]);
			}
}
}
}
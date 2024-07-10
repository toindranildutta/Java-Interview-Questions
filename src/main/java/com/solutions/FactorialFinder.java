package com.solutions;

/*
 * 7. Factorial
 * Program to calculate and display the factorial of any given number.
 */

public class FactorialFinder {

	public static void main(String[] args) {
		
		System.out.println(findFactorial(-4)); 
	}

	private static int findFactorial(int num) {
		
		if(num <= 0) return 0;		// Checking if number is greater than 0
		
		int total = 1;
		for(int i=1; i<=num; i++) {
			total *= i;
		}
		return total;
	}

}

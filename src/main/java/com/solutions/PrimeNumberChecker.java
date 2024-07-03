package com.solutions;

/*
 * 2. Checking for prime number
 * Program to verify whether a given number is a prime or composite.
 */

public class PrimeNumberChecker {

	public static void main(String[] args) {
		isPrimeNumber(47);

	}

	private static void isPrimeNumber(int num) {
		int count = 2;

		if(num <= 1 ) {
			System.out.println("Please enter a valid number. Don't use 0, 1 or Negetive Numbers");
		} else {
			for(int i=2; i<=num/2; i++) {
				if(count>2) {
					System.out.println(num + " is not a prime number");
					break;
				} 
				if(num%i == 0) count++;
			}
			if(count<=2) System.out.println(num + " is a prime number");
		}
		
		
			
	}

}

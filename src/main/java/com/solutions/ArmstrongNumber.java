package com.solutions;

/*
 * Armstrong number
 * Program to verify whether a given number is an Armstrong number. 
 * An Armstrong number is equal to the sum of the cubes of its digits.
 * For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
 */

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(isArmstrongNumber(2466)); 

	}

	private static boolean isArmstrongNumber(int num) {
		int totalSum = 0;
		int number = num;
		while (number != 0) {
			int remainder = number%10;
			totalSum = totalSum + (remainder * remainder * remainder);
			number = number/10;
		}
		
		if(totalSum != num) {
			return false;
		} else {
			return true;
		}
		
	}

}

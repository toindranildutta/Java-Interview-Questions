package com.solutions;

/*
 * Integer palindrome
 * Program to verify whether a given integer is a palindrome or not.
 */

public class IntegerPalindromeChecker {

	public static void main(String[] args) {
		System.out.println(isIntegerPalindrome(1001)); 
	
	}

	private static boolean isIntegerPalindrome(Integer num) {
		if(num.SIZE == 0) return false;
		Integer reverseNumber = reverseNumber(num);	// reversing the number
		if(num != reverseNumber) return false;	// checking if the reverse and original number is same or not
		return true;	
	}
	
	private static Integer reverseNumber(Integer num) {
		
		int reverse = 0;
		
			while(num != 0) {
				Integer remainder = num%10;
				reverse = reverse * 10 + remainder;
				num = num/10;
			}
			
		return reverse;
	}

}

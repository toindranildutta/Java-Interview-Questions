package com.solutions;

/*
 * String palindrome
 * Program to verify whether a given string is a palindrome or not.
 * A string is a palindrome if it is equal to the reverse of itself.
 */
public class PalindromeChecker {

	public static void main(String[] args) {
		System.out.println(isPalindrome("maam"));	

	}

	private static boolean isPalindrome(String string) {
		if(string.isBlank() == false) {		// Check if input is empty or not
			for (int i = 0; i <= string.length()/2; i++) {
				 if(string.charAt(i) == string.charAt((string.length()-i)-1)) {
					 return true;
				 } else {
					 return false;
				 }
			}
		}
		return false;
	}

}

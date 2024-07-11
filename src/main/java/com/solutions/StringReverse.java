package com.solutions;

import java.util.ArrayList;

/*
 * 8. Reversing strings
 * Program to reverse the order of characters in any given string.
 */

public class StringReverse {

	public static void main(String[] args) {
		reverseString("indra");

	}

	private static void reverseString(String string) {
//		StringBuilder sb = new StringBuilder(string);		// Using stringbuilder/buffer methods
//		sb.reverse();
//		System.out.println(sb);
		
		char[] charArray = string.toCharArray();
		ArrayList<Character> reverseCharArray = new ArrayList<> ();
		for(int i=charArray.length -1; i>=0; i--) {
			reverseCharArray.add(charArray[i]);
		}
		
		for (Character character : reverseCharArray) {		// This is cheating but if you use stringbuilder its easy.
			System.out.print(character);					// Scenario is I can't use stringbuffer or builder
		}
	}

}

package com.solutions;

/*
 * 10. Printing patterns
 * Program to print a given pattern composed of ASCII characters. 
 * The solution is required to employ an effective algorithm, 
 * as opposed to directly printing the pattern as it is.
 */
public class PrintPattern {

	public static void main(String[] args) {
		
			printPattern("#", 10);
	}

	private static void printPattern(String string, int num) {
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(string);	
			}

			System.out.println();
		}
		
	}

}

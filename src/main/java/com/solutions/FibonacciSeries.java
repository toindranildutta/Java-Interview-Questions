package com.solutions;


/*
 * Fibonacci series ->
 * Program to display any given number of integers of the Fibonacci series.
 * In the Fibonacci series, each number is equal to the sum of the two numbers that precede it.
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		findFibonacchiSeriesResult(10);

	}

	private static void findFibonacchiSeriesResult(int num) {
		try {
				if(num != 0) {
					int a = 0;
					int b = 1;
					int total = 0;
					System.out.println("The Fibonacci series of the Positive value you provided will be:");
					for(int i=0; i<=Math.abs(num); i++) {
						total = a + b;
						b = a;
						a = total;
						System.out.print(total + " ");
					}
				} else {
					System.out.print("0");
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

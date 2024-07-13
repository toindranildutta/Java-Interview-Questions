package com.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * 9. Removing repeated elements from an array
 * Program to identify and remove all repeated elements from an array. 
 * Arrays could be of various types like integer, character or string.
 */

public class RemoveRepeatingElementFromArray {

	public static void main(String[] args) {
//		Integer[] listOfArray = {1,2,3,5,2,1};
//		String[] listOfArray = {"iam", "youare", "iam", "sheis" };
		Character[] listOfArray = { 'a', 'b', 'b', 'c' };
		removeRepeatingElements(listOfArray);	// Using method Overloading

	}
	// For Integer
	private static void removeRepeatingElements(Integer[] listOfArr) {
		HashSet<Integer> uniqueArr = new HashSet<>();
		for (int i : listOfArr) {
			uniqueArr.add(listOfArr[i]);
		}
		System.out.println(uniqueArr);

	}
	// For String
	private static void removeRepeatingElements(String[] listOfArr) {
		HashSet<String> uniqueArr = new HashSet<>();
		for (int i = 0; i < listOfArr.length; i++) {
			uniqueArr.add(listOfArr[i]);
		}
		System.out.println(uniqueArr);

	}
	// For Character
	private static void removeRepeatingElements(Character[] listOfArr) {
		HashSet<Character> uniqueArr = new HashSet<>();
		for(int i=0; i< listOfArr.length; i++) {
			uniqueArr.add(listOfArr[i]);
		}
		System.out.println(uniqueArr);

	}
}

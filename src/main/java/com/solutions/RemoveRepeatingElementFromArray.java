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
		Integer[] listOfArray = {1,2,3,5,2,1};
		removeRepeatingElements(listOfArray);

	}

	private static  void removeRepeatingElements(Integer[] listOfArr) {
		HashSet<Integer> uniqueArr = new HashSet<>();
		for(int i : listOfArr) {
			uniqueArr.add(listOfArr[i]);
		}
		System.out.println(uniqueArr);
		
	}

}

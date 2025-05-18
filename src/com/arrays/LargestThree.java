package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Largest Three Elements in an Array
 */

/*
 * Given an array arr[], the task is to find the top three largest distinct integers present in the array.
 * Note: If there are less than three distinct elements in the array, then return the available distinct numbers in descending order.
 */

public final class LargestThree {
	
	public static final int[] largestThree(List<Integer> arr) {
		int[] largestThree = {-1, -1, -1};
		for (Integer el : arr) {
			if (el.intValue() > largestThree[0]) {
				largestThree[2] = largestThree[1];
				largestThree[1] = largestThree[0];
				largestThree[0] = el.intValue();
			}
			else if (el.intValue() < largestThree[0] && el.intValue() > largestThree[1]) {
				largestThree[2] = largestThree[1];
				largestThree[1] = el.intValue();
			}
			
			else if (el.intValue() > largestThree[2]) {
				largestThree[2] = el.intValue();
			}
		}
		
		return largestThree;
		
	}

	public static void main(String[] args) {
		
		List<Integer> intArray = new ArrayList<Integer>(Arrays.asList(10, 4, 3, 50, 23, 90));
		System.out.println(Arrays.toString(largestThree(intArray)));

	}

}

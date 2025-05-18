package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Second Largest Element in an Array
 */

/*
 * Given an array of positive integers arr[] of size n, the task is to find
 * second largest distinct element in the array. Note: If the second largest
 * element does not exist, return -1.
 */

public final class SecondLargest {

	public static final int secondLargestElement(List<Integer> arr) {
		int largest = -1;
		int secondLargest = -1;

		for (Integer el : arr) {
			if (el.intValue() > largest) {
				secondLargest = largest;
				largest = el.intValue();
			} else if (el.intValue() < largest && el.intValue() > secondLargest) {
				secondLargest = el.intValue();
			}
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		List<Integer> intArray = new ArrayList<Integer>(Arrays.asList(12, 35, 1, 10, 34, 1));
		System.out.println(secondLargestElement(intArray));

	}

}

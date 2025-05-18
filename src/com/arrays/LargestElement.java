package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Largest Element in an Array
 */

/*
 * Given an array arr. The task is to find the largest element in the given
 * array.
 */

public final class LargestElement {

	public static final int largestElement(List<Integer> arr) {
		int max = arr.get(0);
		for (Integer el : arr) {
			if (el.intValue() > max) {
				max = el.intValue();
			}
		}

		return max;
	}

	public static void main(String[] args) {
		List<Integer> intArray = new ArrayList<Integer>(Arrays.asList(10, 20, 4));
		System.out.println(largestElement(intArray));
	}

}

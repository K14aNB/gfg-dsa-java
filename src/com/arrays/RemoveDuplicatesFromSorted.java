package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Remove duplicates from Sorted Array
 */

/*
 * Given a sorted array arr[] of size n, the goal is to rearrange the array so
 * that all distinct elements appear at the beginning in sorted order.
 * Additionally, return the length of this distinct sorted subarray. Note: The
 * elements after the distinct ones can be in any order and hold any value, as
 * they don't affect the result.
 */

public final class RemoveDuplicatesFromSorted {
	public static final List<Integer> removeDuplicates(List<Integer> arr) {
		List<Integer> distinctArr = new ArrayList<Integer>();
		for (int i = 0; i < arr.size() - 1; i++) {
			if (arr.get(i) == arr.get(i + 1) && !distinctArr.contains(arr.get(i))) {
				distinctArr.add(arr.get(i));
			} else if (!distinctArr.contains(arr.get(i))) {
				distinctArr.add(arr.get(i));
			}
		}
		if (!distinctArr.contains(arr.get(arr.size() - 1))) {
			distinctArr.add(arr.get(arr.size() - 1));
		}
		return distinctArr;
	}

	public static void main(String[] args) {
		List<Integer> intArr = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5));
		System.out.println(removeDuplicates(intArr));

	}

}

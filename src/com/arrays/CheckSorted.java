package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Check if an Array is Sorted
 */

/*
 * Given an array of size n, the task is to check if it is sorted in ascending
 * order or not. Equal values are allowed in an array and two consecutive equal
 * values are considered sorted.
 */

public final class CheckSorted {

	public static final boolean checkSorted(List<Integer> arr) {
		for (int i = 0; i < arr.size() - 1; i++) {
			if (arr.get(i) > arr.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		List<Integer> intArr = new ArrayList<Integer>(Arrays.asList(20, 20, 78, 98, 99, 97));
		System.out.println(checkSorted(intArr));
	}

}

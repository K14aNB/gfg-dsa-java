package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Leaders in an Array
 */

/*
 * Given an array arr[] of size n, the task is to find all the Leaders in the
 * array. An element is a Leader if it is greater than or equal to all the
 * elements to its right side. Note: The rightmost element is always a leader
 */

public final class Leaders {
	public static final List<Integer> leaders(List<Integer> arr) {
		List<Integer> leaderArr = new ArrayList<Integer>();
		leaderArr.add(arr.get(arr.size() - 1));
		int max = arr.get(arr.size() - 1);
		for (int i = arr.size() - 2; i >= 0; i--) {
			if (arr.get(i) > max) {
				max = arr.get(i);
				leaderArr.add(max);
			}
		}

		Collections.reverse(leaderArr);
		return leaderArr;
	}

	public static void main(String[] args) {
		List<Integer> intArr = new ArrayList<Integer>(Arrays.asList(16, 17, 4, 3, 5, 2));
		System.out.println(leaders(intArr));
	}

}

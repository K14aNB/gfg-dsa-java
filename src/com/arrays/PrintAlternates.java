package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print Alternates
 */

/*
 * Given an array, the task is to print every alternate element of the array
 * starting from the first element.
 */

public final class PrintAlternates {

	public static final List<Integer> printAlternates(List<Integer> arr) {
		List<Integer> altArr = new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); i += 2) {
			altArr.add(arr.get(i));
		}
		return altArr;
	}

	public static void main(String[] args) {
		List<Integer> intArray1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(printAlternates(intArray1));
	}

}

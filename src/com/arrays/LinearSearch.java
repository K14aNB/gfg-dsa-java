package com.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Linear Search
 */

/*
 * Given an array, arr of n integers, and an integer element x, find whether
 * element x is present in the array. Return the index of the first occurrence
 * of x in the array, or -1 if it doesn't exist.
 */

public final class LinearSearch {

	public static final int linearSearch(List<Integer> arr, int x) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).equals(x)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		List<Integer> intArray2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to search:");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println(linearSearch(intArray2, number));
	}

}

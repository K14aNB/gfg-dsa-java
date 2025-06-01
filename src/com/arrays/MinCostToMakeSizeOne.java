package com.arrays;

public class MinCostToMakeSizeOne {
	public static final int minimumCostToMakeSizeOne(int[] arr) {
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return (arr.length - 1) * min;
	}

	public static void main(String[] args) {
		int[] arr = {4, 3, 2};
		System.out.println(minimumCostToMakeSizeOne(arr));

	}

}

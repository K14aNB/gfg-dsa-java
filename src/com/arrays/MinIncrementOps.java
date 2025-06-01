package com.arrays;

public class MinIncrementOps {
	
	public static final int minOps(int[] arr, int k) {
		int max = 0;
		int res = 0;

		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if ((max - arr[i]) % k != 0) 
				return -1;
			else
				res += (max - arr[i]) / k;

		}
		return res;
	}
	
	
	

	public static void main(String[] args) {
		int arr[] = {21, 33, 9, 45, 63};
		System.out.println(minOps(arr, 6));

	}

}

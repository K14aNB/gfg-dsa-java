package com.arrays;

import java.util.Arrays;

public class ZerosToEnd {
	
	public static final void pushZerosToEnd(int[] arr) {
		int count = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		pushZerosToEnd(arr);
	}

}

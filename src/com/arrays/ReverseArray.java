package com.arrays;

import java.util.Arrays;

public class ReverseArray {
	
	public static final void reverseArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int temp = 0;
		System.out.println("Before Reversing" +Arrays.toString(arr));
		
		while (left < right) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		System.out.println("After Reversing" +Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		reverseArray(array);

	}

}

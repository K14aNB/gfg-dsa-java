package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReverseArrays {
public static int[] reverse(int[] arrayNum) {
    int left = 0;
    int right = arrayNum.length - 1;
    for (int i = 0; i < arrayNum.length; i++) {
        if (left < right) {
            int temp = arrayNum[left];
            arrayNum[left++] = arrayNum[right];
            arrayNum[right--] = temp;
        }
    }
    return arrayNum;
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputLine = scanner.nextLine();
    int[] arrayNum = Stream.of(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    System.out.println(Arrays.toString(reverse(arrayNum)));
    }
}

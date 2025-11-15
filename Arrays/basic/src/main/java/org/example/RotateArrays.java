package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class RotateArrays {
    public static int[] rotate(int[] arrayNum, int b) {

        reverse(arrayNum, 0, arrayNum.length - 1);

        reverse(arrayNum, 0, b - 1);

        reverse(arrayNum, b, arrayNum.length - 1);

        return arrayNum;

    }

    public static void reverse(int[] arrayNum, int left, int right) {
        while (left < right) {
            int temp = arrayNum[left];
            arrayNum[left++] = arrayNum[right];
            arrayNum[right--] = temp;
        }
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputLine = scanner.nextLine();
    int[] arrayNum = Stream.of(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    System.out.println(Arrays.toString(rotate(arrayNum, 2)));
    }
}

package org.example;

import java.util.Scanner;
import java.util.stream.Stream;

public class CheckSortedAscendingOrderArray {
    public static boolean checkSortedAscendingOrder(int[] arrayNum) {
        int min = arrayNum[0];
        for (int i = 1; i < arrayNum.length; i++) {
            if (arrayNum[i] < min) {
                return false;
            } else {
                min = arrayNum[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int[] arrayNum = Stream.of(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(checkSortedAscendingOrder(arrayNum));
    }
}

package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MinimumIncrementsToEqual {
    public static int minIncrementsPossible(int[] arrayNum, int k) {
        int res = 0;
        int max = Arrays.stream(arrayNum).max().getAsInt();
        for (int num : arrayNum) {
            if ((max - num) % k != 0) {
                return -1;
            } else {
                res += (max - num) / k;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int[] arrayNum = Stream.of(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int k = scanner.nextInt();
        System.out.println(minIncrementsPossible(arrayNum, k));
    }
}

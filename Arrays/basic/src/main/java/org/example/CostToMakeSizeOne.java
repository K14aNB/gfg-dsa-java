package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class CostToMakeSizeOne {
    public static int cost(int[] arrayNum) {
        return (arrayNum.length - 1) * Arrays.stream(arrayNum).min().getAsInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int[] arrayNum = Stream.of(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(cost(arrayNum));
    }
}

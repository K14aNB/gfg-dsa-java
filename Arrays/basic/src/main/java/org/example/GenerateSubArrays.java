package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class GenerateSubArrays {

    public static List<List<Integer>> generateSubArrays(int[] arrayNum) {
        List<List<Integer>> subArrays = new ArrayList<>();
        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = i; j < arrayNum.length; j++) {
                List<Integer> subArray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subArray.add(arrayNum[k]);
                }
                subArrays.add(subArray);
            }
        }
        return subArrays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int[] arrayNum = Stream.of(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(generateSubArrays(arrayNum));

    }
}

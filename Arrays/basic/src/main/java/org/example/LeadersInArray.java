package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class LeadersInArray {
    public static List<Integer> findLeaders(int[] arrayNum) {
        List<Integer> result = new ArrayList<>();
        int max = arrayNum[arrayNum.length - 1];
        result.add(max);
        for (int i = arrayNum.length - 2; i >= 0; i--) {
            if (arrayNum[i] >= max) {
                max = arrayNum[i];
                result.add(max);
            }
        }
        return result.reversed();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int[] arrayNum = Stream.of(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(findLeaders(arrayNum));
    }
}

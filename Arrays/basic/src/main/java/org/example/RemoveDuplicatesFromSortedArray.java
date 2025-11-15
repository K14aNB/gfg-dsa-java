package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesFromSortedArray {
    public static List<Integer> removeDuplicatesUsingStreams(List<Integer> arrayNum) {
        return arrayNum.stream().distinct().toList(); // O(n) time and space complexity
    }

    public static List<Integer> removeDuplicates(List<Integer> arrayNum) {
        int current_idx = 1;
        for (int i = 1; i < arrayNum.size(); i++) {
            if (arrayNum.get(i) != arrayNum.get(i - 1)) {
                arrayNum.set(current_idx++, arrayNum.get(i));
            }
        }
        return arrayNum.subList(0, current_idx);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newLine = scanner.nextLine();
        List<Integer> arrayNum = Stream.of(newLine.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(removeDuplicatesUsingStreams(arrayNum));
        System.out.println(removeDuplicates(arrayNum));
    }
}

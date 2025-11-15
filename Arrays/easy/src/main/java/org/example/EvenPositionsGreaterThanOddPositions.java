package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenPositionsGreaterThanOddPositions {
    public static List<Integer> rearrangeArray(List<Integer> arrayNum) {
        int size = arrayNum.size();
        Collections.sort(arrayNum);
        List<Integer> result = new ArrayList<Integer>(Collections.nCopies(size, 0));
        int ptrLeft = 0, ptrRight = arrayNum.size() - 1;
        for (int i = 0; i < arrayNum.size(); i++) {
            if (i % 2 == 0) {
                result.set(i, arrayNum.get(ptrRight--));
            } else {
                result.set(i, arrayNum.get(ptrLeft++));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        List<Integer> arrayNum = Stream.of(inputLine.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(rearrangeArray(arrayNum));
    }
}

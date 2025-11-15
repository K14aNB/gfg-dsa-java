package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintAlternates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int[] arrayNum = Stream.of(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(IntStream.range(0, arrayNum.length).filter(index -> index % 2 == 0).mapToObj(index -> arrayNum[index]).toArray()));

    }
}

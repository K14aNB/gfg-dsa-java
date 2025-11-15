package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ZerosToEnd {

    public static int[] pushZeroesToEnd(int[] arrayNum) {
        int count = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] != 0) {
                int temp = arrayNum[i];
                arrayNum[i] = arrayNum[count];
                arrayNum[count++] = temp;
            }
        }
        return arrayNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int[] arrayNum = Stream.of(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(pushZeroesToEnd(arrayNum)));
    }
}

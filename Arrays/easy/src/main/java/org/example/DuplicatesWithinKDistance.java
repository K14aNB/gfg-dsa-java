package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class DuplicatesWithinKDistance {

    public static boolean checkDuplicates(int[] arrayNum, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arrayNum.length; i++) {
            if (set.contains(arrayNum[i])) {
                return true;
            }
            set.add(arrayNum[i]);
            if (i >= k) {
                set.remove(arrayNum[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int[] arrayNum = Stream.of(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(checkDuplicates(arrayNum, 3));
    }
}

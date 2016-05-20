package com.hackerrank.daysofcode;

import java.util.Scanner;

/**
 * Created by Jurel on 5/19/2016.
 */
public class LetsReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            String str = sc.next();
            divideConquer(str);
        }
    }

    private static void divideConquer(String s) {
        StringBuilder evenStr = new StringBuilder(), oddStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                evenStr.append(s.charAt(i));
            } else {
                oddStr.append(s.charAt(i));
            }
        }

        System.out.printf("%s %s%n", evenStr.toString(), oddStr.toString());
    }
}

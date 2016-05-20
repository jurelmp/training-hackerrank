package com.hackerrank.daysofcode;

import java.util.Scanner;

/**
 * Created by Jurel on 5/6/2016.
 */
public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d x %d = %d%n", N, i, (N * i));
        }
    }
}

package com.hackerrank.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by Jurel on 7/15/2016.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int sumA = 0, sumB = 0, diff = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            //System.out.println(a[i][i]);
            sumA += a[i][i];
        }

        int x = 0, y = n - 1;
        while (x < n && y >= 0) {
            //System.out.println(a[x][y]);
            sumB += a[x][y];
            --y;
            ++x;
        }

        diff = sumA - sumB;
        //System.out.println(sumA);
        //System.out.println(sumB);
        System.out.println(Math.abs(diff));
    }
}

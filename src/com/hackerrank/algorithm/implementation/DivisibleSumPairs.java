package com.hackerrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Created by Jurel on 7/15/2016.
 */
public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int counter = 0;*/

        int n = 2;
        int k = 2;
        int[] a = {8,10};
        int counter=  0;

        /*for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }*/

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (j != i) {
                    if ((a[i] + a[j]) % k == 0 && i < j)
                        ++counter;
                }
            }
        }

        System.out.println(counter);
    }
}

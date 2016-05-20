package com.hackerrank;

import java.util.Scanner;

/**
 * Created by Jurel on 4/29/2016.
 */
public class JavaLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int[] a = new int[testCase];
        int[] b = new int[testCase];
        int[] n = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < testCase; i++) {
            for (int j = 0; j < n[i]; j++) {
                int sum = a[i];

                for (int k = 0; k <= j; k++) {
                    sum += Math.pow(2, k) * b[i];
                }
                System.out.print(sum + " ");
            }
            System.out.println("");
        }

        sc.close();
    }
}

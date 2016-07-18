package com.hackerrank.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by Jurel on 7/15/2016.
 */
public class CompareTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();*/

        int[] a = new int[3];
        int[] b = new int[3];
        int pointA = 0, pointB = 0;

        setValues(a, in);
        setValues(b, in);

        for (int i = 0; i < a.length; i++) {
            if ((a[i] > 0 && a[i] <= 100) && (b[i] > 0 && b[i] <= 100)) {
                if (a[i] > b[i])
                    ++pointA;
                else if (a[i] < b[i])
                    ++pointB;
            }
        }
        System.out.println(pointA + " " + pointB);
    }

    static void setValues(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

}

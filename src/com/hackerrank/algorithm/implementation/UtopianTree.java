package com.hackerrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Created by Jurel on 7/15/2016.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int h = 1;
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                if (j % 2 == 0)
                    h = h * 2;
                else
                    h += 1;
            }
            System.out.println(h);
        }
    }
}

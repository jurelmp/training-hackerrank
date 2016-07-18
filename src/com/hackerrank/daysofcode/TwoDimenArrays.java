package com.hackerrank.daysofcode;

import java.util.*;

/**
 * Created by Jurel on 7/1/2016.
 */
public class TwoDimenArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[6][6];
        int max = 0;
        int[] sum = new int[(arr.length - 2) * (arr.length - 2)];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int index = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                //System.out.printf("%d, %d, %d, %d, %d, %d, %d\n", arr[i][j], arr[i][j+1], arr[i][j+2], arr[i+1][j+1], arr[i+2][j], arr[i+2][j+1], arr[i+2][j+2]);
                int temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                /*if (max > temp) {
                    max = temp;
                }
                if (max <= temp) {
                    max = temp;
                }*/
                sum[index] = temp;
                index++;
            }
        }
        java.util.Arrays.sort(sum);
        System.out.println(sum[sum.length - 1]);
    }
}

package com.hackerrank;

import java.util.Scanner;

/**
 * Created by Jurel on 4/29/2016.
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String[] strList = new String[3];
        int[] intList = new int[3];*/

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            /*strList[i] = s1;
            intList[i] = x;*/
            System.out.printf("%-15s%03d%n", s1, x);
        }

        /*for (int i = 0; i < 3; i++) {
            System.out.printf("%-14s %03d%n", strList[i], intList[i]);
        }*/

        System.out.println("================================");
    }
}

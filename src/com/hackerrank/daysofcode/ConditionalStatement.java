package com.hackerrank.daysofcode;

import java.util.Scanner;

/**
 * Created by Jurel on 5/6/2016.
 */
public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if (n > 2 && n < 5) {
                ans = "Not Weird";
            } else if (n > 6 && n < 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}

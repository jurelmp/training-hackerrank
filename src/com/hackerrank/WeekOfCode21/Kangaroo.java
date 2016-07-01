package com.hackerrank.WeekOfCode21;

import java.util.Scanner;

/**
 * Created by Jurel on 7/1/2016.
 */
public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean flag = false;

        while ((x1 <= 10000) && (x2 <= 10000)) {
            if (x1 == x2) {
                flag = true;
                break;
            }
            x1 += v1;
            x2 += v2;
        }
        System.out.println( (flag) ? "YES" : "NO" );
    }


}

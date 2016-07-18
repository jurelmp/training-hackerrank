package com.hackerrank.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by Jurel on 7/15/2016.
 */
public class SavePrisoner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            if (T != 0) {
                int noOfPrisoner = in.nextInt();
                int noOfSweets = in.nextInt();
                int startingID = in.nextInt();

                int id = (startingID + noOfSweets - 1) % noOfPrisoner;

                if (id == 0)
                    System.out.println(noOfPrisoner);
                else
                    System.out.println(id);
            }
        }
    }
}

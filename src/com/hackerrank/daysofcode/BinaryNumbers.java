package com.hackerrank.daysofcode;

import java.util.Scanner;

/**
 * Created by Jurel on 7/1/2016.
 */
public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int rem = 0;*/
        int n = in.nextInt();

        /*while (n > 0) {
            rem = n % 2;
            n = n / 2;
            System.out.println(n + "=" + rem);
        }*/
        System.out.println(convertToBinary(n) + "=" + numberOfConsecutiveOnes(convertToBinary(n)));
    }

    static String convertToBinary(int num) {
        StringBuilder sb = new StringBuilder();
        int rem;
        while (num > 0) {
            rem = num % 2;
            num = num / 2;
            //System.out.println(num + "=" + rem);
            sb.append(rem);
        }
        return sb.reverse().toString();
    }

    static int numberOfConsecutiveOnes(String str) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if ('1' == str.charAt(i)) {
                count++;
            } else {
                count = 0;
            }

            if (max < count) {
                max = count;
            }
        }

        return max;
    }
}

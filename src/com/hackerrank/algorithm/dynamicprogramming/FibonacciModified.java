package com.hackerrank.algorithm.dynamicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Jurel on 7/15/2016.
 */
public class FibonacciModified {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger num1 = in.nextBigInteger();
        BigInteger num2 = in.nextBigInteger();
        int n = in.nextInt();

        BigInteger result = fib(num1, num2, n);
        System.out.println(result);
    }

    static BigInteger fib(BigInteger num1, BigInteger num2, int num) {
        num = num - 1;

        if (num == 1)
            return num2;

        return fib(num2, num2.pow(2).add(num1), num);
    }
}

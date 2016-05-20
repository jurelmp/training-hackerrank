package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Jurel on 4/29/2016.
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);

        BigInteger bigSum = bigNum1.add(bigNum2);
        BigInteger bigProd = bigNum1.multiply(bigNum2);

        System.out.println(bigSum);
        System.out.println(bigProd);
    }
}

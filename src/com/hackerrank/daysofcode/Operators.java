package com.hackerrank.daysofcode;

import java.util.Scanner;

/**
 * Created by Jurel on 5/6/2016.
 */
public class Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double tip = mealCost * ((double) tipPercent / 100);
        double tax = mealCost * ((double) taxPercent / 100);
        double cost = mealCost + tip + tax;
        int totalCost = (int) Math.round(cost);

        System.out.printf("The total meal cost is %d dollars.", totalCost);

    }
}

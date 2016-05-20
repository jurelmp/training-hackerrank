package com.hackerrank;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Jurel on 5/20/2016.
 */
public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedSet<String> list = new TreeSet<>();
        String str = sc.next();
        int k = sc.nextInt();

        for (int i = 0; i <= str.length() - k; i++) {
            list.add(str.substring(i, i + k));
        }

        System.out.println(list.first());
        System.out.println(list.last());
    }
}

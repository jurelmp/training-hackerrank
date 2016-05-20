package com.hackerrank.daysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Jurel on 5/19/2016.
 */
public class DictionaryMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map phoneBook = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.printf("%s=%d%n", s, phoneBook.get(s));
            } else {
                System.out.printf("Not found%n");
            }
        }
        in.close();
    }
}

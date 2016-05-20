package com.hackerrank.daysofcode;

import java.util.Scanner;

/**
 * Created by Jurel on 5/6/2016.
 */
public class ClassInstance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        this.age = initialAge;
    }

    public void amIOld() {
        String str;
        if (age < 13) {
            str = "You are young.";
        } else if (age >= 13 && age < 18) {
            str = "You are a teenager.";
        } else {
            str = "You are old.";
        }
        System.out.println(str);
    }

    public void yearPasses() {
        this.age++;
    }
}

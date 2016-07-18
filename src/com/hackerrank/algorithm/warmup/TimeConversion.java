package com.hackerrank.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by Jurel on 7/15/2016.
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        boolean isAM = false;
        int hour;
        String temp = "";
        String[] timeArr = time.split(":");
        hour = Integer.parseInt(timeArr[0]);

        if (hour >= 0 && hour <= 23) {
            isAM = timeArr[timeArr.length - 1].contains("AM");

            if (!isAM) {
                hour = (hour == 12)? hour: hour + 12;
                time = time.replace(timeArr[0], String.valueOf(hour));
            } else {
                temp = (hour == 12)? String.format("%02d", 0): String.format("%02d", (int) hour);
                time = time.replace(timeArr[0], temp);
            }

            time = (isAM) ? time.replace("AM", ""): time.replace("PM", "");
        }

        System.out.println(time);
    }
}

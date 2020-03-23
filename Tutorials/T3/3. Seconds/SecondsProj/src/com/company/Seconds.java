package com.company;

import java.util.*;

public class Seconds {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int input = 0, hours = 0, minutes = 0, seconds = 0;

        System.out.println("Type in the number of seconds : ");
        input = kybd.nextInt();
        seconds = input;

        hours = seconds / 3600;
        seconds -= (hours * 3600);

        minutes = seconds / 60;
        seconds -= (minutes * 60);

        System.out.printf("%-8s %-8s %-8s %-8s\n", "Input", "Hours", "Minutes", "Seconds");
        System.out.printf("%-12s %-10s %-7s %-8s\n", input, hours, minutes, seconds);
    }
}

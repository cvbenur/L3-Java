package com.company;

import java.util.*;

public class Factorial {

    private static long calculateFactorial(int n) {

        long r=1;

        for (int i=1; i < n+1; i++)
            r *= i;

        return r;
    }


    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.printf("Type in a number: ");
        int n = kybd.nextInt();

        System.out.println(n + "! = " + Factorial.calculateFactorial(n));
    }
}

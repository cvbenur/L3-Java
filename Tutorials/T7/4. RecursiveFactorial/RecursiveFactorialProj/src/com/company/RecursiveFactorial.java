package com.company;

import java.util.*;

public class RecursiveFactorial {

    public static long calculateFactorial(int n) {

        if (n >= 1)
            return n * calculateFactorial(n-1);
        else
            return 1;
    }


    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.printf("Type in a number: ");
        int n = kybd.nextInt();

        System.out.println(n + "! = " + RecursiveFactorial.calculateFactorial(n));
    }
}

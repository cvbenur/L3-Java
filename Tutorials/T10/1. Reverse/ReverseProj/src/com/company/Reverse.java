package com.company;

import java.util.*;

public class Reverse {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int[] a = new int[10];

        for (int i=0; i<10; i++) {
            System.out.printf("Type in a number (" + (i+1) + "/10) : ");

            a[i] = kybd.nextInt();
        }


        System.out.println("\nPrinting in reverse order :");
        for (int i=10; i>0; i--)
            System.out.println("Nbr " + (i) + "/10 : " + a[i-1]);
    }
}

package com.company;

import java.util.*;

public class SmallestInArray {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int[] a = new int[10];


        for (int i=0; i<10; i++) {
            System.out.printf("Type in a number (" + (i+1) + "/10) : ");
            a[i] = kybd.nextInt();
        }


        int min=a[0], index=0;
        for (int i=1; i<10; i++) {

            if (a[i] < min) {
                min = a[i];
                index = i;
            }
        }

        System.out.println("\nThe smallest number in the array is : " + min + ", at index " + index +" (slot " + (index+1) + ").");
    }
}

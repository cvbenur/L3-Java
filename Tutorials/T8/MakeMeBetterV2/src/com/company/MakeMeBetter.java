package com.company;

import java.util.Scanner;

public class MakeMeBetter {

    public static void main(String[] args) {

        int[] a = new int[4];
        Scanner b = new Scanner(System.in);

        System.out.println("Please input 4 numbers in the range 1-19 :");


        for (int i=0; i<4; i++) {

            do {
                System.out.printf("Type in a number (" + (i+1) + "/4) : ");
                a[i] = b.nextInt();

                if (a[i] < 1 || a[i] > 19)
                    System.out.println("Not in the range 1-19, please try again :> ");
            } while (a[i] < 1 || a[i] > 19);
        }


        System.out.println("\nThe numbers you input :");
        for (int i=0; i<4; i++)
            System.out.println("Nbr " + (i+1) + "/10) : " + a[i]);


        double m = a[0];
        if (a[1] < m) {
            m = a[1];
        }
        if (a[2] < m) {
            m = a[2];
        }
        if (a[3] < m) {
            m = a[3];
        }


        double x = a[0];
        if (a[1] > x) {
            x = a[1];
        }
        if (a[2] > x) {
            x = a[2];
        }
        if (a[3] > x) {
            x = a[3];
        }


        System.out.println("\nThe minimum number is: " + m);
        System.out.println("The maximum number is: " + x);
        System.out.println("The average value is: " + ((double) (a[0] + a[1] + a[2] + a[3]) / 4));
    }
}

package com.company;

import java.util.*;

public class AllEven {

    // read() method
    private static int[] read(Scanner kybd, int n) {
        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Type in a number (" + (i+1) + "/" + n + ") : ");
            a[i] = kybd.nextInt();
        }

        return a;
    }

    // getEven() method
    private static int[] getEven(int[] a, int even) {
        int[] ev = new int[even];
        int j=0;

        for (int i=0; i<a.length; i++) {
            if (a[i] % 2 == 0 || a[i] == 0) {
                ev[j] = a[i];
                j++;
            }
        }

        return ev;
    }

    // print() method
    private static void print(int[] a) {
        for (int i=0; i<a.length; i++)
            System.out.println("Number " + (i+1) + "/" + a.length + " : " + a[i]);
    }



    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.printf("Type in the number of integers you want to put in the array : ");
        int n = kybd.nextInt();

        if (n <= 0)
            System.out.println("\nNo numbers to input.\nExiting program.");
        else {
            int[] a = new int[n];
            int even=0;

            a = AllEven.read(kybd, n);

            for (int i=0; i<a.length; i++) {
                if (a[i] % 2 == 0 || a[i] == 0)
                    even++;
            }

            if (even == 0)
                System.out.println("\nNo even numbers in this array.\nExiting program.");
            else {
                int[] ev = new int[even];

                ev = AllEven.getEven(a, even);

                System.out.println("\nPrinting the even numbers in the array :");
                AllEven.print(ev);
            }
        }
    }
}

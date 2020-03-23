package com.company;

import java.util.*;

public class Smallest4 {

    private static int smaller(int n, int m) {

        if (n > m)
            return m;
        else
            return n;
    }


    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);
        int n1=0, n2=0;

        for (int i=0; i < 4; i++) {

            System.out.printf("Type in a number (" + (i+1) + "): ");
            n1 = kybd.nextInt();

            if (i == 0)
                n2 = n1;

            n2 = Smallest4.smaller(n1, n2);
        }

        System.out.println("The smallest number is: " + n2);
    }
}

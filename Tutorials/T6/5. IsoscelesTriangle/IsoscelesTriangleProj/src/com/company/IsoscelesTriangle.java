package com.company;

import java.util.*;

public class IsoscelesTriangle {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int rows=0;

        System.out.printf("Type in the number of rows : ");
        rows = kybd.nextInt();

        System.out.printf("\n");
        for (int i=0; i<rows; i++) {

            for (int j=0; j<i; j++)
                System.out.printf(" ");

            for (int j=0; j<rows-i; j++) {
                System.out.printf("*");

                if (j < rows-1)
                    System.out.printf(" ");
            }

            System.out.printf("\n");
        }
    }
}

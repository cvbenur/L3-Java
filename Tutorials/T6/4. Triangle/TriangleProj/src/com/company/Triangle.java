package com.company;

import java.util.*;

public class Triangle {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.printf("Type in the number of rows : ");
        int rows = kybd.nextInt();

        System.out.printf("\n");
        for (int i=0; i<rows; i++) {

            for (int j=0; j<i+1; j++)
                System.out.printf("*");

            System.out.printf("\n");
        }
    }
}

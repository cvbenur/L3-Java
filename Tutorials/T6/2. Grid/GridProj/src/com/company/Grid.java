package com.company;

import java.util.*;

public class Grid {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int width=0, height=0;

        System.out.printf("Type in the width of the grid : ");
        width = kybd.nextInt();

        System.out.printf("Type in the height of the grid : ");
        height = kybd.nextInt();

        System.out.printf("\n");
        for (int i=0; i < height; i++) {

            for (int j=0; j < width; j++)
                System.out.printf("*");

            System.out.printf("\n");
        }
    }
}

package com.company;

import java.lang.Math;

public class DiceMatchAnalysis {

    public static void main(String[] args) {

        int d1=0, d2=1, i=0;

        while (d1 != d2) {
            i++;

            d1 = (int) (Math.random() * 6) + 1;
            d2 = (int) (Math.random() * 6) + 1;

            System.out.printf("Try %d : d1 = %d, d2 = %d.", i, d1, d2);

            if (d1 != d2)
                System.out.printf("\tNo match.\n");
            else
                System.out.printf("\tMatch.\n");
        }

        System.out.println(i + " tries before the dice matched.");
    }
}

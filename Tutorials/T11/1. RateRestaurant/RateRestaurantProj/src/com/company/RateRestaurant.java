package com.company;

import java.util.*;
import java.lang.*;

public class RateRestaurant {

    // Attributes
    private static int[] ratings = {0, 0, 0, 0, 0};
    private static boolean empty = true;

    // Methods
    public static double computeAvg() {
        double avg=0;
        int ctr=0;

        for (int i=0; i<5; i++) {
            avg += ((i+1) * ratings[i]);

            if (ratings[i] != 0)
                ctr += ratings[i];
        }

        if (empty)
            return avg / 5;

        return avg /= ctr;
    }

    // Main method
    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);

        int n=0;

        do {
            try {
                System.out.printf("Type in a rating in the range 1-5 : ");
                n = kybd.nextInt();
                kybd.nextLine();

                try {
                    ratings[n-1]++;
                    empty = false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    if (n != -1)
                        System.out.println("Rating must be in the range 1-5. Please try again.\n");
                    else
                        System.out.println("End of rating input.\n");
                }

            } catch (InputMismatchException e) {
                System.out.println("You must type in an integer. Please try again.\n");
                kybd.nextLine();
            }
        } while (n != -1);

        System.out.println("Average rating : " + RateRestaurant.computeAvg() + ".");
    }
}

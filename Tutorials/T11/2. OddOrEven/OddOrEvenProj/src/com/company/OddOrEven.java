package com.company;

import java.util.*;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int n=0;
        boolean valid = false;

        do {
            try {
                System.out.printf("Type in a number : ");
                n = kybd.nextInt();

                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("You must type in an integer number. Please try again.\n");
                kybd.nextLine();
            }
        } while (!valid);

        if (n != 0) {
            if ((n % 2) == 0) {
                System.out.println("The number is even.");
            } else
                System.out.println("The number is odd.");
        } else
            System.out.println("The number is 0. Neither even nor odd.");
    }
}
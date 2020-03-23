package com.company;

import java.util.*;

public class ValidatePercent {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int percent=-1;

        while ((percent < 0) || (percent > 100)) {

            System.out.printf("Type in a percent value (between 0-100) : ");
            percent = kybd.nextInt();

            if ((percent < 0) || (percent > 100))
                System.out.println("Value invalid. Please try again.\n");
        }

        System.out.println("Your value : " + percent + ".\n");
    }
}

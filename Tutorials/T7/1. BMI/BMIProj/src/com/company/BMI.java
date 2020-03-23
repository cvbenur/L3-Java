package com.company;

import java.util.*;

public class BMI {

    public static int heightInInches() {

        Scanner kybd = new Scanner(System.in);
        int ft=0, in=0;
        boolean valid=false;

        while (valid == false) {
            System.out.printf("Type in your height:\nFeet: ");
            ft = kybd.nextInt();

            if (ft < 2 || ft > 7)
                System.out.println("Value must be between 2 and 7. Please try again.");
            else
                valid = true;
        }

        valid = false;
        while (valid == false) {
            System.out.printf("Inches: ");
            in = kybd.nextInt();

            if (in < 0 || in > 11)
                System.out.println("Valut must be between 0 and 11. Please try again.");
            else
                valid = true;
        }

        return ((ft * 12) + in);
    }

    public static int weightInPounds() {

        Scanner kybd = new Scanner(System.in);
        int st=0, lb=0;
        boolean valid=false;

        while (valid == false) {

            System.out.printf("Type in your weight:\nStones: ");
            st = kybd.nextInt();

            if (st < 3 || st > 30)
                System.out.println("Value must be between 3 and 30. Please try again.");
            else
                valid = true;
        }

        valid = false;
        while (valid == false) {

            System.out.printf("Pounds: ");
            lb = kybd.nextInt();

            if (lb < 0 || lb > 13)
                System.out.println("Value must be between 0 and 13. Please try again.");
            else
                valid = true;
        }

        return ((st * 14) + lb);
    }

    private static void outputBMI(int h, int w) {

        double bmi = (double) (w * 703 / (h * h));

        System.out.println("Your BMI: " + bmi);
    }


    public static void main(String[] args) {

        int h = BMI.heightInInches();

        int w = BMI.weightInPounds();

        BMI.outputBMI(h, w);
    }
}

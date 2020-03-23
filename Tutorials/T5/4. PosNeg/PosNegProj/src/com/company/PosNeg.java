package com.company;

import java.util.*;

public class PosNeg {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.println("Type in a number : ");
        int nbr = kybd.nextInt();

        if (nbr > 0)
            System.out.println("The number is positive.");
        else if (nbr < 0)
            System.out.println("The number is negative.");
        else
            System.out.println("The number is 0.");
    }
}

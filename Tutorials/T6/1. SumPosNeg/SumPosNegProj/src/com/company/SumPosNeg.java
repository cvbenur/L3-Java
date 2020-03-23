package com.company;

import java.util.*;

public class SumPosNeg {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int nbr=0, neg=0, pos=0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Type in a number (" + (i+1) +"/10) : ");
            nbr = kybd.nextInt();

            if (nbr <= 0)
                neg += nbr;
            else
                pos += nbr;
        }

        System.out.println("The sum of the positive numbers is : " + pos);
        System.out.println("The sum of the negative numbers is : " + neg);
    }
}

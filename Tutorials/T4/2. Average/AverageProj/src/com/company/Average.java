package com.company;

import java.util.*;

//program to output the average of 3 integer values
public class Average
{
    public static void main (String args[])
    {
        Scanner kybd = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = kybd.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = kybd.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = kybd.nextInt();

        double ave = (num1 + num2 + num3) / 3;

        System.out.println("Average is: " + ave);
    }
}

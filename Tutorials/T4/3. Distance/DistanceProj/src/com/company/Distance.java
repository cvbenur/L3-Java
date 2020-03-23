package com.company;

import java.util.*;

public class Distance {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.printf("Type in the initial velocity of the object : ");
        double u = kybd.nextDouble();

        System.out.printf("Type in the time taken : ");
        double t = kybd.nextDouble();

        System.out.printf("Type in the acceleration : ");
        double a = kybd.nextDouble();

        double s = (u*t) + (0.5 * a * t * t);
        System.out.printf("The object has travelled a distance of : " + s + ".");
    }
}

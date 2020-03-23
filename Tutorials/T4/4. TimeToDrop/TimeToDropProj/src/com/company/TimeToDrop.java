package com.company;

import java.util.*;
import java.lang.Math;

public class TimeToDrop {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.printf("Type in the initial distance between the object and the ground : ");
        double s = kybd.nextDouble();

        double t = Math.sqrt((2 * s) / 9.8);

        System.out.printf("The object will reach the ground in %.2f seconds.\n", t);
    }
}

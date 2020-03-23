package com.company;

import java.util.*;

public class BreakEven {

    public static void main (String[] args) {

        Scanner kybd = new Scanner(System.in);

        // Getting the cost per item from the user
        System.out.println("Type in the cost per item : ");
        double cost = kybd.nextInt();

        // Getting the price per item from the user
        System.out.println("Type in the price per item : ");
        double price = kybd.nextInt();

        // Getting the amount of the overhead expenses from the user
        System.out.println("Type in the amount of overhead expenses : ");
        double expenses = kybd.nextInt();

        // Computing and prining the "break even" point
        System.out.println("The company needs to sell " + (expenses / (price - cost) ) + " items in order to break even.");
    }
}

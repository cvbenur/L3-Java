package com.company;

import java.util.*;

public class VAT {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        double price=0, percent=0.2;

        System.out.printf("Type in the price before VAT : ");
        price = kybd.nextDouble();

        System.out.println("The amount of VAT payable is : " + (price * percent) + ".");
        System.out.println("The price with VAT is : " + (price + (price * percent)) + ".");
    }
}

package com.company;

import java.util.*;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.println("Type in a number : ");
        int n = kybd.nextInt();

        if (n != 0) {
            if ((n % 2) == 0) {
                System.out.println("The number is even.");
            } else
                System.out.println("The number is odd.");
        } else
            System.out.println("The number is 0. Neither even nor odd.");
    }
}

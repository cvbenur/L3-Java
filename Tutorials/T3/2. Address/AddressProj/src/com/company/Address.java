package com.company;

import java.util.*;

public class Address {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.println("Type in a surname : ");
        String surname = kybd.nextLine();

        System.out.println("Type in a house number : ");
        int house = kybd.nextInt();
        kybd.nextLine();

        System.out.println("Type in a road name : ");
        String road = kybd.nextLine();

        System.out.println("Type in a town name : ");
        String town = kybd.nextLine();

        System.out.printf("Mr and Mrs " + surname + ",%n" + house + ", " + road + "%n" + town);
    }
}

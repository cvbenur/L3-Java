package com.company;

import java.util.*;

public class Post {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int valid=1;
        do {

            System.out.println("Type in the letter type : ");
            String type = kybd.nextLine();

            switch (type.toLowerCase()) {
                case "bill":
                    System.out.println("Bills must be paid.");
                    break;

                case "circular":
                    System.out.println("Circulars must be thrown away.");
                    break;

                case "postcard":
                    System.out.println("Postcards must be put up on the wall.");
                    break;

                case "letter":
                    System.out.println("Personnal letters must be read and have a reply written for them.");
                    break;

                default:
                    System.out.println("Type not recognized. Please try again.");
                    valid = 0;
            }
        } while (valid == 0);
    }
}

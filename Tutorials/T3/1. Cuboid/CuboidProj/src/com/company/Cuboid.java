package com.company;

import java.util.*;

public class Cuboid {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);


        System.out.println("Type in the width of the cuboid : ");
        int width = kybd.nextInt();

        System.out.println("Type in the length of the cuboid : ");
        int length = kybd.nextInt();

        System.out.println("Type in the height of the cuboid : ");
        int height = kybd.nextInt();

        System.out.println("The cuboid's surface area is : " + (2 * ((height * width) + (length * width) + (height * length))));
        System.out.println("The cuboid's volume is : " + (height * length * width) );
    }
}

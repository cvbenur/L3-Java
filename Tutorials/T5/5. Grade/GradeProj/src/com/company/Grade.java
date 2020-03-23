package com.company;

import java.util.*;

public class Grade {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.println("Type in the percent grade : ");
        int percent = kybd.nextInt();


        //output grade based on percent
        if (percent < 0)
            System.out.println("Grade invalid (negative number).");
        else if (percent > 100)
            System.out.println("Grade invalid (number over 100).");
        else {
            System.out.println("The grade is : ");

            if (percent >= 70)
                System.out.println("A");
            else if (percent >= 60)
                System.out.println("B");
            else if (percent >= 50)
                System.out.println("C");
            else if (percent >= 40)
                System.out.println("D");
            else
                System.out.println("E");
        }
    }
}

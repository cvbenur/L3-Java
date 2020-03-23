package com.company;

import java.util.*;

public class AboveAverage {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.printf("Type in the number of students : ");
        int st = kybd.nextInt();
        kybd.nextLine();


        int[] marks = new int[st];
        String[] names = new String[st];
        double avg=0;


        if (st != 0) {
            for (int i=0; i<st; i++) {

                System.out.printf("\nEnter the name for student " + (i+1) + " : ");
                names[i] = kybd.nextLine();

                System.out.printf("Enter the mark for student " + (i+1) + " : ");
                marks[i] = kybd.nextInt();
                kybd.nextLine();
            }


            for (int i=0; i<st; i++)
                avg += marks[i];
            avg = avg / st;
            System.out.println("\nAverage mark : " + avg + ".");


            System.out.println("Above average students :");
            for (int i=0; i<st; i++) {

                if (marks[i] >= avg)
                    System.out.println("\t- " + names[i] + ", " + marks[i]);
            }
        } else
            System.out.println("No students to input.");
    }
}

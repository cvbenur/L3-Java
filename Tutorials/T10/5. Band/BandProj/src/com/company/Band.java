package com.company;

import java.util.*;

public class Band {

    private static void printBand(Member[] m) {
        for (int i=0; i<m.length; i++) {
            System.out.println("For musician no." + (i+1) + "/" + m.length + " :");
            System.out.println("Name :\t\t " + m[i].getName());
            System.out.println("Instrument : " + m[i].getInstrument());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        final int MAX = 5;
        Member[] band = new Member[MAX];

        System.out.println("Type in the details of the band members :");
        for (int i=0; i<MAX; i++) {
            System.out.println("For musician no." + (i+1) + "/5) :");

            System.out.printf("Type in the musician's name : ");
            String name = kybd.nextLine();

            System.out.printf("Type in " + name + "'s instrument : ");
            String instr = kybd.nextLine();

            band[i] = new Member(name, instr);

            System.out.println();
        }

        System.out.println("\nPrinting the band :");
        Band.printBand(band);
    }
}

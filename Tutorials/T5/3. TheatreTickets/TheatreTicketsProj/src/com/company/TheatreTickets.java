package com.company;

import java.util.*;

public class TheatreTickets {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        double tot=0, dscnt=0;
        int choice=0, ad=0, del=0;

        System.out.printf("Type in the number of adults : ");
        int adults = kybd.nextInt();

        System.out.printf("Type in the number of children : ");
        int children = kybd.nextInt();

        System.out.printf("Type in the number of concessions : ");
        int concessions = kybd.nextInt();



        if (adults == 0 && children == 0 && concessions == 0)
            System.out.println("No tickets selected.");
        else {

            tot += (8.4 * concessions);

            tot += (7.3 * children);


            if (adults > 0) {

                ad = adults;

                if (children >= 10) {

                   ad -= (children / 10);

                   if (ad < 0)
                       ad = 0;
                }

                tot += (10.5 * ad);
            }


            // Applying discount if need be
            if (tot >= 100) {
                dscnt = tot / 10;
                tot -= dscnt;
            }


            while (choice == 0) {

                System.out.println("Are the tickets to be picked up or delivered ?");
                System.out.println("1. Delivered");
                System.out.println("2. Picked up");
                System.out.printf("Your choice : ");
                choice = kybd.nextInt();

                switch (choice) {
                    case 1:
                        del=1;
                        tot += 2.34;
                        choice = 1;
                        break;

                    case 2:
                        choice = 1;
                        break;

                    default:
                        choice = 0;
                        System.out.println("Value invalid. Please try again.");
                }
            }


            System.out.println("\n\t\tORDER SUMMARY\n");
            System.out.println("Adult (£10.5)\t*\t" + adults + "\t\t " + (adults * 10.5));
            System.out.println("Child (£ 7.3)\t*\t" + children + "\t\t " + (children * 7.3));
            System.out.println("Conc. (£ 8.4)\t*\t" + concessions + "\t\t " + (concessions * 8.4));
            System.out.println("A.Off (£10.5)\t*\t" + (adults - ad) + "\t\t-" + (10.5 * (adults - ad)) + "\n");
            System.out.println("Overall SubTot\t\t\t\t " + ((ad * 10.5) + (children * 7.3) + (concessions * 8.4)));
            System.out.printf("Overall Dscnt\t\t\t\t %.2f\n", dscnt);
            System.out.println("New SubTot\t\t\t\t\t " + (((ad * 10.5) + (children * 7.3) + (concessions * 8.4)) - dscnt) + "\n");
            System.out.println("D.Fee (£2.34)\t*\t" + del + "\t\t " + (del * 2.34) + "\n");
            System.out.printf("TOTAL\t\t\t\t\t\t %.2f", tot);
        }
    }
}

package com.company;

import java.util.*;

public class AveragePosNeg {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int nbr=0, pos=0, neg=0, pnbr=0, negnbr=0;

        for (int i=0; i<10; i++) {

            System.out.printf("Type in a number (" + (i+1) + "/10) : ");
            nbr = kybd.nextInt();

            if (nbr < 0) {
                neg += nbr;
                negnbr++;
            } else if (nbr > 0) {
                pos += nbr;
                pnbr++;
            }
        }

        if (pnbr == 0)
            System.out.println("There are no positive numbers.");
        else {
            System.out.println("The average of the positive numbers is : " + (pos/pnbr) + ".");
        }

        if (negnbr == 0)
            System.out.println("There are no negative numbers.");
        else {
            System.out.println("The average of the negative numbers is : " + (neg/negnbr) + ".");
        }
    }
}

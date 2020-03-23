package com.company;

import java.util.*;
import java.lang.String;

public class Initials {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.println("Type in your full name (firstName middleName lastName) :");
        String str = kybd.nextLine();

        char[] res = new char[3];
        res[0] = str.charAt(0);

        int i=0, ctr=1;
        while (i < str.length()) {

            if (str.charAt(i) == ' ') {

                res[ctr] = str.charAt(i+1);
                ctr++;
            }

            i++;
        }

        System.out.println("Here are your initials :");
        for (int j=0; j<3; j++) {
            System.out.printf("%c", res[j]);

            if (j < 2)
                System.out.printf(", ");
        }
        System.out.println(".");
    }
}

package com.company;

import java.util.*;
import java.lang.Character;

public class InfiniteInitials {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.printf("Type in your full name : ");

        /*
                    STRING TO TEST:
        '  Joseph     David Kingsley-Montgomery  '
         */

        String str = kybd.nextLine();
        char[] line = str.toCharArray();
        char[] initials = new char[str.length()];



        int j=0;
        if (Character.isLetter(line[0])) {
            initials[0] = line[0];
            j++;
        }

        for (int i=1; i<str.length(); i++) {

            if (line[i-1] == ' ' || line[i-1] == '-') {

                if (Character.isLetter(line[i])) {
                    initials[i] = line[i];
                    j++;
                }
            }
        }



        System.out.printf("The initials are : ");
        for (int i=0; i<str.length(); i++) {

            if (Character.isLetter(initials[i])) {

                if (j > 1) {
                    System.out.printf("%c, ", initials[i]);
                    j--;
                } else
                    System.out.printf("and %c.",initials[i]);
            }
        }
    }
}

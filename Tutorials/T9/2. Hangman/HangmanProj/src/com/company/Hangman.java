package com.company;

import java.util.*;

public class Hangman {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.printf("Word to be guessed : ");
        String wrd = kybd.nextLine();


        char[] disp = new char[wrd.length()];

	    boolean done=false;
        int ctr=0, guessed=0;
        do {
            ctr++;

            System.out.println("\nTry no. " + ctr + ":");
            System.out.printf("Display : \t\t");
            System.out.println(disp);


            System.out.printf("Your guess : \t");
            String str = kybd.nextLine();
            char guess = str.toLowerCase().charAt(0);

            int wrng=0;
            for (int i=0; i<wrd.length(); i++) {

                if (disp[i] == guess) {
                    System.out.println("This letter has already been found. Please try again.");
                    i--;
                    break;
                } else if (wrd.toLowerCase().charAt(i) == guess) {
                    guessed++;
                    disp[i] = wrd.charAt(i);
                } else
                    wrng++;
            }

            if (wrng == wrd.length())
                System.out.println("Wrong letter, guess again.");
            else {
                if (guessed == wrd.length())
                    done = true;
                else
                    System.out.println("Nice! " + (wrd.length() - guessed) + " letters to go.");
            }


        } while (!done);

        System.out.println("\n\nYou guessed the word '" + wrd + "' in " + ctr + " tries !");
    }
}

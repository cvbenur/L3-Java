package com.company;

public class ErrorProne

    // ERROR PRONE METHOD
    /*
    public void static main (string[] args)
        (
        system.Out.PrinTln('Here is the first string to output'));
        System.out.println"Here is the second string to output";
    */


    // CORRECTED METHOD
    public static void main(String[] args) {
        System.out.println("Here is the first string to output");
        System.out.println("Here is the second string to output");
    }
}
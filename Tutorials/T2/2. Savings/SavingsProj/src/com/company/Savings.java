package com.company;

public class Savings {

    // Calculate and output half of my savings
    public static void main (String[] args) {

        // Your share is 25% of my savings
        int mySavings = 3000;
        int yourPercentage = 25;

        int yourShare = ((mySavings * yourPercentage) / 100);

        System.out.println("Your share : " + yourShare);
    }
}

package com.company;

import java.lang.Math;

public class CansOfPaint {

    public static void main(String[] args) {

        double paintedArea = 2 * (25 * 3.6) + 2 * (30 * 3.6);
        double boxVolume = 0.60 * 0.30 * 0.35;
        double canVolume = 0.15 * 0.15 * 0.30;

        // Getting the minimum number of cans required to paint the surface
        double nbrCans = Math.ceil(paintedArea / 28);

        // Getting the number of cans in one box
        double nbrCansInBox = Math.floor(boxVolume / canVolume);

        // Getting the number of boxes required
        double nbrBoxes = Math.floor(nbrCans / nbrCansInBox);

        // Deducing the number of cans that will not be sent in boxes as well as printing the output
        System.out.println("The client will be sent " +  nbrBoxes + " boxes, and " + ((nbrCans % nbrCansInBox) + 1) + " cans.");
    }
}

package com.company;

import java.util.*;

public class Shapes {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int menu=0, rows=0;

        while (menu != 6) {

            System.out.println("Which shape would you like to output ?");
            System.out.println("1. Triangle, left-aligned, right-angled");
            System.out.println("2. Triangle, right-aligned, right-angled");
            System.out.println("3. Triangle, isosceles");
            System.out.println("4. Triangle, inverted isosceles");
            System.out.println("5. Rectangle");
            System.out.println("6. Exit");
            System.out.printf("Your choice : ");

            menu = kybd.nextInt();

            if (menu <= 5 && menu >= 1) {
                System.out.printf("Type in the number of rows : ");
                rows = kybd.nextInt();
            }

            switch (menu) {
                case 1: // Triangle, left-aligned, right-angled

                    System.out.println("Printing a Triangle, left-aligned, right-angled, with " + rows + " rows.");

                    for (int i=0; i<rows; i++) {

                        for (int j=0; j<rows-i; j++) {

                            if (i == 0 || i == rows-1)
                                System.out.printf("*");

                            if (i > 0 && i < rows-1) {
                                if (j == 0 || j == rows-i-1)
                                    System.out.printf("*");
                                else
                                    System.out.printf(" ");
                            }
                        }

                        System.out.printf("\n");
                    }

                    break;

                case 2: // Triangle, right-aligned, right-angled

                    System.out.println("Printing a Triangle, right-aligned, right-angled, with " + rows + " rows.");

                    for (int i=0; i<rows; i++) {

                        for (int j=0; j<i; j++) {
                            System.out.printf(" ");
                        }

                        for (int j=0; j<rows-i; j++) {
                            if (i == 0 || i == rows-1)
                                System.out.printf("*");

                            if (i > 0 && i < rows-1) {
                                if (j == 0 || j == rows-i-1)
                                    System.out.printf("*");
                                else
                                    System.out.printf(" ");
                            }
                        }

                        System.out.printf("\n");
                    }

                    break;

                case 3: // Triangle, isosceles

                    System.out.println("Printing a Triangle, isosceles, with " + rows + " rows.");

                    for (int i=0; i<rows; i++) {

                        for (int j=0; j<rows-i; j++)
                            System.out.printf(" ");

                        for (int j=0; j<i+1; j++) {

                            if (j == 0 || j == i || i == rows-1)
                                System.out.printf("*");
                            else
                                System.out.printf(" ");

                            if (j < i)
                                System.out.printf(" ");
                        }

                        System.out.printf("\n");
                    }

                    break;

                case 4: // Triangle, inverted isosceles

                    System.out.println("Printing a Triangle, inverted isosceles, with " + rows + " rows.");

                    for (int i=0; i<rows; i++) {

                        for (int j=0; j<i; j++)
                            System.out.printf(" ");

                        for (int j=0; j<rows-i; j++) {
                            if (j == 0 || j == rows-i-1 || i == 0)
                                System.out.printf("*");
                            else
                                System.out.printf(" ");

                            if (j < rows-i)
                                System.out.printf(" ");
                        }

                        System.out.printf("\n");
                    }

                    break;

                case 5: // Rectangle

                    System.out.println("Printing a Rectangle, with " + rows + " rows.");

                    for (int i=0; i<rows; i++) {

                        for (int j=0; j<5+1; j++) {

                            if (j == 0 || j == 5 || i == 0 || i == rows-1)
                                System.out.printf("*");
                            else
                                System.out.printf(" ");
                        }

                        System.out.printf("\n");
                    }

                    break;

                case 6:
                    System.out.println("Exiting the program.");

                    break;

                default:
                    System.out.println("Value invalid, type in a valid value.");
            }

            System.out.println();
        }
    }
}

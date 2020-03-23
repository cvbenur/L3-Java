package com.company;

import java.util.*;

public class Battleships {

    // Attributes
    public int[][] board;
    public char[][] disp;
    private static final int SIZE = 12;


    // Ctor
    public Battleships() {
        this.board = new int[][] {
                {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}
        };

        this.disp = new char[12][12];
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++)
                this.disp[i][j] = ' ';
        }
    }


    // Methods
    // Printing the grid
    public void printGrid() {

        for (int i=0; i<SIZE; i++) {

            if (i<9)
                System.out.printf(" %d |", i+1);
            else
                System.out.printf("%d |", i+1);

            for (int j=0; j<SIZE; j++)
                System.out.printf(" %c |", this.disp[i][j]);

            if (i<SIZE-1)
                System.out.println();
        }


        System.out.printf("\n   ");
        for (int i=0; i<SIZE; i++) {
            if (i<9)
                System.out.printf("  %d ", i+1);
            else
                System.out.printf(" %d ", i+1);
        }
        System.out.println();
    }

    // Updating the grid
    public void runTry(int x, int y) {

        if (this.board[x][y] == 1) {
            this.disp[x][y] = 'H';
            System.out.println("\nHit !");
        } else {
            this.disp[x][y] = 'X';
            System.out.println("\nMiss !");
        }
    }

    // Detecting end of game
    public boolean detectEndOfGame() {
        for (int i=0; i<SIZE; i++) {

            for (int j=0; j<SIZE; j++) {
                if (this.board[i][j] == 1 && this.disp[i][j] != 'H')
                    return false;
            }
        }

        System.out.println("\nGame over, all ships have been destroyed !");

        return true;
    }

    // Asking whether the user would like to try another time
    public boolean tryAgain(Scanner kybd) {
        int choice=0;

        do {
            System.out.println("\nWould you like another try ?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.printf("Your choice : ");
            choice = kybd.nextInt();
            kybd.nextLine();

            if (choice < 1 || choice > 2)
                System.out.println("Value invalid, please try again.");
        } while (choice < 1 || choice > 2);

        if (choice == 1)
            return true;
        else
            return false;
    }


    // Main
    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        Battleships game = new Battleships();

        int x=0, y=0;
        boolean exit=false;


        do {
            game.printGrid();

            do {
                System.out.printf("\nType in an x coordinate (1-12) : ");
                x = kybd.nextInt();
                kybd.nextLine();

                if (x < 1 || x > 12)
                    System.out.println("Value invalid, please try again.");
            } while (x < 1 || x > 12);

            do {
                System.out.printf("\nType in a y coordinate (1-12) : ");
                y = kybd.nextInt();
                kybd.nextLine();

                if (y < 1 || y > 12)
                    System.out.println("Value invalid, please try again.");
            } while (y < 1 || y > 12);

            game.runTry(x-1, y-1);
            game.printGrid();

            if (!game.detectEndOfGame()) {
                if (!game.tryAgain(kybd))
                    exit = true;
                else
                    System.out.println();
            } else
                exit = true;

        } while (!exit);

        System.out.println("\nExiting program.");
    }
}

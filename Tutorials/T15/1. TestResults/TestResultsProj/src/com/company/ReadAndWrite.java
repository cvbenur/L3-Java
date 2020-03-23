package com.company;

import java.util.*;
import java.io.*;

public class ReadAndWrite {

    // Attributes
    public static final String pass = "data/Pass.txt";      // Name of the Pass file
    public static final String fail = "data/Fail.txt";      // Name of the Fail file

    // Methods

    // Reading the names from the Names.txt file
    public static String[] readNamesFromFile() {

        String[] n = new String[10];

        try {
            File names = new File("data/Names.txt");
            Scanner text = new Scanner(names);

            int i=0;

            while (text.hasNextLine()) {
                String line = text.nextLine();

                if (!line.isEmpty()) {

                    try {
                        n[i] = line;
                        i++;
                    } catch (ArrayIndexOutOfBoundsException e) {}
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return n;
    }

    // Writing the names to the specified file
    public static void writeToFile(String[] names, String filename) {

        try {

            File file = new File(filename);
            PrintWriter pw = new PrintWriter(file);


            System.out.println("Writing names to file : " + filename + "\n");

            for (String name : names) {
                try {
                    if (!name.isEmpty())
                    pw.println(name);
                } catch (NullPointerException e) {}
            }

            System.out.println("Names written to file.\n");


            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error, file not found.\n");
        }
    }
}

package com.company;

import java.util.*;

public class TestResults {

    // Attributes
    public static String[] pass = new String[10];       // Array containing the names of the Students who pass
    public static String[] fail = new String[10];       // Array containing the names of the Students who fail



    // Methods

    // Writing the names to the files
    private static void writeNamesToFiles() {
        ReadAndWrite.writeToFile(pass, ReadAndWrite.pass);
        ReadAndWrite.writeToFile(fail, ReadAndWrite.fail);
    }

    // Main method
    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        Student.sortByGrade(Student.readGrades(ReadAndWrite.readNamesFromFile(), kybd));

        writeNamesToFiles();
    }
}

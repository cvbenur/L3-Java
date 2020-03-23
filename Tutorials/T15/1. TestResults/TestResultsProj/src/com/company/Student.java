package com.company;

import java.util.*;

public class Student {

    // Attributes
    private String name;        // A Student's name
    private int grade;          // A Student's grade (in %)


    // Ctor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }


    // Methods
    public String getName() {return this.name;}

    public int getGrade() {return this.grade;}


    // Prompting the user for the grades
    public static Student[] readGrades(String[] names, Scanner kybd) {

        Student[] students = new Student[names.length];

        try {
            int i=0;

            System.out.println("Beginning of input sequence.\n");

            for (String name : names) {
                System.out.printf("Type in a grade for " + name + " : ");

                students[i] = new Student(name, kybd.nextInt());
                kybd.nextLine();

                i++;
            }

            System.out.println("End of input sequence.\n");

        } catch (InputMismatchException e) {
            System.out.println("Not an integer. Please try again.\n");
            kybd.nextLine();
        }

        return students;
    }

    // Sorting the Students by grade
    public static void sortByGrade(Student[] students) {

        int i=0, j=0;

        for (Student student : students) {

            if (student.getGrade() >= 40) {
                TestResults.pass[i] = student.getName();
                i++;
            } else {
                TestResults.fail[j] = student.getName();
                j++;
            }
        }
    }
}

package com.company;

public class Cat extends Pet {

    // Attributes
    private int numberOfTeeth;      // A Cat's number of teeth
    private int lengthOfTail;       // A Cat's tail's length


    // Ctor
    public Cat(String name, String ownerName, int numberOfTeeth, int lengthOfTail) {
        super(name, ownerName);
        this.numberOfTeeth = numberOfTeeth;
        this.lengthOfTail = lengthOfTail;
    }


    // Methods
    public int getNumberOfTeeth() {return this.numberOfTeeth;}

    public int getLengthOfTail() {return this.lengthOfTail;}


    // Printing a Cat's details
    public static void printCat(Cat cat) {
        System.out.printf("\t\t%-15s   %-15s    %5s    %11s    %14s\n", cat.getName(), cat.getOwnerName(), cat.getNumberOfTeeth(), cat.getLengthOfTail(), "---");
    }
}

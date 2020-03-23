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
}

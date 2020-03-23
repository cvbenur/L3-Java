package com.company;

public class Pet {

    // Attributes
    public String name;            // A Pet's name
    public String ownerName;       // A Pet's owner's name


    // Ctor
    public Pet(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }
    public Pet() {}


    // Methods
    public String getName() {return this.name;}

    public String getOwnerName() {return this.ownerName;}
}

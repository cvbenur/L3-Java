package com.company;

public class Budgie extends Pet {

    // Attributes
    private String colourOfFeathers;       // A Budgie's feathers' colour


    // Ctor
    public Budgie(String name, String ownerName, String colourOfFeathers) {
        super(name, ownerName);
        this.colourOfFeathers = colourOfFeathers;
    }


    // Methods
    public String getColourOfFeathers() {return this.colourOfFeathers;}


    // Printing a Budgie's details
    public static void printBudgie(Budgie budgie) {
        System.out.printf("\t\t%-15s   %-15s    %5s    %11s    %14s\n", budgie.getName(), budgie.getOwnerName(), "---", "---", budgie.getColourOfFeathers());
    }
}

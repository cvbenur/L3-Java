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
}

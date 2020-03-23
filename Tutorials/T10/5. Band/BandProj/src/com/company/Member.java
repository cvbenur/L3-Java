package com.company;


public class Member {

    // Attributes
    private String name;        // Member's name
    private String instrument;  // Member's instrument


    // Ctor
    public Member(String n, String i) {
        this.name = n;
        this.instrument = i;
    }


    // Methods
    public String getName() {return this.name;}
    public void setName(String n) {this.name = n;}

    public String getInstrument() {return this.instrument;}
    public void setInstrument(String i) {this.instrument = i;}
}

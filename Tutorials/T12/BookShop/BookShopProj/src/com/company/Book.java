package com.company;

public class Book {

    // Attributes
    private String title;       // A book's title
    private String author;      // A book's author


    // Ctors
    public Book(String title) {
        this.title = title;
        this.author = "Anon";
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    // Methods
    public String getTitle() {return this.title;}

    public String getAuthor() {return this.author;}
}

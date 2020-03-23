package com.company;

import java.util.*;

public class BookShopApplication {

    // Methods

    // Getting a new Book object from the user
    private static Book getBook(Scanner kybd) {
        System.out.printf("What is the title of the next book > ");
        String title = kybd.nextLine();

        System.out.printf("What is the name of the author > ");
        String author = kybd.nextLine();

        if (author.isEmpty())
            return new Book(title);

        return new Book(title, author);
    }

    // Printing the details of each Book in an array of Books
    private static void printBookDetails(Book[] books) {
        System.out.println("\nBook list");
        System.out.println("\t\tTitle                   Author");
        System.out.println("\t\t======================= ========================");

        for (int i=0; i<books.length; i++)
            System.out.printf("\t\t%-24s%s\n", books[i].getTitle(), books[i].getAuthor());
    }

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        Book[] books = new Book[10];


        for (int i=0; i<books.length; i++)
            books[i] = getBook(kybd);


        printBookDetails(books);
    }
}

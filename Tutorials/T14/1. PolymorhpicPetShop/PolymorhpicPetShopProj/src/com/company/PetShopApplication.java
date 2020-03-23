package com.company;

public class PetShopApplication {

    // Methods
    // Printing the headers
    private static void printHeaders() {
        System.out.println("All Pets");
        System.out.println("\t\tPet's name        Owner's name       Teeth    Tail Length    Feather colour");
        System.out.println("\t\t==============    ===============    =====    ===========    ==============");
    }

    // Printing a Pet's details
    private static void printPetDetails(Pet[] pets) {
        for (Pet pet : pets) {
            if (pet instanceof Cat)
                Cat.printCat((Cat) pet);
            else
                Budgie.printBudgie((Budgie) pet);
        }
    }


    // Main method
    public static void main(String[] args) {

        Pet[] pets = new Pet[10];
        pets[0] = new Cat("First cat", "First Owner", 38, 11);
        pets[1] = new Cat("Second cat", "Second Owner", 34, 10);
        pets[2] = new Cat("Third cat", "Third owner", 32, 12);
        pets[3] = new Cat("Fourth cat", "Fourth owner", 30, 13);
        pets[4] = new Cat("Fifth cat", "First owner", 36, 12);
        pets[5] = new Cat("Sixth cat", "Third owner", 34, 13);
        pets[6] = new Budgie("First budgie", "Second owner", "Red");
        pets[7] = new Budgie("Second budgie", "First owner", "Green");
        pets[8] = new Budgie("Third budgie", "Fourth owner", "Yellow");
        pets[9] = new Budgie("Fourth budgie", "Second owner", "Blue");


        printHeaders();
        printPetDetails((pets));
    }
}

package com.company;

public class PetShopApplication {

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("First cat", "First Owner", 38, 11);
        cats[1] = new Cat("Second cat", "Second Owner", 34, 10);
        cats[2] = new Cat("Third cat", "Third owner", 32, 12);

        Budgie[] budgies = new Budgie[2];
        budgies[0] = new Budgie("First budgie", "Second owner", "Red");
        budgies[1] = new Budgie("Second budgie", "First owner", "Green");



        System.out.println("All Pets");
        System.out.println("\t\tPet's name        Owner's name       Teeth    Tail Length    Feather colour");
        System.out.println("\t\t==============    ===============    =====    ===========    ==============");

        for (Cat cat : cats)
            System.out.printf("\t\t%-15s   %-15s    %5s    %11s    %14s\n", cat.getName(), cat.getOwnerName(), cat.getNumberOfTeeth(), cat.getLengthOfTail(), "---");

        for (Budgie budgie : budgies)
            System.out.printf("\t\t%-15s   %-15s    %5s    %11s    %14s\n", budgie.getName(), budgie.getOwnerName(), "---", "---", budgie.getColourOfFeathers());
    }
}

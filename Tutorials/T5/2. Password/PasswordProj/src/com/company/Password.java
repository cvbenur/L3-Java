package com.company;

import java.util.*;

public class Password {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        String pwd = "PaSSWoRD_1234", str;

        System.out.println("Type in the password string : ");
        str = kybd.nextLine();

        if (str.equals(pwd) == false)
            System.out.println("Wrong password.");
        else
            System.out.println("Welcome to the system.");
    }
}

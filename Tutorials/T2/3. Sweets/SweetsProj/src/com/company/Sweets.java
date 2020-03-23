package com.company;

public class Sweets {

    public static void main(String[] args) {

        int sweets = 25, studNbr = 7;

        int teacher = sweets % studNbr;
        int studCndy = (sweets - teacher) / studNbr;

        System.out.println("Each student will get " + studCndy + " sweets, and the teacher will get " + teacher);
    }
}

package com.reference.codereference.statement.istatement;

public class If_Statement {

    public static void if_statement() {
        int number = 10;

        // Simple if statement
        if (number > 0) {
            System.out.println("Number is positive");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // if-else if-else statement
        if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is positive");
        }

        // Nested if statements
        int a = 5, b = 10, c = 15;
        if (a > b) {
            if (a > c) {
                System.out.println("a is the largest number");
            } else {
                System.out.println("c is the largest number");
            }
        } else {
            if (b > c) {
                System.out.println("b is the largest number");
            } else {
                System.out.println("c is the largest number");
            }
        }
    }
}

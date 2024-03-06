package com.reference.codereference.trycatch;

public class tryCatch {

    /**
     * tryCatch 예제 코드
     */

    public static void TryCatch() {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't execute if an exception occurs
        } catch (ArithmeticException e) {
            // Handling the exception
            System.err.println("An arithmetic exception occurred: " + e.getMessage());
            // e.printStackTrace(); // Optionally, print the stack trace for debugging
        } finally {
            // Code that always executes, whether an exception occurred or not
            System.out.println("Inside finally block");
        }
    }

    public static int divide(int dividend, int divisor) {
        // Method that may throw an ArithmeticException if divisor is zero
        return dividend / divisor;
    }
}

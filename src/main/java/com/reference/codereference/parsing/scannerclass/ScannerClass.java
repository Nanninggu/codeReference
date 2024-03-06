package com.reference.codereference.parsing.scannerclass;

import java.util.Scanner;

public class ScannerClass {

    public static void usingScannerClass() {
        String data = "apple,banana,orange";

        // Using Scanner class
        System.out.println("\nUsing Scanner:");
        Scanner scanner = new Scanner(data);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.println("UsingScannerClass " + scanner.next());
        }
        scanner.close();
    }

}

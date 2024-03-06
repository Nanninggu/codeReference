package com.reference.codereference.parsing.stringtoparse;

public class stringToParser {

    public static void stringToParser() {
        String data = "apple,banana,orange";

        // Using String.split()
        System.out.println("Using String.split():");
        String[] fruitsArray = data.split(",");
        for (String fruit : fruitsArray) {
            System.out.println("stringToParser " + fruit);

        }
    }
}

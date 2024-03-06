package com.reference.codereference.parsing.stringtokenizer;

public class StringTokenizer {

    public static void usingStringTokenizer() {
        String data = "apple,banana,orange";

        // Using StringTokenizer
        System.out.println("\nUsing StringTokenizer:");
        java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(data, ",");
        while (tokenizer.hasMoreTokens()) {
            System.out.println("usingStringTokenizer " + tokenizer.nextToken());
        }
    }
}

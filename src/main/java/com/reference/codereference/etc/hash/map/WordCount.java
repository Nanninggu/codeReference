package com.reference.codereference.etc.hash.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        // Map from word (String) to its count (Integer)
        Map<String, Integer> wordCounts = new HashMap<>();

        // Get input text from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        // Split text into words and count occurrences
        for (String word : text.split(" ")) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // Print word counts
        System.out.println("Word counts: " + wordCounts);
    }
}

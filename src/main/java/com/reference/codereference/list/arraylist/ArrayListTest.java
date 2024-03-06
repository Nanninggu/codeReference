package com.reference.codereference.list.arraylist;

import java.util.ArrayList;

public class ArrayListTest {

    public static void ArrayListTest() {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements using their index
        String firstFruit = fruits.get(0); // This will be "Apple"
        System.out.println("First fruit: " + firstFruit);

        // Print the entire ArrayList
        System.out.println("Fruits: " + fruits);

        // Loop through the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if an element exists
        boolean hasMango = fruits.contains("Mango");
        System.out.println("Has mango: " + hasMango);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("Fruits after removing banana: " + fruits);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        // Clear the entire ArrayList
        fruits.clear();
        System.out.println("Fruits after clearing: " + fruits);
    }
}
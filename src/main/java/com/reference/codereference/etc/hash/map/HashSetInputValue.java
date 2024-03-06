package com.reference.codereference.etc.hash.map;

public class HashSetInputValue {

    public static void main(String[] args) {
        // Create a HashSet to store student names
        java.util.HashSet<String> studentNames = new java.util.HashSet<>();

        // Add students to the set
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("Alice"); // Duplicate will be ignored

        // Check if a student exists
        if (studentNames.contains("David")) {
            System.out.println("David is in the class.");
        } else {
            System.out.println("David is not in the class.");
        }

        // Print all student names
        System.out.println("Students in the class: " + studentNames);

        // Remove a student
        studentNames.remove("Charlie");

        // Print the size of the set
        System.out.println("Number of students: " + studentNames.size());
    }
}

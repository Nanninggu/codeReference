package com.scenario.dev1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePrint {

    public static void printPaladin() throws FileNotFoundException {
        String filePath = "path/print/paladin.txt"; // Replace with your file path
        File file = new File(filePath);

        try {
            // Code that might throw an exception, like checking if a file exists
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + filePath);
            }

        } catch (FileNotFoundException e) {
            // Handle the exception if the file wasn't found
            System.err.println("Error: File not found: " + filePath);
            // Perform alternative actions or log the error
        }

        Scanner scanner = new Scanner(file);
        StringBuilder content = new StringBuilder();

        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine() + "\n"); // Add newline for each line
        }

        scanner.close();

        System.out.println("File contents:");
        System.out.println(content);
    }

    public static void printSpongeBob() throws FileNotFoundException {
        String filePath = "path/print/spongebob.txt"; // Replace with your file path
        File file = new File(filePath);

        try {
            // Code that might throw an exception, like checking if a file exists
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + filePath);
            }

        } catch (FileNotFoundException e) {
            // Handle the exception if the file wasn't found
            System.err.println("Error: File not found: " + filePath);
            // Perform alternative actions or log the error
        }

        Scanner scanner = new Scanner(file);
        StringBuilder content = new StringBuilder();

        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine() + "\n"); // Add newline for each line
        }

        scanner.close();

        System.out.println("File contents:");
        System.out.println(content);
    }

    public static void printMushRoom() throws FileNotFoundException {
        String filePath = "path/print/mushroom.txt"; // Replace with your file path
        File file = new File(filePath);

        try {
            // Code that might throw an exception, like checking if a file exists
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + filePath);
            }

        } catch (FileNotFoundException e) {
            // Handle the exception if the file wasn't found
            System.err.println("Error: File not found: " + filePath);
            // Perform alternative actions or log the error
        }

        Scanner scanner = new Scanner(file);
        StringBuilder content = new StringBuilder();

        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine() + "\n"); // Add newline for each line
        }

        scanner.close();

        System.out.println("File contents:");
        System.out.println(content);
    }

    public static void printEnd() throws FileNotFoundException {
        String filePath = "path/print/end.txt"; // Replace with your file path
        File file = new File(filePath);

        try {
            // Code that might throw an exception, like checking if a file exists
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + filePath);
            }

        } catch (FileNotFoundException e) {
            // Handle the exception if the file wasn't found
            System.err.println("Error: File not found: " + filePath);
            // Perform alternative actions or log the error
        }

        Scanner scanner = new Scanner(file);
        StringBuilder content = new StringBuilder();

        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine() + "\n"); // Add newline for each line
        }

        scanner.close();

        System.out.println("File contents:");
        System.out.println(content);
    }

}

package com.reference.codereference.parsing.jsonparsing;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsing {

    public static void jsonParsingExample() {
        // JSON string representing a fruit
        String jsonString = "{\"name\":\"Apple\", \"color\":\"Red\"}";

        // Create an instance of ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Parse JSON string to Fruit object
            Fruit fruit = objectMapper.readValue(jsonString, Fruit.class);

            // Print parsed values
            System.out.println("Name: " + fruit.getName()); // lombok getter 설정을 해야 한다.
            System.out.println("Color: " + fruit.getColor()); // lombok getter 설정을 해야 한다.

        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }
    }

}

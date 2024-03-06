package com.reference.codereference.etc.hash.map;

public class HashMap {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        java.util.HashMap<String, String> capitalCities = new java.util.HashMap<String, String>();

        String Name = "이름";
        String Value = "김승현";

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put(Name, Value);

        System.out.println(capitalCities);
    }
}

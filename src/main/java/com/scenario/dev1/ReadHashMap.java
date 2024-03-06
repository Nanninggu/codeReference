package com.scenario.dev1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ReadHashMap {
    public static void main(String[] args) throws Exception {
        String filePath = "data.txt"; // Replace with your file path

        Map<String, String> map = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Handle potentially empty lines or lines without `=`
                if (line.isEmpty() || !line.contains("=")) {
                    System.err.println("Skipping empty/invalid line: " + line);
                    continue;
                }

                // Split line based on `\r`, allowing optional whitespace:
                String[] parts = line.split("\\r\\s*=");

                System.out.println(parts);

                // Ensure we have key and value after splitting
                if (parts.length != 1) {
                    System.out.println(parts.length);
                    System.err.println("Invalid line format: " + line);
                    continue;
                }

                // Trim key and value for better handling
                String key = parts[0].trim();
                System.out.println(key);
                String value = parts[0].trim();
                System.out.println(value);

                // Add to map (replace if key exists)
                map.put(key, value);
                System.out.println(map.put(key, value));
                String aa = map.put(key, value);
                // Map Data txt File save
                FileSaveFotMapData.mapDataSaveForFile(System.lineSeparator());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print or use the map as needed
        System.out.println(map);
        FileSaveFotMapData.mapDataSaveForFile(map.toString());
    }
}

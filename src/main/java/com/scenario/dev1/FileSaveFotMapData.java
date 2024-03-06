package com.scenario.dev1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileSaveFotMapData {

    public static void mapDataSaveForFile (String data) {

        String myString = data;

        try (PrintWriter writer = new PrintWriter("my_file.txt")) {
            writer.write(myString);
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            e.printStackTrace();
        }

    }

}

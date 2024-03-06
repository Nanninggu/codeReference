package com.scenario.dev1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadFolderFiles {

    public static String readAndFindStringToReturn() throws IOException {
        // Replace "path/to/folder" with the actual folder path
        String folderPath = "path/forder";
        /**
         * path/는 현재 해당 코드가 존재하는 디폴트 코드를 의미한다.
         * path/를 빼면 입력된 경로를 바라본다.
         * path/를 넣었을때.
         * CanonicalFile C:\Users\김승현\Desktop\주요 작업\Example-Code-reference\codeReference\path\forder
         * AbsoluteFile C:\Users\김승현\Desktop\주요 작업\Example-Code-reference\codeReference\path\forder
         * path/를 뺐을때.
         * C:\TEST
         * C:\TEST
         */

        // Create a list to store file contents
        List<String> fileContents = new ArrayList<>();

        // Get the folder object
        File folder = new File(folderPath);
        System.out.println("CanonicalFile " + folder.getCanonicalFile());
        System.out.println("AbsoluteFile " + folder.getAbsoluteFile());

        // Check if the folder exists
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Error: Folder not found or not a directory.");
            return folderPath;
        }

        // Iterate over all files in the folder
        for (File file : folder.listFiles()) {
            if (!file.isDirectory()) {
                String filePath = file.getAbsolutePath();
                try {

                    /** Map에 담기 테스트 */
                    String contentToMap = Files.readString(Paths.get(filePath));





                    /** main code */
                    String content = Files.readString(Paths.get(filePath));
                    System.out.println(content);
                    if (content.contains("팔라딘")) {
                        System.out.println("Paladin 을 그립니다.");
                        try {
                            Thread.sleep(3000); // Sleep for 3 second
                        } catch (InterruptedException e) {
                        }
                        FilePrint.printPaladin();
                    }
                    if (content.contains("스폰지밥")) {
                        System.out.println("스폰지밥 을 그립니다.");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                        }
                        FilePrint.printSpongeBob();
                    }
                    if (content.contains("머쉬룸")) {
                        System.out.println("Mushroom 을 그립니다.");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                        }
                        FilePrint.printMushRoom();
                    }
                    if (content.contains("끝")) {
                        System.out.println("마지막 END를 그립니다.");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                        }
                        FilePrint.printEnd();
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                        }
                    }
                    fileContents.add(content);
                } catch (FileNotFoundException e) {
                    System.out.println("Error: File not found: " + filePath);
                } catch (IOException e) {
                    System.out.println("Error: Error reading file: " + filePath);
                    e.printStackTrace();
                }
            }
        }

        // Process the list of file contents
        System.out.println("Read file contents:");
        for (String content : fileContents) {
            System.out.println(content);
        }
        return "정상적으로 수행 되었습니다.";
    }
}

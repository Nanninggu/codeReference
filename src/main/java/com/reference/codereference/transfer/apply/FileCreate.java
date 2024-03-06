package com.reference.codereference.transfer.apply;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    /**
    특정 폴더에서
     파일을 1000개 만드는 함수
     */
    public static void createFile() {
        String directoryPath = "file/"; // Change this to the directory where you want to create the files

        try {
            for (int i = 1; i <= 1000; i++) {
                String fileName = "file" + i + ".txt";
                String filePath = directoryPath + fileName;
                File file = new File(filePath);

                if (file.createNewFile()) {
                    System.out.println("File created: " + fileName);
                } else {
                    System.out.println("File already exists: " + fileName);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the files.");
            e.printStackTrace();
        }
    }
}

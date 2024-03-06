package com.reference.codereference.transfer.apply;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class WriteAllData {
    public static void writeAllData() {
        String serverAddress = "127.0.0.1"; // Change this to your server's IP address
        int serverPort = 12345; // Change this to your server's port
        String folderPath = "file/"; // Change this to the path of your folder
        String filePath = "file/";

        File folder = new File(folderPath);

        // Check if the given path is a directory
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();

            // Loop through each file in the directory
            if (files != null) {
                for (File file : files) {
                    // Check if the file is a regular file (not a directory)
                    if (file.isFile()) {
                        System.out.println("File found: " + file.getName());

                        //----------------------------------------------------

                        try {
                            Socket socket = new Socket(serverAddress, serverPort);
                            OutputStream outputStream = socket.getOutputStream();
                            FileInputStream fileInputStream = new FileInputStream(folderPath);

                            byte[] buffer = new byte[4096];
                            int bytesRead;

                            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                                outputStream.write(buffer, 0, bytesRead);
                            }

                            fileInputStream.close();
                            outputStream.close();
                            socket.close();

                            System.out.println("File sent successfully.");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        //-----------------------------------------------------

                    }
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The given path is not a directory.");
        }
    }
}

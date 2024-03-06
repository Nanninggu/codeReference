package com.reference.codereference.transfer.apply;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 12345; // Change this to the port you want to listen on

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Waiting for a client to connect...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            InputStream inputStream = clientSocket.getInputStream();

            FileOutputStream fileOutputStream = new FileOutputStream("received_file.txt"); // Change this to the path where you want to save the received file

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            fileOutputStream.close();
            inputStream.close();
            clientSocket.close();
            serverSocket.close();

            System.out.println("File received successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
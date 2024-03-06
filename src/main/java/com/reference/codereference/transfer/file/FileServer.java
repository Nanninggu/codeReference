package com.reference.codereference.transfer.file;

import java.io.*;
import java.net.*;

/**
 서버 역할을 하는 기능
 사용방법은 Client 와 Server 가 정상적으로
 커넥션이 가능한지 확인 할 수 있다.
 그래서 초기 인프라 구성시 TCP/IP 연결 구간이 있다면,
 커넥션 연결 테스트를 진행 할 수 있다.
 */

public class FileServer {
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

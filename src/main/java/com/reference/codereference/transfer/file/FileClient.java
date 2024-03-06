package com.reference.codereference.transfer.file;

import java.io.*;
import java.net.*;

/**
 클라이언트 역할을 하는 기능
 사용방법은 Client 와 Server 가 정상적으로
 커넥션이 가능한지 확인 할 수 있다.
 그래서 초기 인프라 구성시 TCP/IP 연결 구간이 있다면,
 커넥션 연결 테스트를 진행 할 수 있다.
 */


public class FileClient {
    public static void main(String[] args) throws IOException {
        String serverAddress = "127.0.0.1"; // Change this to your server's IP address
        int serverPort = 12345; // Change this to your server's port

        File file = new File("file/send_file.txt");

        String fileLocation = file.toString();
        String filePath = fileLocation; // Change this to the path of the file you want to send

        // 파일 경로 체크
        System.out.println("파일의 절대 패스 경로 → " + file.getAbsoluteFile());
        System.out.println("파일의 상대 패스 경로 → " + file.getCanonicalFile());


        try {
            Socket socket = new Socket(serverAddress, serverPort);
            OutputStream outputStream = socket.getOutputStream();
            FileInputStream fileInputStream = new FileInputStream(filePath);

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
    }
}

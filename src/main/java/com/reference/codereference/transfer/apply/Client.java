package com.reference.codereference.transfer.apply;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverAddress = "127.0.0.1"; // Change this to your server's IP address
        int serverPort = 12345; // Change this to your server's port

        //파일을 1천개 만든다. 파일로 1천개 만들걸 서버에서 읽어서 뿌린다.
        FileCreate.createFile();

        File file = new File("file/send_file.txt");

        String fileLocation = file.toString();
        String filePath = fileLocation; // Change this to the path of the file you want to send

        // 파일 경로 체크
        System.out.println("파일의 절대 패스 경로 → " + file.getAbsoluteFile());
        System.out.println("파일의 상대 패스 경로 → " + file.getCanonicalFile());


        // 모든 파일을 읽고 특정 경로에 읽을 파일을 쓴다.
//        WriteAllData.writeAllData();

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
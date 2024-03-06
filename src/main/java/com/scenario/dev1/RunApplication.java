package com.scenario.dev1;

import java.io.IOException;

public class RunApplication {

    public static void main(String[] args) throws IOException {

        ReadFolderFiles readFolderFiles = new ReadFolderFiles();
        ReadFolderFiles.readAndFindStringToReturn();
        System.out.println("애플리케이션이 실행 되었습니다.");
    }

}

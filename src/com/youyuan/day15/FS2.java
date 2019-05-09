package com.youyuan.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FS2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("bbb.txt");
        int fisData;
        while ( (fisData = fis.read()) != -1 ){
            System.out.println(fisData);
        }

        fis.close();


    }
}

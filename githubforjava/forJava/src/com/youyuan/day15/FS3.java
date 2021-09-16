package com.youyuan.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FS3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day04.iml");
        FileOutputStream fos = new FileOutputStream("copy.iml", true);
        int data;
        while ( (data = fis.read()) != -1){
            fos.write(data);
        }
        fis.close();;
        fos.close();


    }
}

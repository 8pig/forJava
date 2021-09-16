package com.youyuan.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FS7 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("copy.txt");
        FileInputStream fis = new FileInputStream("a.txt");
        byte[] arr = new byte[2];
        int arrlen;
        while (( arrlen = fis.read(arr)) != -1 ){
            fos.write(arr, 0,arrlen);

        }


        fis.close();
        fos.close();


    }
}

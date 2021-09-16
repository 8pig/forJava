package com.youyuan.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FS6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt"); // get io
        FileOutputStream fos = new FileOutputStream("copy.txt");
        byte[] arr = new byte[2];   // create arr

        int a;


        while ((a = fis.read(arr)) != -1){
            fos.write(arr, 0, a);
        }

        fis.close();
        fos.close();









    }
}

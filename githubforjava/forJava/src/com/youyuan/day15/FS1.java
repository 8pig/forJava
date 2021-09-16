package com.youyuan.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FS1 {
    public static void main(String[] args) throws IOException {
        File file = new File("bbb.txt");
        System.out.println(file.exists());
        FileInputStream fis = new FileInputStream(file);
        int x = fis.read();
        System.out.println(x);
        fis.close();

    }
}

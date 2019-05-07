package com.youyuan.day14;

import java.io.File;
import java.io.IOException;

public class F4 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("aadf4");
        System.out.println(file1.mkdir());
        File file2 = new File("aaadf4\\ddd");
        System.out.println(file2.mkdirs());
        File file3 = new File(file2, "fff.txt");
        System.out.println(file3.mkdirs());
        File file4 = new File(file2, "aaa.ddd");
        System.out.println(file4.createNewFile());



    }
}

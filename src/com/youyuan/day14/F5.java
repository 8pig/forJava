package com.youyuan.day14;

import java.io.File;
import java.util.ArrayList;

public class F5 {
    public static void main(String[] args) {
        File file = new File("aaadf4\\ddd\\aaa.ddd");
        System.out.println(file.delete());

        File file1 = new File("bbb.txt");
        File file2 = new File("dada\\xxx.txt");
        file1.renameTo(file2);
        File file3 = new File("./");
        File[] arr = file3.listFiles();
        ArrayList<File> f1 = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            f1.add(arr[i]);
        }
        System.out.println(f1);

    }
}

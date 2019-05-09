package com.youyuan.day16;
import java.io.*;
import java.util.Scanner;
public class CopyFile {
    public static void main(String[] args) throws IOException {

        File file = getFile();
        BufferedInputStream bif = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bof = new BufferedOutputStream(new FileOutputStream(file.getName()));

        int d;
        while ((d = bif.read()) != -1){
            bof.write(d);
        }
        bif.close();
        bof.close();
    }
    public static File getFile(){
        System.out.println("请输入一个路径");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);

        while (true){
            if(!file.exists()){
                System.out.println("路径不存在, 请重新输入");
            }else if(file.isDirectory()){
                System.out.println("您输入的是文件夹路径, 请重新输入");
            }else {
                return file;
            }
        }
    }
}

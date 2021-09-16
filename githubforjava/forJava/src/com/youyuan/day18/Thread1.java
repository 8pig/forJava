package com.youyuan.day18;

public class Thread1 {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        my1.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("b");

        }
    }

}
class MyThread extends Thread{

    public void run (){
        for (int i = 0; i < 10000; i++) {
            System.out.println("a");

        }

    }

}

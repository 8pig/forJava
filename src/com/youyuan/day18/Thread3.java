package com.youyuan.day18;

public class Thread3 {

    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();
        Thread tr = new Thread(m1);
        tr.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("bbb");

        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000 ; i++){
            System.out.println("aaa");
        }

    }
}

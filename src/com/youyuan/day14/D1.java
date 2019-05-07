package com.youyuan.day14;

public class D1 {
    public static void main(String[] args) {
        int a;
        int b;
        int[] arr = {1,2,3,4,5};
        try {
            System.out.println(arr[10]);
        }catch (ArithmeticException e){
            System.out.println("a");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index ");
        }
    }
}

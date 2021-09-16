package com.youyuan.day04.demo01;

public class Animal {
    private int legLen;
    private String hairColor;

    public int getLegLen() {
        return legLen;
    }

    public void setLegLen(int legLen) {
        this.legLen = legLen;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public void eat (){
        System.out.println("动物正在吃饭");
    }
}

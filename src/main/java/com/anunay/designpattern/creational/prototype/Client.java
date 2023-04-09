package com.anunay.designpattern.creational.prototype;

public class Client {
    public static void main(String[] args) {
        IntelligentStudent is = new IntelligentStudent("anunay","anusu90@gmail.com");
        IntelligentStudent copy_is = is.clone();
    }
}

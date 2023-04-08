package com.anunay.constructor;

public class Client {
    public static void main(String[] args){
        Student anunay = new Student("Anunay Sinha");
        Student anunay_copy = new Student(anunay);
    }
}

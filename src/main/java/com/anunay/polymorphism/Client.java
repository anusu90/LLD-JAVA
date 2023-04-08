package com.anunay.polymorphism;

public class Client {
    public static void main(String[] args){
        User u = new Student();
        u.changePassword("newPass");
    }
}

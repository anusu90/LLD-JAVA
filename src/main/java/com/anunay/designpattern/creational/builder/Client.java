package com.anunay.designpattern.creational.builder;

public class Client {
    public static void main(String[] args) {
        Student  st = Student.getBuilder().setName("ANUNAY").setAge(32).setPsp(90.2).setEmail("").setBatch("OCT_21").build();

    }
}

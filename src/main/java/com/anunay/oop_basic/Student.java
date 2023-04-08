package com.anunay.oop_basic;

public class Student {
    int id;
    String name;
    String gender;
    String batch;
    int age;

    void changeBatch(String newBatch){
        batch=newBatch;
    }
    void pauseCourse(){
        batch=null;
        System.out.println("Course Paused\n");
    }
}

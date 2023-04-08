package com.anunay.access_modifier;

public class Student {
    private int id;
    String name;
    protected String gender;
    public String batch;
    public int age;

    public void changeBatch(String newBatch){
        batch=newBatch;
    }
    private void pauseCourse(){
        batch=null;
        System.out.println("Course Paused\n");
    }
}

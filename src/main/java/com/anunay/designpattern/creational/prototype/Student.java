package com.anunay.designpattern.creational.prototype;

public class Student implements ClonableInterface<Student>{
    public String name;
    private String email;

    public Student(){}

    public Student(String name,String email){
        this.name=name;
        this.email=email;
    }

    public Student(Student st){
        this.name=st.name;
        this.email=st.email;
    }
    public Student clone(){
        return new Student(this);
    }
}

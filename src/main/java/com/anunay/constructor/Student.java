package com.anunay.constructor;

public class Student {
    private int id;
    public String name="default_name";
    public int age;

//    We need the following to use copy constructor
    public Student(){};
    public Student(String name){
        System.out.println("Argument name is " +name);
        System.out.println("Instance name is " +this.name);
        this.name=name;
    }

    public Student(Student st){
        id=st.id+1;
        name=st.name;
        age=st.age;
    }

}

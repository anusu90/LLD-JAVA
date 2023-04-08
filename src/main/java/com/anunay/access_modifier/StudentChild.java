package com.anunay.access_modifier;

public class StudentChild extends Student{
    void doSomething(String newName){
        name=newName;
    }

    void doSomething(Student st){
        System.out.println(st.age+st.batch+st.name+st.gender);
    }

}

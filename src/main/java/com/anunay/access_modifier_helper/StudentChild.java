package com.anunay.access_modifier_helper;

import com.anunay.access_modifier.Student;

public class StudentChild extends Student {
    void doSomething(){
        age=12;
        gender="M";
    }
    void doSomething(Student st){
        System.out.println(st.age+st.batch);
    }
    void doSomethings(){
        Student st = new Student();
        System.out.println((st.age+st.batch));
    }

}

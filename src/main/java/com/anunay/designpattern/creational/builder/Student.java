package com.anunay.designpattern.creational.builder;

import java.security.InvalidParameterException;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String email;
    private String batch;

    private Student(Builder studentBuilder){
        this.name=studentBuilder.name;
        this.age=studentBuilder.age;
        this.batch=studentBuilder.batch;
        this.psp=studentBuilder.psp;
        this.email=studentBuilder.email;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private int age;
        private double psp;
        private String email;
        private String batch;

        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setAge(int age){
            this.age=age;
            return this;
        }
        public Builder setPsp(double psp){
            this.psp = psp;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        private boolean validate(){
            if(this.age<18){
               return false;
            }
            return true;
        }

        public Student build(){
            if(!validate()){
                throw new InvalidParameterException("");
            }
            return new Student(this);
        }
    }
}

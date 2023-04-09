package com.anunay.designpattern.creational.prototype;

public class IntelligentStudent extends Student {
    boolean isIntelligent;

    public IntelligentStudent(String name,String email){
        super(name,email);

    }
    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.isIntelligent= is.isIntelligent;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}

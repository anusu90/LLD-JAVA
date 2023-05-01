package com.anunay.designpattern.creational.factory.before;

public interface Database {
    void setUrl();
    void makeConnection();

    DbType getType();

}

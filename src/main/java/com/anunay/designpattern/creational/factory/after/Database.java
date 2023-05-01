package com.anunay.designpattern.creational.factory.after;

public interface Database {
    void setUrl();
    void makeConnection();

    DbType getType();

    Query createQuery();

}

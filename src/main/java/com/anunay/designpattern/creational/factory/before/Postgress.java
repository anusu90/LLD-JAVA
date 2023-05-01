package com.anunay.designpattern.creational.factory.before;

public class Postgress implements Database{

    public DbType dbType = DbType.POSTGRESS;
    @Override
    public void setUrl() {

    }

    @Override
    public void makeConnection() {

    }

    @Override
    public DbType getType() {
        return this.dbType;
    }
}

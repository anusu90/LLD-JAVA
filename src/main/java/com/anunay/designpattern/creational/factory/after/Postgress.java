package com.anunay.designpattern.creational.factory.after;

public class Postgress implements Database {

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

    @Override
    public Query createQuery() {
        return new PostgressQuery();
    }
}

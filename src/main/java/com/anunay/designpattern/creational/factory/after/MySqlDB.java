package com.anunay.designpattern.creational.factory.after;

public class MySqlDB implements Database {

    public DbType dbType = DbType.MYSQL;

    @Override
    public void setUrl() {

    }

    @Override
    public void makeConnection() {

    }

    @Override
    public DbType getType() {
        return dbType;
    }

    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}

package com.anunay.designpattern.creational.factory.after;

public class Client {
    Database db;

    public Client(Database db){
        this.db=db;
    }

    void registeruser(){
        Query query = db.createQuery();
    }

}

package com.anunay.designpattern.creational.factory.before;

public class Client {
    Database db;

    public Client(Database db){
        this.db=db;
    }

    void registeruser(){
        Query query;
        if(db.getType()==DbType.MYSQL){
            query = new MySqlQuery();
        } else if (db.getType()== DbType.POSTGRESS) {
            query = new PostgressQuery();
        }
    }

}

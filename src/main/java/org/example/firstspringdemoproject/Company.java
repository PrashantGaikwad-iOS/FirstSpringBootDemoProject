package org.example.firstspringdemoproject;

public class Company {
    MySQLDB mySQLDB;

    public Company(MySQLDB mySQLDB) {
        this.mySQLDB = mySQLDB;
    }

    public void dbUsing() {
        System.out.println(mySQLDB.toString());
    }
}

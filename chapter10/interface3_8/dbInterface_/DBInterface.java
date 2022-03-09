package com.chapter10.interface3_8.dbInterface_;

public interface DBInterface {

    public void connect();
    public void close();
}

class MysqlDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("打开MySQL");
    }
    @Override
    public void close() {
        System.out.println("关闭MySQL");
    }
}

class OracleDB implements DBInterface{

    @Override
    public void connect() {
        System.out.println("打开Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracl");
    }
}


package com.chapter10.interface3_8.dbInterface_;

public class Interface03 {

    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        OracleDB oracleDB = new OracleDB();
        work(mysqlDB);
        work(oracleDB);
    }

    public static void work(DBInterface dbInterface){
        dbInterface.close();
        dbInterface.connect();
    }
}

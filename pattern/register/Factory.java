package com.example.xu.myapplication.pattern.register;

/**
 * 工厂类
 */
public class Factory {

    public static final String MYSQL = "MySql";
    public static final String ORACLE = "Oracle";

    public static Database getDatabase(String key) {
        Database value = Register.get(key);
        if (value == null) {
            value = createDatabase(key);
            Register.set(key, value);
        }
        return value;
    }

    private static Database createDatabase(String key) {
        Database database = null;
        if (MYSQL.equalsIgnoreCase(key)) {
            database = MySql.getInstance();
        } else if (ORACLE.equalsIgnoreCase(key)) {
            database = Oracle.getInstance();
        }
        return database;
    }
}

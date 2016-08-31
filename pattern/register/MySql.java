package com.example.xu.myapplication.pattern.register;

/**
 * Created by xu on 2016/8/31.
 */
public class MySql implements Database {

    private MySql() {
    }

    public static MySql getInstance() {
        return MySqlHolder.SINGLETON;
    }

    private static class MySqlHolder {
        private static final MySql SINGLETON = new MySql();
    }
}

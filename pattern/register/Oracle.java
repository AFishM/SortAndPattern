package com.example.xu.myapplication.pattern.register;

/**
 * Created by xu on 2016/8/31.
 */
public class Oracle implements Database {

    private Oracle() {
    }

    public static Oracle getInstance() {
        return OracleHolder.SINGLETON;
    }

    private static class OracleHolder {
        private static final Oracle SINGLETON = new Oracle();
    }
}

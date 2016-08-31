package com.example.xu.myapplication.pattern.register;

/**
 * Created by xu on 2016/8/31.
 */
public class TestRegister {
    public static void main(String[] args) {
        Factory.getDatabase(Factory.MYSQL);
        Factory.getDatabase(Factory.ORACLE);

        Database db1 = Register.get(Factory.MYSQL);
        Database db2 = Register.get(Factory.ORACLE);
        if(db1!=null){
            System.out.println(db1.getClass().getSimpleName());
        }
        if(db2!=null){
            System.out.println(db2.getClass().getSimpleName());
        }
    }
}

package com.example.xu.myapplication.pattern.adapter;

/**
 * Created by xu on 2016/8/30.
 */
public class TestAdapter {
    public static void main(String[] args){
        Adaptee adaptee=new Adaptee();
        Adapter adapter=new Adapter(adaptee);
        System.out.print(adapter.sayChineseHello());
    }
}

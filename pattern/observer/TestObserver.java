package com.example.xu.myapplication.pattern.observer;

/**
 * Created by xu on 2016/8/31.
 */
public class TestObserver {
    public static void main(String[] args){
        Coder coder1=new Coder();
        Coder coder2=new Coder();

        Boss boss=new Boss();
        boss.register(coder1);
        boss.register(coder2);

        boss.notifyObserver();
    }
}

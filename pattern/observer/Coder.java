package com.example.xu.myapplication.pattern.observer;

/**
 * 程序员作为观察者
 */
public class Coder implements Observer {
    @Override
    public void update() {
        System.out.println("写代码");
    }
}

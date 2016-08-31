package com.example.xu.myapplication.pattern.observer;

/**
 * 通知者抽象接口
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver();
}

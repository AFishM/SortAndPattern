package com.example.xu.myapplication.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 老板做为通知者
 */
public class Boss implements Subject {
    List<Observer> observerList=new ArrayList<>();
    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observerList){
            observer.update();
        }
    }
}

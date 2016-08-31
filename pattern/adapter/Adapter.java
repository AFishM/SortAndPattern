package com.example.xu.myapplication.pattern.adapter;

/**
 * 适配器
 */
public class Adapter implements Target{
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public String sayChineseHello() {
        String word=adaptee.sayHello();
        if(word.equals("hello")){
            return "你好";
        }
        return null;
    }
}

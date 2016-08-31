package com.example.xu.myapplication.pattern.register;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册树
 */
public class Register {
    private static Map<String, Database> treeMap;

    public static Database get(String key) {
        if (treeMap == null) {
            return null;
        }
        return treeMap.get(key);
    }

    public static void set(String key, Database value) {
        if (treeMap == null) {
            treeMap = new HashMap<>();
        }
        treeMap.put(key, value);
    }
}


package com.veselov.alex;

/**
 * Not threadsafe
 */
public class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (SimpleSingleton.instance == null) {
            SimpleSingleton.instance = new SimpleSingleton();
        }
        return instance;
    }
}

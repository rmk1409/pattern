package com.veselov.alex;

/**
 * Can be timeconsuming
 * Can reduce time resources, the threads will be waiting in the queue, but in fact synchronization is needed only once
 */
public class TheEasiestThreadSafeSingleton {
    private static TheEasiestThreadSafeSingleton instance;

    private TheEasiestThreadSafeSingleton() {
    }

    public static synchronized TheEasiestThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new TheEasiestThreadSafeSingleton();
        }
        return instance;
    }
}

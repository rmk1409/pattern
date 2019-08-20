package com.veselov.alex;

/**
 * Can be resource consuming due to lack of lazy initialization
 */
public class ImmediateInitializationSingleton {
    private static ImmediateInitializationSingleton instance = new ImmediateInitializationSingleton();

    private ImmediateInitializationSingleton() {
    }


    public static ImmediateInitializationSingleton getInstance() {
        return instance;
    }
}

package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        SimpleSingleton singleton = SimpleSingleton.getInstance();

        System.out.println(singleton.equals(SimpleSingleton.getInstance()));
        System.out.println(singleton == SimpleSingleton.getInstance());
        System.out.println(singleton == SimpleSingleton.getInstance());
        System.out.println(singleton == SimpleSingleton.getInstance());
        System.out.println(singleton == SimpleSingleton.getInstance());
    }
}

package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        Facade facade = new Facade(new Component(), new Component2(), new ComponentN());

        facade.m();
        facade.someWork();
    }
}

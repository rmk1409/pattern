package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        Target target1 = new ConcreteAdapter1(new Adaptee1());
        Target target2 = new ConcreteAdapter2(new Adaptee2());

        target1.execute();
        target2.execute();
    }
}

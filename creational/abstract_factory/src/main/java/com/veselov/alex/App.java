package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();

        System.out.println(factory.getA());
        System.out.println(factory.getB());

        factory = new ConcreteFactoryN();

        System.out.println(factory.getA());
        System.out.println(factory.getB());
    }
}

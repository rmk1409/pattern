package com.veselov.alex;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA getA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB getB() {
        return new ConcreteProductB1();
    }
}

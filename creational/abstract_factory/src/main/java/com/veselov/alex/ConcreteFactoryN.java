package com.veselov.alex;

public class ConcreteFactoryN implements AbstractFactory {
    @Override
    public AbstractProductA getA() {
        return new ConcreteProductAN();
    }

    @Override
    public AbstractProductB getB() {
        return new ConcreteProductBN();
    }
}

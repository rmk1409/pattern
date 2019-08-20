package com.veselov.alex;

public class ConcreteCreator2 extends Creator{
    @Override
    public Product getProduct() {
        return new ConcreteProduct2();
    }
}

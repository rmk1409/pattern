package com.veselov.alex;

public class ConcreteCreator extends Creator {
    @Override
    public Product getProduct() {
        return new ConcreteProduct();
    }
}

package com.veselov.alex;

public class ConcreteAdapter2 implements Target {
    private Adaptee2 adaptee;

    public ConcreteAdapter2(Adaptee2 adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void execute() {
        this.adaptee.b();
    }
}

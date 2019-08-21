package com.veselov.alex;

public class ConcreteAdapter1 implements Target {
    private Adaptee1 adaptee;

    public ConcreteAdapter1(Adaptee1 adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void execute() {
        this.adaptee.a();
    }
}

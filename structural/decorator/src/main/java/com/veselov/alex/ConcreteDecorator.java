package com.veselov.alex;

public class ConcreteDecorator extends Decorator {
    ConcreteDecorator(Component comp) {
        super(comp);
    }

    @Override
    public void execute() {
        System.out.println("Add decorator logic before...");
        this.comp.execute();
        System.out.println("Add decorator logic after...");
    }
}

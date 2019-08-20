package com.veselov.alex;

public class HelloDecorator extends Decorator {
    HelloDecorator(Component comp) {
        super(comp);
    }

    @Override
    public void execute() {
        System.out.println("Hello...");
        this.comp.execute();
    }
}

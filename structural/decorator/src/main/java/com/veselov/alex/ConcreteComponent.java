package com.veselov.alex;

public class ConcreteComponent implements Component {
    @Override
    public void execute() {
        System.out.println("Component logic is executing...");
    }
}

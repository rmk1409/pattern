package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        AbstractEntity entity = new ConcreteEntity();
        entity.templateMethod();

        System.out.println("------------------");
        entity = new ConcreteEntity2();
        entity.templateMethod();
    }
}

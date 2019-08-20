package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();

        System.out.println(creator.getProduct());

        creator = new ConcreteCreator2();
        System.out.println(creator.getProduct());
    }
}

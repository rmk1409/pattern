package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new HelloStrategy());
        context.doSomething();

        context.setStrategy(new ByeStrategy());
        context.doSomething();
    }
}

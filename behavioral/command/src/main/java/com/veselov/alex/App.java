package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.setCmd1(new Command1(new Receiver1()));

        Receiver2 receiver2 = new Receiver2();
        invoker.setCmd2(new Command2(receiver2));
        invoker.setCmd3(new Command3(receiver2));

        invoker.doWork1();
        invoker.doWork2();
        invoker.doWork3();
    }
}

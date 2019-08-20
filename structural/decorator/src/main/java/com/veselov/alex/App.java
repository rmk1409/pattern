package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        // create component
        Component comp = new ConcreteComponent();
        comp.execute();
        printHR();

        // wrap the component into decorator, it gives new behavioral aspects
        Component dec = new ConcreteDecorator(comp);
        dec.execute();

        printHR();
        // wrap the decorator into other decorator to add more new behavioral aspects dynamically
        Component helloDec = new HelloDecorator(dec);
        helloDec.execute();
    }

    private static void printHR(){
        System.out.println("--------------------");
    }
}

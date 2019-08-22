package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        Component component = new Composite();

        component.add(new Leaf());

        Component composite = new Composite();
        composite.add(new Leaf());
        composite.add(new Leaf());
        component.add(composite);

        component.add(new Leaf());

        component.execute();
    }
}

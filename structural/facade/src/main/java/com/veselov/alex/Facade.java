package com.veselov.alex;

public class Facade {
    private Component component;
    private Component2 component2;
    private ComponentN componentN;

    public Facade(Component component, Component2 component2, ComponentN componentN) {
        this.component = component;
        this.component2 = component2;
        this.componentN = componentN;
    }

    void m(){
        this.component.m();
        this.component2.m();
        this.componentN.m();
    }

    void someWork(){
        this.component.m2();
        this.component.m3();

        this.componentN.m2();
    }
}

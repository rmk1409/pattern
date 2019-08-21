package com.veselov.alex;

public class ConcreteEntity extends AbstractEntity {
    @Override
    void step2() {
        System.out.println("***Concrete Entity Step2***");
    }

    @Override
    void step4() {
        System.out.println("***Concrete Entity Step4***");
    }
}

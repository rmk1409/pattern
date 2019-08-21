package com.veselov.alex;

public abstract class AbstractEntity {
    void templateMethod(){
        this.step1();
        this.step2();
        this.step3();
        this.step4();
        this.step5();
    }

    void step1() {
        System.out.println("...Step1...");
    }

    abstract void step2();

    void step3() {
        System.out.println("...Step3...");
    }

    abstract void step4();

    void step5() {
        System.out.println("...Step5...");
    }
}

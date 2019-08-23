package com.veselov.alex;

import java.util.Date;

public class BigConcreteService implements Service {
    public BigConcreteService() {
        System.out.println("Moment of creating service: " + new Date());
    }

    @Override
    public void execute() {
        System.out.println("Logic of big service...");
    }
}

package com.veselov.alex;

public class LazyInitializationProxy implements Service {
    private Service service;

    public LazyInitializationProxy() {
    }

    @Override
    public void execute() {
        if (service == null) {
            service = new BigConcreteService();
        }

        this.service.execute();
    }
}

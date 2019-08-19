package com.veselov.alex;

public class PrintObserver implements Observer {
    private Subject sub;

    public PrintObserver(Subject sub) {
        this.sub = sub;
    }

    public void update(String data) {
        System.out.println(data);
    }
}

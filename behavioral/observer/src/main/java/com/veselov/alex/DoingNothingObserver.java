package com.veselov.alex;

public class DoingNothingObserver implements Observer {
    private Subject sub;

    public DoingNothingObserver(Subject sub) {
        this.sub = sub;
    }

    public void update(String data) {
        // nothing
    }
}

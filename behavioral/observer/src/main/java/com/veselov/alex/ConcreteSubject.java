package com.veselov.alex;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> obsList = new ArrayList<>();
    private String state;

    public void addObserver(Observer obs) {
        this.obsList.add(obs);
    }

    public void removeObserver(Observer obs) {
        this.obsList.remove(obs);
    }

    public void notifyObservers() {
        this.obsList.forEach((item)->{
            item.update(state);
        });
    }

    public void setState(String state) {
        this.state = state;
        this.notifyObservers();
    }
}

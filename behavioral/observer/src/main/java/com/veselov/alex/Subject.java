package com.veselov.alex;

public interface Subject {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();

    void setState(String newState);
}

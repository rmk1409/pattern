package com.veselov.alex;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void remove();
}

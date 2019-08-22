package com.veselov.alex;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private int position = 0;
    private List<T> items;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.items.size();
    }

    @Override
    public T next() {
        return this.items.get(this.position++);
    }

    @Override
    public void remove() {
        this.items.remove(this.position);
    }
}

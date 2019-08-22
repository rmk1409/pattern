package com.veselov.alex;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterable implements Iterable<Integer>{
    List<Integer> container = new ArrayList<>();

    @Override
    public Iterator<Integer> iterator() {
        return new ConcreteIterator<>(container);
    }
}

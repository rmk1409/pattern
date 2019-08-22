package com.veselov.alex;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Iterable<Integer> iterable = new ConcreteIterable();

        ((ConcreteIterable) iterable).container.add(0);
        ((ConcreteIterable) iterable).container.add(5);
        ((ConcreteIterable) iterable).container.add(10);

        // check hasNext(), next()
        Iterator<Integer> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------");

        // check remove
        iterator = iterable.iterator();
        iterator.next();
        iterator.remove();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

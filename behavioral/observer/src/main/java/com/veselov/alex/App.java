package com.veselov.alex;

public class App {
    public static void main(String[] args) {
        // create Subject
        Subject sub = new ConcreteSubject();

        // Add Observers
        PrintObserver obs1 = new PrintObserver(sub);
        sub.addObserver(obs1);
        PrintObserver obs2 = new PrintObserver(sub);
        sub.addObserver(obs2);

        DoingNothingObserver obs3 = new DoingNothingObserver(sub);
        sub.addObserver(obs3);

        // change Subject state
        sub.setState("Fist State");
        // change Subject state
        sub.setState("2nd State");

        // remove some Observers
        sub.removeObserver(obs2);
        sub.removeObserver(obs3);

        // change Subject state
        sub.setState("3rd State");
    }
}

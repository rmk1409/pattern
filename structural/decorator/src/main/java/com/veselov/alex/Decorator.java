package com.veselov.alex;

public abstract class Decorator implements Component {
    Component comp;

    public Decorator(Component comp) {
        this.comp = comp;
    }
}

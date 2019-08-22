package com.veselov.alex;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    List<Component> children = new ArrayList<>();

    @Override
    void execute() {
        System.out.println("In composite node");
        children.forEach((it)->{
            it.execute();
        });
    }

    @Override
    void add(Component newElement) {
        this.children.add(newElement);
    }

    @Override
    void remove(int index) {
        this.children.remove(index);
    }

    @Override
    List<Component> getChildren() {
        return this.children;
    }
}

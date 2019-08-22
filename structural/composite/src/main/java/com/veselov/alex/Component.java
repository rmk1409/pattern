package com.veselov.alex;

import java.util.List;

public class Component {
    void execute(){
        throw new UnsupportedOperationException();
    }
    void add(Component newElement){
        throw new UnsupportedOperationException();
    }
    void remove(int index){
        throw new UnsupportedOperationException();
    }
    List<Component> getChildren(){
        throw new UnsupportedOperationException();
    }
}

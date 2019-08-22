package com.veselov.alex;

public class EatState implements State {
    private Context context;

    public EatState(Context context) {
        this.context = context;
    }

    @Override
    public void execute() {
        System.out.println("Eat");
        this.context.setCurrentState(this.context.getWorkState());
    }
}

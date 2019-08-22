package com.veselov.alex;

public class WorkState implements State {
    private Context context;
    private int quantity = 0;

    public WorkState(Context context) {
        this.context = context;
    }

    @Override
    public void execute() {
        System.out.println("Work");

        State nextState = this.context.getEatState();
        if (this.quantity++ == 5) {
            this.quantity = 0;
            nextState = this.context.getSleepState();
        }
        this.context.setCurrentState(nextState);
    }
}

package com.veselov.alex;

public class SleepState implements State {
    private Context context;

    public SleepState(Context context) {
        this.context = context;
    }

    @Override
    public void execute() {
        System.out.println("-------- Sleep ------------");
        this.context.setCurrentState(this.context.getWorkState());
    }
}
